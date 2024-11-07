# MVCDesignLab9
STUDENT NAME : SIVA KUMAR
STUDENT NUMBER : N01604510

#PROJECT DESCRIPTION:
Project Description
Task Management System
The Task Management System is a simple Java-based web application developed using the MVC (Model-View-Controller) design pattern. 
It allows US to add, view, and delete tasks. Each task has a unique ID incremented automatically, a description, 
and a status (Pending or Completed).
 It has following structure :

Model: Handles data storage for tasks and provides methods for adding, retrieving, and deleting tasks using the simple ArrayList
View: JSP pages (taskList.jsp and addTask.jsp) display tasks and forms for adding new tasks.
Controller: A servlet (TaskController) manages requests, processes actions (add and delete), and controls navigation between views.
Add Task: Users can add a new task by entering a description and selecting a status. After adding, the task list is updated to include the new task.
View Tasks: The main view displays all tasks in a table format, with options to delete each task.
Delete Task: Users can delete a task from the list by clicking the Delete button next to it. This action updates the task list view.

DEPLOYMENT :

Clone or Download the Project from the provided github link 

Clone the repository and extract it.
Import the Project into the eclipse IDE
Import the project as a Maven or Dynamic Web Project, depending on your IDE’s configuration.

Configure Apache Tomcat in your IDE:
In Eclipse: Go to Servers tab, right-click, select New > Server, and choose the Tomcat version.
Add the project to the server configuration.
Update the web.xml File

Ensure that web.xml (located in WEB-INF) is configured properly for servlets.
Build and Deploy or we can use the @Web servlet 

Run on Server right-click on the project, select Run As > Run on Server, and choose the configured Tomcat server.
Access the Application

Open a web browser and navigate to http://localhost:8080/TodoListManagerLab9/taskList to view the task list.
Use the Add New Task link to add tasks and the Delete button to remove tasks from the list.