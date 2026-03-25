Here is a sample JUnit 4 test suite for the provided `Triangle` class in Java 11 syntax:
```java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleLMTest {

    @Test
    public void classifyTriangle_Invalid() {
        assertEquals(INVALID, Triangle.classifyTriangle(-1, -1, -1));
        assertEquals(INVALID, Triangle.classifyTriangle(0, 0, 0));
        assertEquals(INVALID, Triangle.classifyTriangle(2, 2, 3));
    }

    @Test
    public void classifyTriangle_ScaleNE() {
        assertEquals(SCALENE, Triangle.classifyTriangle(1, 4, 5));
        assertEquals(SCALENE, Triangle.classifyTriangle(10, 20, 30));
        assertEquals(SCALENE, Triangle.classifyTriangle(40, 80, 100));
    }

    @Test
    public void classifyTriangle_Equilateral() {
        assertEquals(EQUILATERAL, Triangle.classifyTriangle(1, 2, 3));
        assertEquals(EQUILATERAL, Triangle.classifyTriangle(6, 8, 10));
        assertEquals(EQUILATERAL, Triangle.classifyTriangle(15, 20, 30));
    }

    @Test
    public void classifyTriangle_Isosceles() {
        assertEquals(ISOSCELES, Triangle.classifyTriangle(3, 4, 5));
        assertEquals(ISOSCELES, Triangle.classifyTriangle(6, 8, 10));
        assertEquals(ISOSCELES, Triangle.classifyTriangle(15, 20, 25));
    }

    @Test
    public void classifyTriangle_ScaleNotNE() {
        assertEquals(INVALID, Triangle.classifyTriangle(-1, -2, -3));
        assertEquals(INVALID, Triangle.classifyTriangle(0, 4, 5));
        assertEquals(INVALID, Triangle.classifyTriangle(10, 20, 30));
    }

    @Test
    public void classifyTriangle_EquilateralIsNotScaleNE() {
        assertEquals(EQUILATERAL, Triangle.classifyTriangle(1, 2, 3));
        assertEquals(EQUILATERAL, Triangle.classifyTriangle(6, 8, 10));
        assertEquals(INVALID, Triangle.classifyTriangle(15, 20, 25));
    }

}
```
This test suite covers all the branches of the `classify` method by creating separate tests for each case:

*   Invalid input (a ≤ b ≤ c with a + b > c)
*   ScaleNE
*   Equilateral
*   Isosceles
*   Scale not NE

Note that I've used JUnit 4 annotations (`@Test`) and assertions (`assertEquals`) as per the requirements. The test methods are also organized in a way that covers all possible branches of the `classify` method, making it easier to maintain and extend.

