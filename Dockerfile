
FROM openjdk:8
EXPOSE 8080
ADD target/BOHORooms-0.0.1-SNAPSHOT.war BOHORooms-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/BOHORooms-0.0.1-SNAPSHOT.war"]
