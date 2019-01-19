-- https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-sql.html
-- https://docs.spring.io/spring-boot/docs/current/reference/html/howto-database-initialization.html
-- IN THIS FILE WE CAN WRITE AN SQL SCRIPT CONTAINING:
-- SCHEMA, TABLE AND DATA MANIPULATION QUERIES
-- TO BE EXECUTED AUTOMATICALLY DURING THE INITIALIZATION OF THE APPLICATION
-- AND AFTER THE CREATION OF SCHEMA AND TABLES BY Hibernate
-- IF spring.jpa.hibernate.ddl-auto IS SET TO create OR create-drop
-- IT IS A Hibernate feature (nothing to do with Spring)

--hash for 1234asdc, new user new hash
INSERT INTO Users (firstName, lastName, email, phoneNumber, companyName, password, userType) VALUES ('Fragkakis', 'Emmanouil', 'emmfrag@gmail.com', '6986131382', 'Dataverse', '$2a$10$FCpfEORvEEx/g0rQlTAKseED3uGJDQKQ.UJo40RxMByp1OUwTnHem', 'Admin');
INSERT INTO Users (firstName, lastName, email, phoneNumber, companyName, password, userType) VALUES ('Papadopoulou', 'Eleni', 'elpap@email.com', '6934774205', 'Vodafone', '$2a$10$YsyIdxHjuqyWIvt7XbvXX.Gd/CsNTNLNqpEhIISNTU1Ys8aUoj0N.', 'User');
INSERT INTO Users (firstName, lastName, email, phoneNumber, companyName, password, userType) VALUES ('Ioannou', 'Giannis', 'iong@gmail.com', '6948521156', 'Cosmote', '$2a$10$g1zJTGR2pPpq/Iidt6bm1ehBbqt4S6.UGrVvQxRH3Odz4wJ8XFx3S', 'User');
INSERT INTO Users (firstName, lastName, email, phoneNumber, companyName, password, userType) VALUES ('Stratis', 'Vasilis', 'vasstr@gmail.com', '6978546256', 'UniSystems', '$2a$10$lWIhnx1YLbl/mYnSXJupSegGAigWnIxE.RQH7DGsgcZ.qlyIsDHPy', 'User');
INSERT INTO Users (firstName, lastName, email, phoneNumber, companyName, password, userType) VALUES ('Mpekris', 'Christos', 'chmpek@gmail.com', '6972000100', 'Intracom', '$2a$10$vF5ATNVMLHC3oKAguqvuoe0UHhB/IAmb6ib409oCz/A0xAo5RIy7C', 'User');



