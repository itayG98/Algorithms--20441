public class QuickSort {
    // Function to swap two elements
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * This function takes first element as pivot, the
     * function places the pivot element(first element) on its
     * sorted position and all the element lesser than pivot
     * will place left to it, and all the element greater than
     * pivot placed right to it.
     */
    private int partition(int[] arr, int low, int high) {
        // First element as pivot
        int pivot = arr[low];
        int st = low; // st points to the starting of array
        int end = high; // end points to the ending of the array
        int k = high;
        for (int i = high; i > low; i--) {
            if (arr[i] > pivot)
                swap(arr, i, k--);
        }
        swap(arr, low, k);
        // As we got pivot element index is end
        // now pivot element is at its sorted position
        // return pivot element index (end)
        return k;
    }

    /* The main function that implements QuickSort
    arr[] --> Array to be sorted,
    low --> Starting index,
    high --> Ending index */
    public void quickSort(int[] arr, int low, int high) {
        // If low is lesser than high
        if (low < high) {
            // idx is index of pivot element which is at its
            // sorted position
            int idx = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, idx - 1);
            quickSort(arr, idx + 1, high);
        }
    }
}
