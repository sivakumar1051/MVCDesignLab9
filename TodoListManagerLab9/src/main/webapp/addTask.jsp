<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Task</title>
    <link rel="stylesheet" type="text/css" href="css/addTask.css">
</head>
<body>
    <div class="add-task-container">
        <h1>Add New Task</h1>
        
        <!-- Task addition form -->
        <form action="taskList" method="post"> <!-- Updated action to /taskList -->
            <input type="hidden" name="action" value="add">
            
            <!-- Description input -->
            <label for="description">Description:</label>
            <input type="text" id="description" name="description" placeholder="Enter task description" required>
            
            <!-- Status dropdown -->
            <label for="status">Status:</label>
            <select id="status" name="status">
                <option value="Pending">Pending</option>
                <option value="Completed">Completed</option>
            </select>
            
            <!-- Submit button -->
            <button type="submit">Add Task</button>
        </form>
    </div>
</body>
</html>
