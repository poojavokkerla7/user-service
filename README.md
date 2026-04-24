# User Service

## Overview
User Service handles user-related operations such as registration and login.

---

## Features
- User Registration
- User Login
- Calls Task Service to fetch tasks

---

## Port
Runs on: 8081

---

## API Endpoints

POST /users/register  
POST /users/login  
GET /users/tasks  (calls Task Service)

---

## How to Run

mvn spring-boot:run

Open:
http://localhost:8081

---

## Architecture Role

Client → User Service → Task Service

User Service acts as an entry point and communicates with Task Service using REST calls.
