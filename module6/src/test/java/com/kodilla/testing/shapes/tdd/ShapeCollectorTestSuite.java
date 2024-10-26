package com.kodilla.testing.shapes.tdd;

import org.junit.jupiter.api.*;
import com.kodilla.testing.shapes.*;



@DisplayName("TDD: Shapes Test Suite")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @AfterEach
    public void afterEachTest() {
        System.out.println("Executed test #" + testCounter);
    }
    @DisplayName("ShapeCollector Tests")
    @Nested
    class ShapeCollectorTests {
        @Test
        void testAddFigure() {
            // Given
            Square square = new Square(6.0, "Square");
            ShapeCollector collector = new ShapeCollector();

            // When
            collector.addFigure(square);

            //Then
            Assertions.assertEquals(1, collector.getCollectorQuantity());
        }
        @Test
        void testRemoveFigure() {
            //Given
            Circle circle = new Circle(17.0, "Circle");
            Square square = new Square(6.0, "Square");
            Triangle triangle = new Triangle(11.0, 7.0, "Triangle");
            ShapeCollector collector = new ShapeCollector();

            // When
            collector.addFigure(circle);
            collector.addFigure(square);
            collector.addFigure(triangle);
            collector.removeFigure(circle);

            // Then
            Assertions.assertEquals(2, collector.getCollectorQuantity());
            for (Shape figure : collector.getShapes()) {
                Assertions.assertNotEquals("Circle", figure.getShapeName());
            }

        }
        @Test
        void testRemoveAllFigures() {
            Square square = new Square(6.0, "Square");
            Circle circle = new Circle(17.0, "Circle");
            Triangle triangle = new Triangle(11.0, 7.0, "Triangle");
            ShapeCollector collector = new ShapeCollector();

            collector.addFigure(square);
            collector.addFigure(circle);
            collector.addFigure(triangle);
            collector.removeFigure(square);
            Assertions.assertEquals(2, collector.getCollectorQuantity());
            collector.removeFigure(circle);
            Assertions.assertEquals(1, collector.getCollectorQuantity());
            collector.removeFigure(triangle);
            Assertions.assertEquals(0, collector.getCollectorQuantity());
        }
        @Test
        void testGetFigure() {
            Square square = new Square(6.0, "Square");
            Circle circle = new Circle(17.0, "Circle");
            Triangle triangle = new Triangle(11.0, 7.0, "Triangle");
            ShapeCollector collector = new ShapeCollector();

            collector.addFigure(square);
            collector.addFigure(circle);
            collector.addFigure(triangle);

            Shape figure = collector.getFigure(0);
            Assertions.assertEquals(square, figure);
            Shape figure2 = collector.getFigure(1);
            Assertions.assertEquals(circle, figure2);
            Shape figure3 = collector.getFigure(2);
            Assertions.assertEquals(triangle, figure3);

        }
        @Test
        void testShowFigures() {
            Square square = new Square(6.0, "Square");
            Circle circle = new Circle(17.0, "Circle");
            Triangle triangle = new Triangle(11.0, 7.0, "Triangle");
            ShapeCollector collector = new ShapeCollector();

            collector.addFigure(square);
            collector.addFigure(circle);
            collector.addFigure(triangle);

            String figures = collector.showFigures();
            Assertions.assertEquals("SquareCircleTriangle", collector.showFigures());
        }

    }
    @DisplayName("Shapes Tests")
    @Nested
    class ShapesTest {

        @Test
        void testTriangle() {
            Triangle triangle = new Triangle(11.0, 7.0, "Triangle");
            Assertions.assertEquals(38.5, triangle.getField());
            Assertions.assertEquals("Triangle", triangle.getShapeName());
        }
        @Test
        void testSquare() {
            Square square = new Square(6.0, "Square");
            Assertions.assertEquals(36.0, square.getField());
            Assertions.assertEquals("Square", square.getShapeName());
        }
        @Test
        void testCircle() {
            Circle circle = new Circle(17.0, "Circle");
            Assertions.assertEquals(907.91951, circle.getField());
            Assertions.assertEquals("Circle", circle.getShapeName());

        }
    }


}
