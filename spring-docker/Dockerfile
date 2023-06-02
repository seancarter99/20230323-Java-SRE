# "Extends" another Docker Image
FROM openjdk:8-jdk
# Sets the working directory in the Docker Container
WORKDIR /app
#    Local Machine                            Docker Container
COPY target/spring-docker-0.0.1-SNAPSHOT.jar spring-docker.jar
# Choose the port(s) that Docker exposes
# By default, ALL ports in Docker containers are CLOSED
EXPOSE 8080
# Run a shell command to start the application
# Runs the command INSIDE the Docker container
CMD ["java", "-jar", "spring-docker.jar"]