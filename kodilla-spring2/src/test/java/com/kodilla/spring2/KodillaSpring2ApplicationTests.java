
import com.kodilla.spring2.shape.Shape;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes= SpringBootConfiguration.class)
class KodillaApplicationTests {

    @Test
    void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring2");
        Shape shape = (Shape)context.getBean("circle");

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
        Shape shape = (Shape)context.getBean("triangle");

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a triangle.", name);
    }

    @Test
    void testSquareLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring2");
        Shape shape = (Shape)context.getBean("createSquare");

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a square.", name);
    }

    @Test
    void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring2");
        Shape shape = (Shape)context.getBean("chosenShape");

        //When
        String name = shape.getShapeName();

        //Then
        System.out.println("Chosen shape says: " + name);
    }
}