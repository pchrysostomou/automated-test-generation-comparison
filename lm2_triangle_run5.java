import org.junit.Test;
public class TriangleLMTest {

    @Test
    public void testInvalid() {
        Triangle LM = new Triangle(10, 5, 15);
        Assert.assertEquals(INVALID, LM.classifyTriangle(LM.a, LM.b, LM.c));
    }

    @Test
    public void testIsosceles() {
        Triangle LM = new Triangle(7, 8, 9);
        Assert.assertEquals(ISOSCELES, LM.classifyTriangle(LM.a, LM.b, LM.c));
    }

    @Test
    public void testEquilateral() {
        Triangle LM = new Triangle(3, 4, 5);
        Assert.assertEquals(EQUILATERAL, LM.classifyTriangle(LM.a, LM.b, LM.c));
    }

    @Test
    public void testScaleNE() {
        Triangle LM = new Triangle(6, 8, 10);
        Assert.assertEquals(SCALENE, LM.classifyTriangle(LM.a, LM.b, LM.c));
    }

