# 💼 Employee Management System

A simple **Spring Boot** web application for managing employees.
This project demonstrates the use of **Spring Boot**, **Spring MVC**, **Spring Data JPA**, **Thymeleaf**, and **MySQL** in a CRUD (Create, Read, Update, Delete) application.

---

## ✨ Features

* 📋 **List all employees** (sorted by last name).
* ➕ **Add** a new employee.
* ✏️ **Update** an existing employee’s details.
* 🗑 **Delete** an employee.
* 💾 Data stored in a **MySQL database**.
* 🎨 User-friendly UI using **Bootstrap**.

---

## 🛠 Technologies Used

* ☕ **Java 17+**
* 🚀 **Spring Boot** (MVC + Data JPA)
* 📝 **Thymeleaf** (template engine)
* 🐬 **MySQL** (database)
* 🎨 **Bootstrap 5** (frontend styling)

---

## 📂 Project Structure

```
src/main/java
    └── com/demo/springboot/employee_management
        ├── controller        # Handles HTTP requests
        ├── dao               # Repository interface
        ├── entity            # JPA entity classes
        ├── service           # Business logic
src/main/resources
    ├── templates/employees   # Thymeleaf templates
    ├── (application.properties) # Local DB config (not in repo)
sql-scripts
    └── employee-directory.sql # Sample database and data
```

---

## 🚀 Getting Started

### 1️⃣ Clone the repository

```bash
git clone https://github.com/Basmala-Abdullah/Employee-Management-System.git
cd Employee-Management-System
```

### 2️⃣ Set up the database

* Create the database and table using the provided script:

```bash
mysql -u root -p < sql-scripts/employee-directory.sql
```

* Or run the SQL commands manually inside MySQL Workbench / CLI.

### 3️⃣ Configure database connection

create your own `src/main/resources/application.properties` file with:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_directory
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

### 4️⃣ Run the application

Using Maven:

```bash
mvn spring-boot:run
```

Or run the main class from your IDE.

### 5️⃣ Access the application

🌐 Open your browser and go to:

```
http://localhost:8080/employees/list
```

---

## 🖼 Example Screens

* **📋 List Employees** — Shows all employees in a table with Update & Delete buttons.
* **➕ Add Employee Form** — Allows adding a new employee.
* **✏️ Update Employee Form** — Pre-filled form for editing an existing employee.
