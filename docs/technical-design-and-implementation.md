# Implementation Choices

## Development, Continuous Delivery, DevOps
* Code Source: GitHub
* Development Environment: Docker
* Continuous Build: [Docker Hub Automated Builds](https://docs.docker.com/docker-hub/builds/) 
* Deployment & Management: AWS Elastic Beanstalk
* Metrics & Monitoring: AWS Elastic Beanstalk (possibly with AWS Kinesis)
* Persistant Data Storage: AWS RDS and/or AWS DynamoDB
* Load Balancer: AWS Elastic Load Balancer through AWS Elastic Beanstalk
* App Notification/Push Message: AWS SNS
* Data Warehouse: ? (Kinesis/S3 + Redshift)

## Software Frameworks

### Native Mobile App
* Device: Phone, Tablet
* Platform: iPhone, Android

### Web App
* Browser: Desktop Browser, Mobile Browser
* Single Page Application
* Client-side MVC framework: AngularJS
* Other web tools: HTML5 Boilerplate, Bootstrap, SASS/Compass, CoffeeScript, jQuery
* Web server: node.js vs. Jetty vs. Tomcat

### Web Services
* Java RESTful framework: Jersey vs. Spring MVC vs. Play Framework vs. Spark Framework
* Real-time, async (server push): [Atmosphere framework](http://async-io.org/)

### Backend Languages & Libaries
* Java 8
* TODO
