import csv
import itertools
import random
import datetime
import subprocess


# randomly select rows from a csv
def random_sample(fp, sample_size=100):
    fp.seek(0)
    reader = csv.reader(fp)
    result = list(itertools.islice(reader, sample_size))
    random.shuffle(result)
    for i, row in enumerate(reader, sample_size):
        r = random.randint(0, 3*sample_size) # every remaining entry has a 1/3 chance of replacing a random index
        if r < sample_size:
            result[r] = row
    return result


def main():
    original_data_file = 'Eartquakes-1990-2023.csv'
    synthetic_data_file = 'Eartquakes-1990-2023-synthetic.csv'
    sample_size = 1000
    selected_row_count = 10

    with open(synthetic_data_file, encoding='utf-8') as fp:
        print(f'Selecting random sample from {synthetic_data_file} of {sample_size} rows')
        sample = random_sample(fp, sample_size=sample_size)

        now = datetime.datetime.now().timestamp() * 1000
        print('Asserting data is withing acceptable limits')
        for row in sample:
            timestamp = int(row[0])
            longitude = float(row[8])
            latitude = float(row[9])
            magnitude = float(row[6])

            assert timestamp < now, f'Future timestamp found in sample row:: timecheck {timestamp} < {now}: [{row}]'
            assert longitude >= -180 and longitude <= 180, f'Bad longitude found in sample row:: longitude - {longitude}: [{row}]'
            assert latitude >= -90 and latitude <= 90, f'Bad latitude found in sample row:: latitude - {latitude}: [{row}]'
            assert magnitude <= 10, f'Bad magnitude found in sample row:: magnitude {magnitude}: [{row}]'
        
        print(f'Selecting {selected_row_count} random rows from sample and asserting that it isn\'t in the original data source')
        selected_rows = random.sample(sample, selected_row_count)
        
        for selected_row in selected_rows:
            subprocess_command = ['grep', '-n', "'" + '.*'.join(selected_row) + "'", original_data_file]
            print('Executing: ' + ' '.join(subprocess_command))
            rv = subprocess.call(subprocess_command)
            assert rv != 0


if __name__ == '__main__':
    main()
