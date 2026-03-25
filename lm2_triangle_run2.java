import org.junit.Test;

public class TriangleLMTest {

    @Test
    public void testClassifyTriangle0() {
        int[] result = new int[3];
        result[0] = 1;
        result[1] = 2;
        result[2] = 0;
        int actual = Triangle.classifyTriangle(result[0], result[1], result[2]);
        Assert.assertTrue(actual == INVALID);
    }

    @Test
    public void testClassifyTriangle1() {
        int[] result = new int[3];
        result[0] = 1;
        result[1] = 1;
        result[2] = 0;
        int actual = Triangle.classifyTriangle(result[0], result[1], result[2]);
        Assert.assertTrue(actual == EQUILATERAL);
    }

    @Test
    public void testClassifyTriangle11() {
        int[] result = new int[3];
        result[0] = 5;
        result[1] = 6;
        result[2] = 7;
        int actual = Triangle.classifyTriangle(result[0], result[1], result[2]);
        Assert.assertTrue(actual == ISOSCELES);
    }

    @Test
    public void testClassifyTriangle12() {
        int[] result = new int[3];
        result[0] = 5;
        result[1] = 6;
        result[2] = 10;
        int actual = Triangle.classifyTriangle(result[0], result[1], result[2]);
        Assert.assertTrue(actual == SCALENE);
    }

}

