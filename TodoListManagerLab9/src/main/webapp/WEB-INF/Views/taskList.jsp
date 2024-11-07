<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.j2ee.lab9.Model.Task" %>
<!DOCTYPE html>
<html>
<head>
    <title>Task List</title>
    <link rel="stylesheet" type="text/css" href="css/taskList.css">
</head>
<body>
    <div class="task-list-container">
        <h1>Task List</h1>
        
        <!-- Link to add a new task -->
        <a href="addTask.jsp" class="add-task-link">Add New Task</a>
        
        <!-- Task list table -->
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Description</th>
                    <th>Status</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<Task> tasks = (List<Task>) request.getAttribute("tasks");
                    if (tasks != null && !tasks.isEmpty()) {
                        for (Task task : tasks) {
                %>
                    <tr>
                        <td><%= task.getId() %></td>
                        <td><%= task.getDescription() %></td>
                        <td><%= task.getStatus() %></td>
                        <td>
                            <form action="taskList" method="post" style="display:inline;">
                                <input type="hidden" name="action" value="delete">
                                <input type="hidden" name="id" value="<%= task.getId() %>">
                                <button type="submit">Delete</button>
                            </form>
                        </td>
                    </tr>
                <%
                        }
                    } else {
                %>
                    <tr>
                        <td colspan="4">No tasks available.</td>
                    </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>
</body>
</html>
