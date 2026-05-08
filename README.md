User Service - Week 7 Spring Boot Backend

Overview
This project implements a secure backend system using Spring Boot with JWT authentication, role-based authorization, and messaging integration. It demonstrates how to build enterprise-level REST APIs with security and asynchronous communication patterns.

Features
- JWT-based authentication for secure login
- Role-based authorization using USER and ADMIN roles
- Secure REST APIs using Spring Security
- MySQL database integration using JPA and Hibernate
- Messaging system using Kafka pattern (simulated producer-consumer)
- API testing using Postman

Architecture
- Controller layer for handling HTTP requests
- Service layer for business logic
- Repository layer for database operations
- Security layer using JWT and Spring Security filters
- Messaging layer using producer-consumer pattern

API Endpoints

Authentication
POST /auth/login
Generate JWT token using username, password, and role

Users
GET /users
Accessible only by USER role

Messaging
POST /kafka/send
Send message using Kafka producer simulation

Tech Stack
Java 17
Spring Boot
Spring Security
JPA and Hibernate
MySQL
Kafka (simulated)

How to Run

1. Clone the repository
git clone https://github.com/poojavokkerla7/user-service.git

2. Navigate to project
cd user-service

3. Configure MySQL in application.properties

4. Run the application
./mvnw spring-boot:run

5. Test APIs using Postman

Author
Pooja Vokkerla
