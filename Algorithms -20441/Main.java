import java.util.Random;

public class Main {

    public static void main(String[] args) {


//        boolean [] orig = {false,true,false,false,true};
//        boolean [] targ = {false,false,false,false,false};
//        System.out.println(DiscoLight.Disco.disco(orig,targ));
//
//
//        int[] arr = generateRandomArray(15,10,0);
//        printArray(arr, arr.length);
//        ScanAllSubsets sc = new ScanAllSubsets();
//        System.out.println(ScanAllSubsets.Subsets.findPositiveSubsetWithSub(arr,1));


//        QuickSort ob = new QuickSort();
//        ob.quickSort(arr,0,arr.length-1);
//        printArray(arr, arr.length);
//        System.out.println(FlatSubSet.StaticFlatSubSet.longestFlat(arr));

//        System.out.println(IntegersInto751.CalcBase.oneFiveSeven(52));
//
//
//        String expr = "([{}])";
//
//        // Function call
//        if (BalancedBrackets.areBracketsBalanced(expr))
//            System.out.println("Balanced ");
//        else
//            System.out.println("Not Balanced ");


//        int[][] mat = { {0,1,1,1 }, { 1,0,1,1} , { 1,1,0,1 }, { 1,1,1,0}} ;
//
//        System.out.println(friends3Question.friends3(mat));

        //SelectedPrimesCalc.SelectedPrimes(819819000,1);
        //System.out.println(SelectedPrimesCalc.SelectedPrimes(1234567,1));


        //A a1 = new A();
        //B b1 = new B();
        //C c1 = new C();

//        intList ls = new intList();
//        for (int i =1 ; i<7 ; i++){ls.addNode(i);}
//        ls.printList();
//        System.out.println("\n-------------------------------");
//        ls = ls.secret(2);
//        ls.printList();
//        System.out.println("\n-------------------------------");
//        intList ls2 = new intList();
//        ls2.addNode(1);
//        ls2.addNode(2);
//        ls2.addNode(1);
//        ls2.addNode(5);
//        ls2.addNode(3);
//        ls2.addNode(4);
//        ls2.addNode(3);
//        ls2.printList();
//        ls.secret(3);
//        System.out.println("\n-------------------------------");
//        ls2.printList();
//
//        System.out.println(BalancedBrackets.countPairs(10));

        System.out.println(SuperIncQuestion.superInc(new int[]{1,4,10,40,100}, 54));

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



