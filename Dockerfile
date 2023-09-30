FROM openjdk:11.0
COPY target/my-new-jar.jar my-new-jar.jar
CMD java -jar my-new-jar.jar