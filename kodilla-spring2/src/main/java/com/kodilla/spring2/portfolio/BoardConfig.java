package com.kodilla.spring2.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public Board board() {
        return new Board(toDoList(), doneList(), inProgressList());
    }
    @Bean(name = "toDoList")
    public TaskList toDoList() {
        return new TaskList();
    }
    @Bean(name = "doneList")
    public TaskList doneList() {
        return new TaskList();
    }
    @Bean(name = "inProgressList")
    public TaskList inProgressList() {
        return new TaskList();
    }
}
