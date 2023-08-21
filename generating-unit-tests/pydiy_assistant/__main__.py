import argparse
import openai

from file_utils import read_file
from prompts import generate_unit_test


def main(api_key, filename):
    openai.api_key = api_key
    text = read_file(filename)
    print(generate_unit_test(text))
    


if __name__ == '__main__':

    parser = argparse.ArgumentParser()
    parser.add_argument('--api-key', type=str, default=None)
    parser.add_argument('filename', type=str, default=None)
    args = parser.parse_args()
    api_key = args.api_key if args.api_key else os.environ['OPENAI_API_KEY']
    main(api_key, args.filename)
