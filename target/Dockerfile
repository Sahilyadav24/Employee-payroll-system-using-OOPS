# Use an openjdk base image from Docker Hub
FROM openjdk:21-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
#COPY employee-payroll-system.jar /app/

COPY out /app/


EXPOSE 8000

# Specify the command to run the JAR file
CMD ["java", "EmployeePayrollSystem"]
