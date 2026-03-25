import org.junit.Test;

public class SortMergeLMTest {

    @Test
    public void testEmptyArray() {
        Integer[] a = new Integer[0];
        Integer[] result = new SortMerge().sort(a, a.length);
        Assert.assertArrayEquals(new Integer[]{}, result);
    }

    @Test
    public void testSingleElementArray() {
        Integer[] a = new Integer[]{5};
        Integer[] result = new SortMerge().sort(a, a.length);
        Assert.assertArrayEquals(new Integer[]{5}, result);
    }

    @Test
    public void testDuplicates() {
        Integer[] a = new Integer[]{2, 1, 3, 4, 5, 6};
        Integer[] result = new SortMerge().sort(a, a.length);
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6}, result);
    }

    @Test
    public void testAlreadySorted() {
        Integer[] a = {1, 2, 3, 4, 5};
        Integer[] result = new SortMerge().sort(a, a.length);
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    public void testReverseSorted() {
        Integer[] a = {5, 4, 3, 2, 1};
        Integer[] result = new SortMerge().sort(a, a.length);
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, result);
    }

}

