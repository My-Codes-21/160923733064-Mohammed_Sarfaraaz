<h1> 📝 DESCRIPTION OF THE CODE</h1>
---



This is a simple Spring Boot REST API for managing tasks.
It supports basic CRUD operations (Create, Read, Update, Delete)
using an in-memory data structure





<h1> 📦 PROJECT STRUCTURE OVERVIEW</h1>
---






Task (Model)

A Java class representing a task with fields: id, title, description, and status (currently as String).

Contains getters, setters, and a toString() method.

<h1>Status (Enum)</h1>

An enumeration that defines valid task statuses: TODO, IN_PROGRESS, COMPLETED, BLOCKED.

<h1>TaskService (Service Layer)</h1>

Acts as the business logic layer.

Stores tasks in a Map<Long, Task>, simulating a database.

Handles operations like creating, retrieving, updating, and deleting tasks.

<h1>TaskController (REST Controller)</h1>

Exposes HTTP endpoints for task operations under /tasks.

Uses @RestController and @RequestMapping annotations.

<h1>Supports:</h1>

POST /tasks → Create a new task

GET /tasks/{id} → Get task by ID

GET /tasks → Get all tasks

PUT /tasks/{id} → Update a task

DELETE /tasks/{id} → Delete a task




<h1>POSTMAN WORKING</h1>



open postman click on collections click on plus(+)
icon select blank collectin
then click on add request 
after that follow the below steps



---


<h1>POST</h1>


![image alt](https://github.com/My-Codes-21/160923733064-Mohammed_Sarfaraaz/blob/b5f24f48086361c98eb85ccaabbced42cd0a132b/post.png)


---


<h1>GET</h1>


![image alt](https://github.com/My-Codes-21/160923733064-Mohammed_Sarfaraaz/blob/5d260ef213e83b1a872a57e9285f7feace6594ef/Get.png)

---


<h1>PUT</h1>


![image alt](https://github.com/My-Codes-21/160923733064-Mohammed_Sarfaraaz/blob/5d260ef213e83b1a872a57e9285f7feace6594ef/PUT.png)

---


<h1>DELETE</h1>


![image alt](https://github.com/My-Codes-21/160923733064-Mohammed_Sarfaraaz/blob/5d260ef213e83b1a872a57e9285f7feace6594ef/Delete.png)


---


