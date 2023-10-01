public class Main {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
