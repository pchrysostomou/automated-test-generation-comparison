Here is a JUnit 4 test suite in Java 11 syntax that meets your requirements:

```java
package TriangleLMTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TriangleLMTest {

    @Test
    public void testInvalidTriangle() {
        int[] sides = {5, 6, 7};
        assertEquals(INVALID, Triangle.classifyTriangle(sides[0], sides[1], sides[2]));
    }

    @Test
    public void testIsoscelesTriangle() {
        int[] sides = {3, 4, 5};
        assertEquals(ISOSCELES, Triangle.classifyTriangle(sides[0], sides[1], sides[2]));
    }

    @Test
    public void testEquilateralTriangle() {
        int[] sides = {3, 3, 3};
        assertEquals(EQUILATERAL, Triangle.classifyTriangle(sides[0], sides[1], sides[2]));
    }

    @Test
    public void testScaleNETriangle() {
        int[] sides = {4, 5, 6};
        assertEquals(SCALENE, Triangle.classifyTriangle(sides[0], sides[1], sides[2]));
    }

    @Test
    public void testScaleneTriangle() {
        int[] sides = {3, 4, 7};
        assertEquals(SCALENE, Triangle.classifyTriangle(sides[0], sides[1], sides[2]));
    }
}
```

This test suite covers all possible branches of the `classifyTriangle` method. The tests include:

* A test case for an invalid triangle
* Tests for isosceles and equilateral triangles
* Tests for a scale ne triangle (where two sides are equal but one side is larger)
* One test case for a scalene triangle where all three sides are different

