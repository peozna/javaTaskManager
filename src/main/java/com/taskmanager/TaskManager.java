package com.taskmanager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> taskList = new ArrayList<>();

    private int nextTaskId = 1;

    public boolean createTask(String title, String description, LocalDate deadline, int id) {
        Task newTask = new Task(title, description, deadline, nextTaskId);
        taskList.add(newTask);
        nextTaskId++;

        return true;
    }

    public boolean removeTask(int id) {
       return taskList.removeIf(task -> task.getTaskId() == id);
    }

    public List<String> getAllTasksAsString() {
        List<String> result = new ArrayList<>();

        for (Task task : taskList) {
            result.add(task.getTask());
        }
        return result;
    }

}
