# Simple WS connect with database Java
Simple Web Service for beginners who want to learn basic back-end Java.

* Here are some steps you need to follow to execute this code:
     * First, you need to download some external libraries and add them in your project buildpath : <br />
           - 1) Javax.ws.rs-api-2.0.jar. Link: http://www.java2s.com/Code/Jar/j/Downloadjavaxwsrsapi20jar.htm <br />
           - 2) Log4j-1.2.17.jar. Link: http://www.java2s.com/Code/Jar/l/Downloadlog4j1217jar.htm <br />
           - 3) Mysql-connector-java.jar. Link: https://dev.mysql.com/downloads/connector/j/ <br />
     * Second, you need to change your JDK to version 1.8 ( the newest version may not support some old methods ).
     * Finally, you need to change the username and the password fit with your Mysql server ( in JDBCConection.java ).
* Necessary app you need to run this code:
     * MySQL Server
     * SOAP UI or other app that use to test API

* Code to create students database with student_information table in MySQL: <br />
    * DROP DATABASE IF EXISTS students;<br />
      CREATE DATABASE students;<br />
      USE students; <br />
      CREATE TABLE student_information(<br />
        name VARCHAR(50) NOT NULL,<br />
        code VARCHAR(50) NOT NULL,<br />
        age int NOT NULL,<br />
        class_name NVARCHAR(50) NOT NULL,<br />
        address NVARCHAR(50) NOT NULL,<br />
        mark float NOT NULL);<br />
