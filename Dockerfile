# Base image
FROM openjdk:8-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the compiled Java application to the container
COPY out/production/test/ /tmp

# Set the entry point command to run the application
CMD ["java", "-jar", "app.jar"]
