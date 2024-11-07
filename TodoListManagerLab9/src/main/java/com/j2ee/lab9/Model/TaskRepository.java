package com.j2ee.lab9.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskRepository {

	
	private List<Task> tasks = new ArrayList<>();  // Simulate storage with a List
    private int currentId = 1;                     // ID tracker for tasks

    // Method to add a new task
    public Task addTask(String description,String status) {
        Task newTask = new Task(currentId++, description, "Pending");
        tasks.add(newTask);
        return newTask;
    }

    // Method to retrieve all tasks
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);  // Return a copy of the list to avoid external modification
    }

    // Method to retrieve a task by ID
    public Optional<Task> getTaskById(int id) {
        return tasks.stream().filter(task -> task.getId() == id).findFirst();
    }

    // Method to delete a task by ID
    public boolean deleteTask(int id) {
        return tasks.removeIf(task -> task.getId() == id);
    }

    // Optional: Update task status by ID
    public boolean updateTaskStatus(int id, String status) {
        Optional<Task> taskOpt = getTaskById(id);
        if (taskOpt.isPresent()) {
            Task task = taskOpt.get();
            task.setStatus(status);
            return true;
        }
        return false;
    }
}
