package com.j2ee.lab9.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import com.j2ee.lab9.Model.Task;
import com.j2ee.lab9.Model.TaskRepository;

@WebServlet("/taskList") 
public class TaskController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private TaskRepository taskRepository = new TaskRepository();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve all tasks and set them as a request attribute
        List<Task> tasks = taskRepository.getAllTasks();
        request.setAttribute("tasks", tasks);

        // Forward the request to taskList.jsp located in WEB-INF/views
        request.getRequestDispatcher("/WEB-INF/views/taskList.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if ("add".equals(action)) {
            // Add a new task
            String description = request.getParameter("description");
            String status = request.getParameter("status");
            taskRepository.addTask(description, status);

            // Redirect to /taskList to display the updated task list
            response.sendRedirect("taskList");
        } else if ("delete".equals(action)) {
            // Delete an existing task
            int id = Integer.parseInt(request.getParameter("id"));
            taskRepository.deleteTask(id);

            // Redirect to /taskList to display the updated task list
            response.sendRedirect("taskList");
        }
    }
}
