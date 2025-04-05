# Spring Boot REST API - Student Management

## Project Overview
This Spring Boot REST API manages student information. It provides endpoints to retrieve, filter, sort, and perform CRUD operations on student records.

## Project Structure
- **AppController.java** - Main REST controller with endpoints for student operations.
- **Student.java** - Model class representing student attributes.



## Prerequisites
- Java 8 or higher
- Spring Boot
- Maven or Gradle

## Dependencies
- Spring Web
- Spring Data JPA

## Endpoints

### 3. Get Multiple Students
- **URL:** `/app/students`
- **Method:** `GET`
- **Description:** Returns a list of all predefined students.

### 4. Find a Student by Registration Number
- **URL:** `/app/students/{regNo}`
- **Method:** `GET`
- **Description:** Returns a specific student based on the registration number.
- **Example:** `/app/students/2020ICT01`

### 7. CRUD Operations

#### Create Student
- **URL:** `/app/students`
- **Method:** `POST`
- **Description:** Adds a new student.
- **Request Body Example:**
```json
{
  "regNo": "2020ICT01",
  "name": "Bingu Sala",
  "age": 24,
  "course": "ICT",
  "gpa": 3.8
}
```

#### Update Student
- **URL:** `/app/students/{regNo}`
- **Method:** `PUT`
- **Description:** Updates student details based on the registration number.

#### Delete Student
- **URL:** `/app/students/{regNo}`
- **Method:** `DELETE`
- **Description:** Deletes a student by registration number.

## Student Model
The `Student` class has the following attributes:
- `regNo` - Registration Number (String)
- `name` - Student Name (String)
- `age` - Student Age (Integer)
- `course` - Student's Course (String)
- `gpa` - Student's Grade Point Average (Double)

## Running the Application
1. Ensure you have Java and Spring Boot installed.
2. Clone the repository.
3. Build the project using Maven or Gradle.
4. Run the Spring Boot application.
5. Access endpoints via `http://localhost:8080/app/...`

## Outputs

1. **Display All Students:**
-![Image](https://github.com/user-attachments/assets/d1c50b90-719e-4dfc-aca6-c2be225e2c28)

2. **Display Student by id:**
-![Image](https://github.com/user-attachments/assets/dfd30623-cfee-4302-8a80-6964706508cd)

3. **CURD Operations(POST):**
-![Image](https://github.com/user-attachments/assets/bffb43c1-0feb-4167-a8e4-356cea4ac6a4)

4. **CURD Operations(PUT):**
![Image](https://github.com/user-attachments/assets/3a25c413-d674-4361-a560-75e9e5c2a660)

5. **CURD Operations(DELETE):**
![Image](https://github.com/user-attachments/assets/41566df2-bfba-4b91-8ef4-d113551796e0)
