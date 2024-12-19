package com.kodilla.spring2.portfolio;

import org.springframework.stereotype.Component;

public class Board {
    private TaskList toDoList;
    private TaskList doneList;
    private TaskList inProgressList;


    public Board(TaskList toDoList, TaskList doneList, TaskList inProgressList) {
        this.toDoList = toDoList;
        this.doneList = doneList;
        this.inProgressList = inProgressList;
    }

}
