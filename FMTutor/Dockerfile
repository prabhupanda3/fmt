# Use an Ubuntu base image
FROM ubuntu:latest

# Set non-interactive mode for package installations
ENV DEBIAN_FRONTEND=noninteractive

# Update package repository and install necessary packages
RUN apt-get update && \
    apt-get install -y openjdk-8-jdk maven

# Set the working directory inside the container
WORKDIR /my-java-fmt

# Copy your Java application source code to the container
COPY . /FMTutor

# Build the application using Maven
RUN mvn clean install

# Expose the port that your application listens on
EXPOSE 8081

# Command to run your Java application
CMD ["java", "-jar", "target/FMTutor.jar"]
