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
* Browser: Desktop Browser, Mobile Browser
* Responsive, Single Page Application
* Client-side MVC framework: AngularJS
* Other web tools: HTML5 Boilerplate, Bootstrap, SASS/Compass, CoffeeScript, jQuery
* Web server: node.js vs. Jetty vs. Tomcat

### Web Services
* Java RESTful framework: [Jersey](https://jersey.java.net/) vs. [Spring MVC](http://spring.io/guides/gs/spring-boot/) vs. [Play Framework](https://www.playframework.com/) vs. [Spark Framework](http://sparkjava.com/)
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

