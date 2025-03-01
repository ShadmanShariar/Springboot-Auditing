🔹 Project Overview:
This project demonstrates auditing functionality in a Spring Boot application using MongoDB. The key goal is to track and log information about entities such as who created or last modified them and when these actions occurred.

🔹 Features:
Auditing Support:

Automatically tracks the createdBy, createdDate, lastModifiedBy, and lastModifiedDate for each entity.
Implements @CreatedBy, @CreatedDate, @LastModifiedBy, and @LastModifiedDate annotations provided by Spring Data MongoDB.
Logging:

SLF4J logging integrated into both the AuditorAware and Service classes to track auditing actions and updates.
CRUD Operations:

POST to create a user (/api/users).
PUT to update user details (/api/users/{id}).
Both endpoints are audited to capture who and when the action occurred.
🔹 Core Components:
MongoDB: Used as the database to store user entities.
Spring Data MongoDB: Provides the annotations and auditing support.
AuditorAware: Custom class implementing AuditorAware<String> to provide the current user for auditing.
User Entity: Contains audit fields like createdBy, createdDate, lastModifiedBy, and lastModifiedDate.
Service Layer: Handles business logic for saving and updating users, with logging included.
Controller Layer: Exposes endpoints for managing users.
🔹 Example Flow:
A POST request creates a new user, with auditing fields automatically populated (createdBy, createdDate).
A PUT request updates an existing user's details, with the lastModifiedBy and lastModifiedDate fields updated.
All actions are logged for easy tracking of when and by whom changes occurred.
🔹 Key Technologies:
Spring Boot (for backend framework)
MongoDB (for data storage)
SLF4J (for logging)
🔹 Use Case:
This project is useful for scenarios where you need to track changes to entities, particularly in multi-user systems, and ensure data integrity by recording who modified the data and when.

