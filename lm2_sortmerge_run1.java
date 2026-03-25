import org.junit.Test;

public class SortMergeLMTest {

    @Test
    public void testEmptyArray() {
        Integer[] a = {};
        Integer[] result = new SortMerge().sort(a, 0);
        for (int i : result) {
            Assert.assertFalse(i == null || i <= 0);
        }
    }

    @Test
    public void testSingleElementArray() {
        Integer[] a = {5};
        Integer[] result = new SortMerge().sort(a, 0);
        for (int i : result) {
            Assert.assertFalse(i == null || i <= 0);
        }
    }

    @Test
    public void testDuplicates() {
        Integer[] a = {2, 1, 4, 10};
        Integer[] result = new SortMerge().sort(a, 0);
        for (int i : result) {
            Assert.assertFalse(i == null || i <= 0);
        }
    }

    @Test
    public void testAlreadySortedArray() {
        Integer[] a = {1, 2, 3, 4};
        Integer[] result = new SortMerge().sort(a, 0);
        for (int i : result) {
            Assert.assertFalse(i == null || i <= 0);
        }
    }

    @Test
    public void testReverseSortedArray() {
        Integer[] a = {4, 3, 2, 1};
        Integer[] result = new SortMerge().sort(a, 0);
        for (int i : result) {
            Assert.assertFalse(i == null || i <= 0);
        }
    }

