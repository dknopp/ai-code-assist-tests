Synthetic Data
========================

This subproject contains evaluations of synthetic data solutions that use AI.


Mostly.ai
==================================

A simple confidence test of Mostly.ai's synthetic data generation. Here we upload a CC0 dataset from Kaggle on
earthquakes and have the app generate some data for us. We then assert that the data seems correct by taking random
samples over 10 iterations and doing some basic checks, we also assert that a random selection of rows in the 
synthetic data do not exist in the original data set. See the icluded python script for details.

Kaggle data reference: https://www.kaggle.com/datasets/alessandrolobello/the-ultimate-earthquake-dataset-from-1990-2023

Example run

```bash

djkno@LAPTOP-340A59VN MINGW64 ~/projects/ai-synthetic-data
$ python test_data.py
Executing test iteration 0
Selecting random sample from Eartquakes-1990-2023-synthetic.csv
Asserting data is withing acceptable limits
Selecting random row from sample and asserting that it isn't in the original data source
Executing: grep -n '1491495813631.*7 km WSW of Cobb, California.*reviewed.*0.*169.*earthquake.*3.31363736.* California.*-122.79959772.*38.79048761.*1.22049479.*2017-02-16 20:26:18.420' Eartquakes-1990-2023.csv

Executing test iteration 1
Selecting random sample from Eartquakes-1990-2023-synthetic.csv
Asserting data is withing acceptable limits
Selecting random row from sample and asserting that it isn't in the original data source
Executing: grep -n '1541519255850.*_RARE_.*reviewed.*0.*12.*earthquake.*0.90422642.* Nevada.*-119.43500798.*40.59472854.*3.79756665.*2018-10-20 05:09:58.063' Eartquakes-1990-2023.csv

Executing test iteration 2
Selecting random sample from Eartquakes-1990-2023-synthetic.csv
Asserting data is withing acceptable limits
Selecting random row from sample and asserting that it isn't in the original data source
Executing: grep -n '1471168425852.*30 km NW of Mentasta Lake, Alaska.*reviewed.*0.*75.*earthquake.*2.24462086.* Alaska.*-143.9970565.*63.00368314.*10.22634513.*2016-10-19 14:10:14.663' Eartquakes-1990-2023.csv

Executing test iteration 3
Selecting random sample from Eartquakes-1990-2023-synthetic.csv
Asserting data is withing acceptable limits
Selecting random row from sample and asserting that it isn't in the original data source
Executing: grep -n '749683130879.*6km SW of Santa Clarita, California.*reviewed.*0.*15.*earthquake.*0.98960284.* California.*-118.51162403.*34.47173924.*2.13986464.*1994-01-20 10:06:22.850' Eartquakes-1990-2023.csv

Executing test iteration 4
Selecting random sample from Eartquakes-1990-2023-synthetic.csv
Asserting data is withing acceptable limits
Selecting random row from sample and asserting that it isn't in the original data source
Executing: grep -n '900826516741.*_RARE_.*reviewed.*0.*44.*earthquake.*1.71076039.* France.*7.80465544.*43.12592426.*5.08465953.*1998-07-22 13:19:37.270' Eartquakes-1990-2023.csv

Executing test iteration 5
Selecting random sample from Eartquakes-1990-2023-synthetic.csv
Asserting data is withing acceptable limits
Selecting random row from sample and asserting that it isn't in the original data source
Executing: grep -n '974249728569.*5 km SW of Cobb, California.*reviewed.*0.*13.*earthquake.*0.91659729.* California.*-122.7753954.*38.79792915.*1.05247512.*2000-10-21 12:48:03.730' Eartquakes-1990-2023.csv

Executing test iteration 6
Selecting random sample from Eartquakes-1990-2023-synthetic.csv
Asserting data is withing acceptable limits
Selecting random row from sample and asserting that it isn't in the original data source
Executing: grep -n '1595277943300.*64 km SSW of Sand Point, Alaska.*reviewed.*0.*8.*earthquake.*0.71351459.* Alaska.*-162.80200448.*55.51235219.*24.19593983.*2020-08-26 05:18:33.708' Eartquakes-1990-2023.csv

Executing test iteration 7
Selecting random sample from Eartquakes-1990-2023-synthetic.csv
Asserting data is withing acceptable limits
Selecting random row from sample and asserting that it isn't in the original data source
Executing: grep -n '1297946862372.*23 km SE of Denali National Park, Alaska.*reviewed.*0.*30.*earthquake.*1.40663346.* Alaska.*-151.56760063.*63.42829208.*3.71218421.*2011-02-16 19:44:20.417' Eartquakes-1990-2023.csv

Executing test iteration 8
Selecting random sample from Eartquakes-1990-2023-synthetic.csv
Asserting data is withing acceptable limits
Selecting random row from sample and asserting that it isn't in the original data source
Executing: grep -n '1411257242003.*8 km WSW of Cobb, California.*reviewed.*0.*57.*earthquake.*1.90164749.* California.*-122.81118179.*38.79809956.*2.52530308.*2014-10-30 00:30:51.990' Eartquakes-1990-2023.csv

Executing test iteration 9
Selecting random sample from Eartquakes-1990-2023-synthetic.csv
Asserting data is withing acceptable limits
Selecting random row from sample and asserting that it isn't in the original data source
Executing: grep -n '848448252448.*28km ENE of Little Lake, California.*reviewed.*0.*39.*earthquake.*1.58811455.* California.*-117.54673093.*36.04129826.*0.67542609.*1996-11-21 07:49:03.260' Eartquakes-1990-2023.csv
```
