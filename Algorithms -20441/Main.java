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

//        System.out.println(SuperIncQuestion.superInc(new int[]{1,2,3,2,1}, 54));

/*
        System.out.println(KalmostSorted.kAlmostSearch(new int[]{1,2,0,0,0,3,4,5,6,7,0,0,0,10,12},4));


        BinaryTree tree = new BinaryTree(new BinaryTreeNode(1));
        tree.root.right = new BinaryTreeNode(3);
        tree.root.left = new BinaryTreeNode(2);
        tree.root.left.right = new BinaryTreeNode(5);
        tree.root.left.right.right = new BinaryTreeNode(8);
        tree.root.left.right.left = new BinaryTreeNode(7);
        tree.root.left.right.left.right = new BinaryTreeNode(9);
        tree.root.left.left = new BinaryTreeNode(4);
        tree.root.left.left.left = new BinaryTreeNode(6);

        tree.printInorder();

        System.out.println("\n"+BinaryTree.f(tree.root));
        System.out.println("\n"+BinaryTree.secret(tree.root));

        BinaryTree tree2 = new BinaryTree(BinaryTree.what(new int[] {2,3,4,7,9,12,13,14}));
        tree2.printInorder();
*/

//        System.out.println(longestSeq.longestSequemce(new int[] {0,0,0,0,0,0,0,0,1,0,1,1,1,1,0,1},2));

        int[][] matrix = {
                {1, 0, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1}
        };
        int[][] matrix2 = {
                {1 ,0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 1, 1, 0},
                {1, 0, 0, 1, 0},
                {0, 0, 0, 0, 1}
        };
        System.out.println(IdentityMat.isIdentity(matrix,1,3)); //False
        System.out.println(IdentityMat.isIdentity(matrix,2,2)); //True
        System.out.println(IdentityMat.isIdentity(matrix2,3,2)); //True
        System.out.println(IdentityMat.isIdentity(matrix2,0,5)); //False
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



