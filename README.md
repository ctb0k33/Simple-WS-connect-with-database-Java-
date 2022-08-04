# Simple WS connect with database Java
Simple Web Service for beginners who want to learn basic back-end Java.

* Here are some steps you need to follow to execute this code:
    -) First, you need to download some external libraries and add them in your project buildpath :
          +) 1: javax.ws.rs-api-2.0.jar. Link: http://www.java2s.com/Code/Jar/j/Downloadjavaxwsrsapi20jar.htm.
          +) 2: Log4j-1.2.17.jar. Link: http://www.java2s.com/Code/Jar/l/Downloadlog4j1217jar.htm
          +) 3: mysql-connector-java.jar. Link: https://dev.mysql.com/downloads/connector/j/
    -) Second, you need to change your JDK to version 1.8 ( the newest version may not support some old methods ).
    -) Finally, you need to change the username and the password fit with your Mysql server ( in JDBCConection.java ).
* Necessary app you need to run this code:
-) MySQL Server
-) SOAP UI or other app that use to test API

* Code to create students database with student_information table in MySQL:
DROP database if exists students;
CREATE DATABASE students;
use students; 
CREATE TABLE student_information(
    name VARCHAR(50) NOT NULL,
    code VARCHAR(50) NOT NULL,
    age int NOT NULL,
    class_name NVARCHAR(50) NOT NULL,
    address NVARCHAR(50) NOT NULL,
    mark float NOT NULL);
