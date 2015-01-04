# Implementation Choices

## Development, Continuous Delivery, DevOps
* Code Source: GitHub
* Development Environment: Docker
* Continuous Build: [Docker Hub Automated Builds](https://docs.docker.com/docker-hub/builds/) 
* Deployment & Management: Elastic Beanstalk
* Metrics & Monitoring: Elastic Beanstalk (possibly with Kinesis)
* Load Balancer: Elastic Load Balancer through Elastic Beanstalk
* App Notification/Push Message: SNS
* CDN: CloudFront

## Software Frameworks

### Native Mobile App
* Device: Phone, Tablet
* Platform: iPhone, Android
* Prototyping: [framerjs](http://framerjs.com/)

### Web App
* Responsive, Single Page Application
* Scaffolding: Yeoman
* Browser: Desktop Browser, Mobile Browser
* Client-Side MVC framework: AngularJS
* CSS Framework: Bootstrap through AngularUI, Compass
* Pakcage Management: Bower
* Build: Grunt
* Optional: HTML5 Boilerplate, jQuery

### Web Services
* Java RESTful framework: 
  * [Jersey](https://jersey.java.net/) through [Dropwizard] (https://dropwizard.github.io/dropwizard/)
  * [Spring MVC](http://spring.io/guides/gs/spring-boot/)
  * [Play Framework](https://www.playframework.com/)
  * [Spark Framework](http://sparkjava.com/)
  * [Ninja Framework](http://www.ninjaframework.org/)
* Real-time, async (server push): [Atmosphere framework](http://async-io.org/)

### Backend Languages & Libaries
* Language: Java 8
* Pacakge managemnet and build: Maven vs. Gradle
* Other build tools: Checlstyle, Lombok
* Dependency Injection: Spring vs. Guice

### Persistant Data Storage
* Relational: RDS
* Key-value or document store: DynamoDB, 
* File store: S3
* Data Warehouse: ? (Kinesis/S3 + Redshift)

### Caching
* ElasticCache with Redis

