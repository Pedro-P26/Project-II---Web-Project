# README - Whisky Production Management System (Web Application)

## 📌 General Information
- **Institution**: Polytechnic Institute of Viana do Castelo (IPVC)  
- **Course**: Computer Engineering  
- **Subject**: Project II  
- **Academic Year**: 2023/2024  
- **Authors**:  
  - Pedro Poças (№28976)
  - Tiago Baptista (№28998)    
- **Project Title**: Whisky Production Management System (Web Application)  

## 📊 Project Overview
This project is a continuation of **Project I**, focusing on the development of a **web application** for managing whisky production. The system is designed to streamline operations related to order management, production control, and supplier interactions. The application is built using **Spring Web MVC** with **Thymeleaf** for the frontend, **Hibernate** for database access, and **PostgreSQL** as the database management system.

The system is tailored for three main user roles:
- **Receptionist**: Manages supplier registration, order reception, and order registration.
- **Order Manager**: Handles order placement, order tracking, and supplier management.
- **Production Manager**: Oversees production initiation, production tracking, and monitoring of production phases.

## 🛠️ Technologies Used
- **Spring Web MVC**: Framework for building the web application.
- **Thymeleaf**: Template engine for rendering HTML views.
- **Hibernate**: ORM (Object-Relational Mapping) tool for database access.
- **PostgreSQL**: Relational database management system for storing production data.
- **Maven**: Dependency management and project build tool.
- **HTML/CSS**: For creating the user interface.

## 📂 Project Structure
### 1️⃣ Use Case Model
The system is designed around three main user roles:
- **Receptionist**: Registers suppliers, receives orders, and logs them into the system.
- **Order Manager**: Places orders, tracks order status, and manages suppliers.
- **Production Manager**: Initiates production, tracks production phases, and monitors bottling processes.

### 2️⃣ Database Model
The database model was carefully designed to store all necessary information for the whisky production process. The final database schema includes tables for suppliers, orders, production phases, and more.

### 3️⃣ Database Access
- **Hibernate**: Used for seamless interaction with the PostgreSQL database.
- **Persistence.xml**: Configuration file for database connection and entity management.
- **Entity Package**: Contains auto-generated entities from the database schema.
- **BLL Package**: Includes methods for CRUD operations (Create, Read, Update, Delete) on the database entities.

### 4️⃣ Application Development
- **Low-Fidelity Prototypes**: Initial sketches and wireframes were created to visualize the application's layout and functionality.
- **High-Fidelity Prototypes**: Refined designs were developed to ensure a user-friendly and intuitive interface.

### 5️⃣ Web Application Development
The web application was developed using **Spring Web MVC** and **Thymeleaf**. Key features include:
- **Login Page**: Secure authentication for users.
- **Receptionist Interface**: Allows the receptionist to manage received lots, orders, and suppliers.
- **Order Manager Interface**: Enables the order manager to place orders, track order status, and manage suppliers.
- **Production Manager Interface**: Provides tools for initiating production, tracking production phases, and monitoring bottling processes.



