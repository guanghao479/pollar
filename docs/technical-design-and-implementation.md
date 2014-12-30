# Implementation Choices

## Development, Continuous Delivery, DevOps
* Code Source: GitHub
* Development Environment: Docker
* Continuous Build: [Docker Hub Automated Builds](https://docs.docker.com/docker-hub/builds/) 
* Deployment & Management: AWS Elastic Beanstalk
* Metrics & Monitoring: AWS Elastic Beanstalk(possibly with AWS Kinesis)
* Persistant Data Storage: AWS RDS and/or AWS DynamoDB
* Load Balancer: AWS Elastic Load Balancer through AWS Elastic Beanstalk
* App Notification/Push Message: AWS SNS
* Data Warehouse: ? (Kinesis/S3 + Redshift)

## Software Frameworks

### Mobile App Clients
* Native Clients

### Web Services
* Java-based framework
