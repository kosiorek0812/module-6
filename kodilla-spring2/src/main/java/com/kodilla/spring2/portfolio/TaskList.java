package com.kodilla.spring2.portfolio;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class TaskList {
    private List<String> tasks;


    public TaskList() {
        this.tasks = new ArrayList<>();
    }
    public void addTask(String task) {
        tasks.add(task);
    }
    public List<String> getTasks() {
        return tasks;
    }
}
