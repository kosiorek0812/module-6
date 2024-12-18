package com.kodilla;

import com.kodilla.spring2.shape.Circle;
import com.kodilla.spring2.shape.Shape;
import com.kodilla.spring2.shape.Triangle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes=SpringBootConfiguration.class)
class KodillaSpringApplicationTests {

    @Test
    void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring2");
        Shape shape = context.getBean(Circle.class);

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a circle.", name);
    }

    @Test
    void testTriangleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring2");
        Shape shape = context.getBean(Triangle.class);

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a triangle.", name);
    }

    @Test
    void contextLoads() {
    }

}