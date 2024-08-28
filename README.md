# Student Management System

A simple and robust Student Management System developed using Core Java, Hibernate for database connectivity, and PostgreSQL as the database. This application runs in the console and allows for efficient management of student data.

## Features

- **Save Student**: Insert new student records into the database.
- **Find Student by ID**: Retrieve and display the details of a student using their unique ID.
- **Update Student by ID**: Modify existing student details using their unique ID.
- **Delete Student by ID**: Remove student records from the database using their unique ID.
- **Find All Students**: Display a list of all students in the database.

## Technologies Used

- **Core Java**: The main programming language used to develop the application.
- **Hibernate**: An Object-Relational Mapping (ORM) tool used for database interactions.
- **PostgreSQL**: The relational database management system used to store student data.

## Getting Started

### Prerequisites

- **Java Development Kit (JDK)**: Ensure you have JDK 8 or above installed.
- **PostgreSQL**: Install PostgreSQL and set up the database.
- **Hibernate**: Hibernate dependencies should be included in your project.

### Installation

1. **Clone the repository:**

    ```bash
    git clone https://github.com/nabanitaghosh8/StudentManagementSystem.git
    cd student-management-system
    ```

2. **Set up the PostgreSQL Database:**

    - Create a new PostgreSQL database.
    - Configure the database connection details in the `hibernate.cfg.xml` file.

    ```xml
    <property name="javax.persistence.jdbc.url" value="jdbc:postgresql://localhost:5432/HibernateSMS" /> <!-- DB Name -->
    <property name="javax.persistence.jdbc.user" value="postgres" /> <!-- DB User -->
    <property name="javax.persistence.jdbc.password" value="root" /> <!-- DB Password -->
    ```

3. **Compile and Run the Application:**

    - Compile the Java files using your preferred IDE or command line.
    - Run the application from the console.

### Usage

Upon running the application, you'll be presented with the following menu:

```bash
Welcome To SMS
******************
Enter Your Choice:
1. Save Student
2. Find Student by ID
3. Update Student by ID
4. Delete Student by ID
5. Find All Students
6. Exit

