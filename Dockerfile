
FROM openjdk:8
EXPOSE 8080
ADD target/FinalProject.war FinalProject.war
ENTRYPOINT ["java","-jar","/FinalProject.war"]
Kalinga_Hospital-0.0.1-SNAPSHOT.war
