import org.junit.Test;

public class TriangleLMTest {

    @Test
    public void testInvalid() {
        int a = 1;
        int b = 2;
        int c = 3;
        int result = Triangle.classifyTriangle(a, b, c);
        assertEquals(INVALID, result);
    }

    @Test
    public void testEQUILATERAL() {
        int a = 1;
        int b = 2;
        int c = 3;
        int result = Triangle.classifyTriangle(a, b, c);
        assertEquals(EQUILATERAL, result);
    }

    @Test
    public void testISOSCELES() {
        int a = 1;
        int b = 2;
        int c = 3;
        int result = Triangle.classifyTriangle(a, b, c);
        assertEquals(ISOSCELES, result);
    }

    @Test
    public void testSCALENE() {
        int a = 10;
        int b = 20;
        int c = 30;
        int result = Triangle.classifyTriangle(a, b, c);
        assertEquals(SCALENE, result);
    }
}

