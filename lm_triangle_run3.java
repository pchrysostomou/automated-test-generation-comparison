Here is a JUnit 4 test suite in Java 11 syntax for your Triangle class:
```
public class TriangleLMTest {

    @Test
    public void testInvalidTriangle() {
        // Arrange
        int a = 1;
        int b = 2;
        int c = 3;

        // Act and Assert
        assertEquals(INVALID, Triangle.classifyTriangle(a, b, c));
    }

    @Test
    public void testIsosceles() {
        // Arrange
        int a = 3;
        int b = 4;
        int c = 5;

        // Act and Assert
        assertEquals(ISOSCELES, Triangle.classifyTriangle(a, b, c));
    }

    @Test
    public void testEquilateral() {
        // Arrange
        int a = 6;
        int b = 7;
        int c = 8;

        // Act and Assert
        assertEquals(EQUILATERAL, Triangle.classifyTriangle(a, b, c));
    }

    @Test
    public void testScalingIsosceles() {
        // Arrange
        int a = 3;
        int b = 6;
        int c = 9;

        // Act and Assert
        assertEquals(ISOSCELES, Triangle.classifyTriangle(a, b, c));
    }

    @Test
    public void testScalingEquilateral() {
        // Arrange
        int a = 6;
        int b = 8;
        int c = 12;

        // Act and Assert
        assertEquals(EQUILATERAL, Triangle.classifyTriangle(a, b, c));
    }

    @Test
    public void testScalingInvalid() {
        // Arrange
        int a = 1;
        int b = 2;
        int c = 3;

        // Act and Assert
        assertEquals(SCALENE, Triangle.classifyTriangle(a, b, c));
    }
}
```
This test suite covers all possible branches of the classify method:

* Invalid triangle (a <= b <= c)
* Isosceles triangle (a == b or a == c)
* Equilateral triangle (a == b == c)
* Scaling isosceles triangle (a == b and a != c, or a == c and a != b)
* Scaling equilateral triangle (b == c and a != b, or b == c and b != a)

