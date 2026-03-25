import org.junit.Test;
public class TriangleLMTest {

    public Triangle triangle = new Triangle();

    @Test
    public void testClassifyWithInvalidInput() {
        int[] sides = {1, 2, -3};
        REQUIRE that triangle.classifyTriangle(sides) == INVALID;
    }

    @Test
    public void testClassifyWithScaleNEInput() {
        int[] sides = {-10, 20, 30};
        REQUIRE that triangle.classifyTriangle(sides) == SCALENE;
    }

    @Test
    public void testClassifyWithEQUILATERALInput() {
        int[] sides = {1, 2, 3};
        REQUIRE that triangle.classifyTriangle(sides) == EQUILATERAL;
    }

    @Test
    public void testClassifyWithISOSCELESInput() {
        int[] sides = {1, 1, 4};
        REQUIRE that triangle.classifyTriangle(sides) == ISOSCELES;
    }

    @Test
    public void testClassifyWithScaleNEAndEQUILATERALInput() {
        int[] sides = {-10, 20, 30, 60};
        REQUIRE that triangle.classifyTriangle(sides) == SCALENE;
    }

}

