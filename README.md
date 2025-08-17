DESCRIPTION OF THE CODE



This is a simple Spring Boot REST API for managing tasks.
It supports basic CRUD operations (Create, Read, Update, Delete)
using an in-memory data structure






Project Structure Overview






Task (Model)

A Java class representing a task with fields: id, title, description, and status (currently as String).

Contains getters, setters, and a toString() method.

Status (Enum)

An enumeration that defines valid task statuses: TODO, IN_PROGRESS, COMPLETED, BLOCKED.

TaskService (Service Layer)

Acts as the business logic layer.

Stores tasks in a Map<Long, Task>, simulating a database.

Handles operations like creating, retrieving, updating, and deleting tasks.

TaskController (REST Controller)

Exposes HTTP endpoints for task operations under /tasks.

Uses @RestController and @RequestMapping annotations.

Supports:

POST /tasks → Create a new task

GET /tasks/{id} → Get task by ID

GET /tasks → Get all tasks

PUT /tasks/{id} → Update a task

DELETE /tasks/{id} → Delete a task




( Postman Working )



open postman click on collections click on plus(+)
icon select blank collectin
then click on add request 
after that follow the below steps




POST


![image alt](https://github.com/My-Codes-21/160923733064-Mohammed_Sarfaraaz/blob/b5f24f48086361c98eb85ccaabbced42cd0a132b/post.png)


GET


![image alt](https://github.com/My-Codes-21/160923733064-Mohammed_Sarfaraaz/blob/5d260ef213e83b1a872a57e9285f7feace6594ef/Get.png)


PUT 


![image alt](https://github.com/My-Codes-21/160923733064-Mohammed_Sarfaraaz/blob/5d260ef213e83b1a872a57e9285f7feace6594ef/PUT.png)


DELETE


![image alt](https://github.com/My-Codes-21/160923733064-Mohammed_Sarfaraaz/blob/5d260ef213e83b1a872a57e9285f7feace6594ef/Delete.png)





