User Service - Microservices (Week 6)

Overview
User Service is a Spring Boot microservice that handles user registration and retrieval.
It is integrated with MySQL using JPA and Hibernate for persistent data storage.

Features
- User registration API
- Fetch all users
- MySQL database integration
- JPA and Hibernate ORM
- REST API design

Tech Stack
- Java 17
- Spring Boot
- MySQL
- Spring Data JPA
- Maven

Run Application
mvn spring-boot:run

API Endpoints

Register User
POST /users/register

Request Body
{
  "username": "pooja",
  "password": "123"
}

Get Users
GET /users

Database
- Database name: microservices_db
- Table: user

Architecture

Client (Postman)
      |
      v
User Service (8081)
      |
      v
MySQL Database
