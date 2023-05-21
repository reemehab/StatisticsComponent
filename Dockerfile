FROM openjdk:11

WORKDIR /app

# Copy the Java source files
COPY . /app

# Mount the volume containing the data.csv file
VOLUME /data

# Compile the Java code
RUN javac -cp jars/opencsv-2.2.jar:./ -d . src/com/company/*.java

# Set the entrypoint
CMD ["java", "-cp", "jars/opencsv-2.2.jar:.", "com.company.Main"]
