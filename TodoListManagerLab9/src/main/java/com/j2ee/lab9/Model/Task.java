package com.j2ee.lab9.Model;

public class Task {

	private Integer id;          
    private String description;   
    private String status;        

    // Constructor
    public Task(Integer id, String description, String status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }

    // Default constructor (optional if needed)
    public Task() {
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Override toString method for easier debugging (optional)
    @Override
    public String toString() {
        return "Task [id=" + id + ", description=" + description + ", status=" + status + "]";
    }
}
