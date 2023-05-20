import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] arr = generateRandomArray(15,10,0);
        printArray(arr, arr.length);
        ScanAllSubsets sc = new ScanAllSubsets();
        System.out.println(ScanAllSubsets.Subsets.findPositiveSubsetWithSub(arr,15));



//        QuickSort ob = new QuickSort();
//        ob.quickSort(arr,0,arr.length-1);
//        printArray(arr, arr.length);
//        System.out.println(FlatSubSet.StaticFlatSubSet.longestFlat(arr));
    }

    public static int[] generateRandomArray(int size , int max , int min) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;// Generate a random integer
        }
        return array;
    }
    public static void printArray(int[] arr, int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}



