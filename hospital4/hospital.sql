create database hospital;
use hospital;


create table doctors(
doctorId INT PRIMARY KEY AUTO_INCREMENT,
doctorName VARCHAR (50),
doctorEmail VARCHAR (70),
speciality VARCHAR (30),
phoneNumber VARCHAR (10),
password VARCHAR (25)
);

create table appointments(
patientId INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
patientName VARCHAR(50),
doctorId INT,
appointmentDate DATE,
age INT,
email VARCHAR (70),
FOREIGN KEY (doctorId) REFERENCES doctors (doctorId)
);

insert into doctors(doctorId, doctorName, doctorEmail, speciality, phoneNumber,password) values ('1','Rajesh','rajesh@gmail.com','Surgeon','1234567890','rajesh12');
insert into appointments(patientId, patientName, doctorId, appointmentDate, age, email) values ('1','Suraj','1','2025-02-11','23','suraj@gmail.com');
