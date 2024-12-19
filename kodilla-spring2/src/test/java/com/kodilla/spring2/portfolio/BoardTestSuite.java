package com.kodilla.spring2.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BoardTestSuite {

    @Test
    void testBoard() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring2.portfolio");

        //When
        TaskList toDoList = (TaskList) context.getBean("toDoList");
        TaskList inProgressList = (TaskList) context.getBean("inProgressList");
        TaskList doneList = (TaskList) context.getBean("doneList");
        Board board = context.getBean(Board.class);

        toDoList.addTask("task 1");
        toDoList.addTask("task 2");
        inProgressList.addTask("task 5");
        inProgressList.addTask("task 6");
        doneList.addTask("task 7");
        doneList.addTask("task 8");

        //Then
        assertEquals("task 1", toDoList.getTasks().get(0));
        assertEquals("task 2", toDoList.getTasks().get(1));
        assertEquals("task 5", inProgressList.getTasks().get(0));
        assertEquals("task 6", inProgressList.getTasks().get(1));
        assertEquals("task 7", doneList.getTasks().get(0));
        assertEquals("task 8", doneList.getTasks().get(1));

    }

    @Test
    void testContext() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring2.portfolio");

        //When & Then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }
}
