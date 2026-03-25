import org.junit.Test;
public class SortMergeLMTest {
    @Test
    public void test_empty() {
        Integer[] a = new Integer[0];
        Integer[] result = SortMerge.sort(a, a.length);
        assert Arrays.equals(result, new Integer[0]);
    }
    @Test
    public void test_singleElement() {
        Integer[] a = new Integer[]{1};
        Integer[] result = SortMerge.sort(a, a.length);
        assert Arrays.equals(result, new Integer[]{1});
    }
    @Test
    public void test_duplicates() {
        Integer[] a = {2, 4, 6, 8, 10};
        Integer[] result = SortMerge.sort(a, a.length);
        assert Arrays.equals(result, new Integer[]{2, 4, 6, 8, 10});
    }
    @Test
    public void test_already_sorted() {
        Integer[] a = {1, 2, 3, 4, 5};
        Integer[] result = SortMerge.sort(a, a.length);
        assert Arrays.equals(result, new Integer[]{1, 2, 3, 4, 5});
    }
    @Test
    public void test_reverse_sorted() {
        Integer[] a = {5, 4, 3, 2, 1};
        Integer[] result = SortMerge.sort(a, a.length);
        assert Arrays.equals(result, new Integer[]{1, 2, 3, 4, 5});
    }
}

