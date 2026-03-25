import org.junit.Test;

public class TriangleLMTest {

    @Test
    public void testInvalid() {
        Triangle LM = new Triangle(1, 2, 3);
        assertEquals(INVALID, LM.classifyTriangle(1, 2, 3));
    }

    @Test
    public void testScaleNe() {
        Triangle LM = new Triangle(1, 1, 1);
        assertEquals(SCALENE, LM.classifyTriangle(1, 1, 1));
    }

    @Test
    public void testEquilateral() {
        Triangle LM = new Triangle(3, 4, 5);
        assertEquals(EQUILATERAL, LM.classifyTriangle(3, 4, 5));
    }

    @Test
    public void testIsosceles() {
        Triangle LM = new Triangle(2, 2, 2);
        assertEquals(ISOSCELES, LM.classifyTriangle(2, 2, 2));
    }
}

