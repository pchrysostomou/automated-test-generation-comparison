import static org.junit.Assert.*;

public class TriangleTest {

    private void checkClassification(int[][] triangles, int expectedResult) {
        for (int[] triangle: triangles) {
            int triangleType = Triangle.classifyTriangle(triangle[0], triangle[1], triangle[2]);
            assertEquals(expectedResult, triangleType);
        }
    }

    @org.junit.Test
    public void testInvalidTriangles() throws Exception {
        int[][] invalidTriangles = {{1, 2, 9}, {-1, 1, 1}, {1, -1, 1}, {1, 1, -1}, {100, 80, 10000}};
        checkClassification(invalidTriangles, Triangle.INVALID);
    }

    @org.junit.Test
    public void testEqualitaralTriangles() throws Exception {
        int[][] equalitaralTriangles = {{1, 1, 1}, {100, 100, 100}, {99, 99, 99}};
        checkClassification(equalitaralTriangles, Triangle.EQUILATERAL);
    }

    @org.junit.Test
    public void testIsoscelesTriangles() throws Exception {
        int[][] isoscelesTriangles = {{100, 90, 90}, {1000, 900, 900}, {3,2,2}, {30,16,16}};
        checkClassification(isoscelesTriangles, Triangle.ISOSCELES);
    }

    @org.junit.Test
    public void testScaleneTriangles() throws Exception {
        int[][] scaleneTriangles = {{5, 4, 3}, {1000, 900, 101}, {3,20,21}, {999, 501, 600}};
        checkClassification(scaleneTriangles, Triangle.SCALENE);
    }

}
