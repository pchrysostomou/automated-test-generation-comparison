import org.junit.Test;

public class SortMergeLMTest {

    @Test
    public void testEmpty() {
        Integer[] a = new Integer[0];
        Integer[] expected = null;
        Integer[] result = SortMerge.sort(a, 0);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSingleElement() {
        Integer[] a = {5};
        Integer[] expected = {5};
        Integer[] result = SortMerge.sort(a, 0);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testDuplicates() {
        Integer[] a = {2, 1, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};
        Integer[] result = SortMerge.sort(a, 0);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testAlreadySorted() {
        Integer[] a = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};
        Integer[] result = SortMerge.sort(a, 0);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testReverseSorted() {
        Integer[] a = {5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5};
        Integer[] result = SortMerge.sort(a, 0);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testAllDuplicates() {
        Integer[] a = {2, 2, 1, 1, 3, 3, 4, 4};
        Integer[] expected = {1, 1, 2, 2, 3, 3, 4, 4};
        Integer[] result = SortMerge.sort(a, 0);
        assertArrayEquals(expected, result);
    }

}

