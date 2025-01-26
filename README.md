# Hospital Management

This project is a Hospital Management System implemented using **Java** with **Maven**. It uses **Servlets**, **JSP**, and is hosted on the **Tomcat Server**. The system allows functionalities like adding and viewing appointments, managing doctors, and handling user authentication using emails and passwords.

## Features

- **Appointment Management**:
  - Add a new appointment.
  - View all appointments.
  - Admin can view all appointments in detail.

- **Doctor Management**:
  - Add a doctor.
  - View all doctors and their details.
  - Admin can see the doctor's password (for internal use).
  - Doctors can view all appointments of their own patients.

- **User Authentication**:
  - Login for users (doctors and admin) using **email and password**.

## Technologies Used

- **Java** (for business logic)
- **Maven** (for project management)
- **Servlets** (for request handling)
- **JSP** (for dynamic page rendering)
- **Tomcat Server** (for deploying the application)
- **MySQL** (for database management)

## Setup Instructions

### Prerequisites

- **Java Development Kit (JDK)** 8 or above
- **Apache Maven** installed
- **Apache Tomcat** server installed
- **MySQL** database setup

### Steps to Run the Project

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/hospital-management-system.git
