-- https://docs.spring.io/spring-boot/docs/current/reference/html/howto-database-initialization.html
-- IN THIS FILE WE CAN WHITE AN SQL SCRIPT CONTAINING:
-- SCHEMA AND TABLE MANIPULATION QUERIES TO PREPARE THE DB
-- AND WILL BE EXECUTED AUTOMATICALLY DURING THE INITIALIZATION OF THE APPLICATION
-- ADDITIONALLY Spring Boot WILL PROCESS THE schema-${platform}.sql
-- WHERE platform IS THE VALUE OF spring.datasource.platform
-- THIS ALLOWS YOU TO SWITCH TO DATABASE SPECIFIC SCRIPTS IF NECESSARY
-- YOU MIGHT CHOOSE TO SET IT TO THE VENDOR NAME OF THE DATABASE (hsqldb, h2, oracle, mysql, postgresql etc.).

-- In a JPA-based app, you can choose to let Hibernate create the schema or use schema.sql but not both.
-- Make sure to disable spring.jpa.hibernate.ddl-auto if you chose the later.
-- You can also disable initialization by setting spring.datasource.initialize to false.

-- THIS FILE IS EXECUTED FIRST. BEFORE data.sql AND Hibernate
-- IF THIS FILE EXISTS AND spring.datasource.initialize = true
-- THEN IT CANNOT BE NULL OR EMPTY
-- UNCOMMENT THE QUERY BELOW TO PREVENT EMPTY FILE ERROR
-- SELECT 1;