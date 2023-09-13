
# Mostly.ai

Mostly AI is an AI based generator of synthetic data. It is a commercial product that is available as a cloud service or as an on-premises solution.

## User Interface

### Highlights
 - Mostly.ai has an intuitive user interface
 - It does not have an API or CLI.
 - It's documentation is well written.

### Walk through / overview

When you log in you're greeted with a home page that lets you generate a data source by uploading a CSV or configuring a connector.
![Home](home.png)

Here is a screenshot showing some of the avaialble connectors.
![Data Connectors](connector.png)

When you create a dataset there are various configuration options on how to generate the data. 

Once you generate data the synthetic datasets will show up in a table found in the synthetic datasets tab.
![Datasets](datasets.png)

From a synthetic dataset you can generate more data.
![Generate More Data](generate-more-data.png)

You get a reasonable log that updates live as the data is generated.
![Data Generation](data-generation.png)

Once the data is generated a detailed QA report is provided.
![QA Report](qa-report.png)
![QA Report 2](qa-report2.png)

## Deployment Options

Several on prem deployment options are available.

 - OpenShift
 - AWS EKS
 - Minikube

Included in the deployment documentation is an architecture overview. The documentation appears to be well written.

![Deployment Docs](deployment-docs.png)
