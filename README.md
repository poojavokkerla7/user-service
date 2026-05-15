# User Service - Week 8 Final Project

## Overview
This project implements a secure backend system using Spring Boot with REST APIs, JWT authentication, and cloud deployment. It demonstrates enterprise-level backend development with containerization and CI/CD integration.

---

## 🚀 Live Application
https://user-service-xxtq.onrender.com/users

---

## 🔧 Features
- REST APIs (CRUD operations)
- User creation and retrieval
- JWT-based authentication (login/register)
- Dockerized application
- Cloud deployment using Render
- CI/CD using GitHub integration
- H2 in-memory database

---

## 🏗️ Architecture
Client (Postman)
        ↓
Spring Boot Application (Render Cloud)
        ↓
H2 Database (In-memory)

---

## 📡 API Endpoints

### Users
- GET /users → Get all users
- GET /users/{id} → Get user by ID
- POST /users → Create user
- PUT /users/{id} → Update user
- DELETE /users/{id} → Delete user

### Authentication
- POST /auth/register → Register user
- POST /auth/login → Login and get JWT token

---

## 🛠️ Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Docker
- Render (Cloud Deployment)
- GitHub (CI/CD)

---

## ▶️ How to Run Locally

```bash
git clone https://github.com/poojavokkerla7/user-service.git
cd user-service
./mvnw spring-boot:run
