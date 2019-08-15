import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTypeTest {

    @Test
    void triangleTypeTest1() {
        int a = 2;
        int b = 2;
        int c = 2;

        String expected = "equilateral triangle";
        String result = TriangleType.TriangleTypeTest(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void triangleTypeTest2() {
        int a = 2;
        int b = 2;
        int c = 3;

        String expected = "isosceles triangle";
        String result = TriangleType.TriangleTypeTest(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void triangleTypeTest3() {
        int a = 3;
        int b = 4;
        int c = 5;

        String expected = "triangle";
        String result = TriangleType.TriangleTypeTest(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void triangleTypeTest4() {
        int a = 8;
        int b = 2;
        int c = 3;

        String expected = "not the triangle";
        String result = TriangleType.TriangleTypeTest(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void triangleTypeTest5() {
        int a = -1;
        int b = 2;
        int c = 1;

        String expected = "not the triangle";
        String result = TriangleType.TriangleTypeTest(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void triangleTypeTest6() {
        int a = 0;
        int b = 1;
        int c = 1;

        String expected = "not the triangle";
        String result = TriangleType.TriangleTypeTest(a, b, c);
        assertEquals(expected, result);
    }
}