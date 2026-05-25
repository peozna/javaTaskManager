package com.taskmanager;

import java.time.LocalDate;

public class Task {
    private  String title;
    private String description;
    private boolean status;
    private LocalDate deadline;
    private int taskId;

    public Task(String title, String description, LocalDate deadline, int taskId) {
        this.title = title;
        this.description = description;
        this.status = false;
        this.deadline = deadline;
        this.taskId = taskId;
    }

    public int getTaskId() {
        return taskId;
    }
}
