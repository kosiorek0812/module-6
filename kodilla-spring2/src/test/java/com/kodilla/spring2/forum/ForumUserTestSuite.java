package com.kodilla.spring2.forum;

import com.kodilla.spring2.forum.User;
import com.kodilla.spring2.forum.ForumUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes=SpringBootConfiguration.class)
public class ForumUserTestSuite {

    @Test
    void testUserName() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring2");
        User user = context.getBean(ForumUser.class);

        //When
        String username = user.getUsername();

        //Then
        assertEquals("John Smith", username);


    }
}
