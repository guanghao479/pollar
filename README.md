pollar
======
`master` branch Circle CI build: [![Circle CI](https://circleci.com/gh/fmaj7/pollar/tree/master.svg?style=svg&circle-token=6e5ea6e31ca0eac67dedfe618f6953abc9a41fd8)](https://circleci.com/gh/fmaj7/pollar/tree/master)

## Build & Run
    mvn -f pollar-service/pom.xml clean compile assembly:single
    java -Dninja.port=9000 -jar pollar-service/target/pollar-service-1.0-SNAPSHOT-jar-with-dependencies.jar
    
    