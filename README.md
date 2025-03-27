Training Center Registry API:

This is a Spring Boot application for registering and managing Government-funded Training Centers. It provides REST APIs to create and retrieve training center details with proper validations, exception handling, and database persistence using Hibernate JPA and MySQL.

PREREQUISITES :
-> Java 17 or higher
-> STS  or IntelliJ IDEA
-> MAVEN
-> MYSQL 8.3 or higher
-> POSTMAN // for testing

SETUP INSTRUCTIONS :
1) Clone the repository

2) Configure MySQL Database:
   1] create database with name "training_center_db"
   2] Open src/main/resources/application.properties and update:
   
    ---------------->spring.datasource.url=jdbc:mysql://localhost:3306/training_center_db
    ---------------->spring.datasource.username=your_mysql_username
    ---------------->spring.datasource.password=your_mysql_password
    ---------------->spring.jpa.hibernate.ddl-auto=update

4) Clean and Build the project:
   1] Open STS - right click on project - Run as - Maven clean
   ------ 2] Open STS - right click on project - Run as - Maven install

5) Run Application :
-> On STS, right click on project - Run as - Spring Boot App

6) Test APIS (use POSTMAN or any other API testing tool):
   
   1] for POST API :
   => URL: http://localhost:8080/api/training-centers
   => Method: POST
   => Body : JSON format
   => sample i/p : {
                    "centerName": "xyz Academy",
                    "centerCode": "ABCD12345678",
                    "address": {
                                "detailedAddress": "000 Street Name",
                                "city": "Mumbai",
                                "state": "Maharashtra",
                                "pincode": "401101"
                              },
                    "studentCapacity": 100,
                    "coursesOffered": ["Java", "Spring Boot"],
                    "contactEmail": "hr@xyzacademy.com",
                    "contactPhone": "9876543210"
                  }

      2] for GET API :
      => URL: http://localhost:8080/api/training-centers
      => Method: GET





   
