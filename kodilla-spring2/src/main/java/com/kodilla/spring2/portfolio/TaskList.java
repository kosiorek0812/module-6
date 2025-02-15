package com.kodilla.spring2.portfolio;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class TaskList {
    private List<String> tasks;
    private String name;


    public TaskList(String name) {
        this.tasks = new ArrayList<>();
        this.name = name;
    }
    public void addTask(String task) {
        tasks.add(task);
    }
    public List<String> getTasks() {
        return tasks;
    }
}
