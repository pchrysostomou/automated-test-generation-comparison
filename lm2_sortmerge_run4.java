import org.junit.Test;
public class SortMergeLMTest {
    @Test
    public void testEmptyArray() {
        Integer[] a = {};
        int expected[] = new Integer[0];
        Integer[] result = sort(a, 0);
        assert Arrays.equals(result, expected);
    }

    @Test
    public void testSingleElementArray() {
        Integer[] a = {5};
        int expected[] = {5};
        Integer[] result = sort(a, 0);
        assert Arrays.equals(result, expected);
    }

    @Test
    public void testDuplicatesArray() {
        Integer[] a = {1,2,3,4,5,6,7,8,9};
        int expected[] = new Integer[0];
        Integer[] result = sort(a, 0);
        assert Arrays.equals(result, expected);
    }

    @Test
    public void testAlreadySortedArray() {
        Integer[] a = {1,2,3,4,5,6,7,8,9};
        int expected[] = new Integer[0];
        Integer[] result = sort(a, 0);
        assert Arrays.equals(result, expected);
    }

    @Test
    public void testReverseSortedArray() {
        Integer[] a = {1,2,3,4,5,6,7,8,9};
        int expected[] = new Integer[0];
        Integer[] result = sort(a, 0);
        assert Arrays.equals(result, expected);
    }

}

