import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class MergeSortTest {
    @Test
    public void testMergeSortEmptyArray() {
        int[] arr = {};
        int[] sorted = {};

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);

        assertArrayEquals(sorted, arr);
    }

    @Test
    public void testMergeSortSortedArray() {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] sorted = { 1, 2, 3, 4, 5 };

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);

        assertArrayEquals(sorted, arr);
    }

    @Test
    public void testMergeSortUnsortedArray() {
        int[] arr = { 5, 2, 8, 1, 3 };
        int[] sorted = { 1, 2, 3, 5, 8 };

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);

        assertArrayEquals(sorted, arr);
    }

    @Test
    public void testMergeSortRepeatedValues() {
        int[] arr = { 3, 1, 3, 2, 2, 1 };
        int[] sorted = { 1, 1, 2, 2, 3, 3 };

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);

        assertArrayEquals(sorted, arr);
    }
    @Test
    public void testMergeSortLargeArray() {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int[] sorted = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);

        assertArrayEquals(sorted, arr);
    }
    @Test
    public void testMergeSortDescendingOrderArray() {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int[] sorted = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);

        assertArrayEquals(sorted, arr);
    }
    @Test
    public void testMergeSortSingleElementArray() {
        int[] arr = { 42 };
        int[] sorted = { 42 };

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);

        assertArrayEquals(sorted, arr);
    }
}
