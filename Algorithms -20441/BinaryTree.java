public class BinaryTree {

    public BinaryTreeNode root;


    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(BinaryTreeNode node) {
        this.root = node;
    }

    public void printInorder() {
        printInorderRecursive(root);
    }

    private void printInorderRecursive(BinaryTreeNode node) {
        if (node == null) {
            return;
        }

        printInorderRecursive(node.left);
        System.out.print(node.value + " ");
        printInorderRecursive(node.right);
    }

    public static int f(BinaryTreeNode node) {
        if (node == null)
            return 0;
        int left = f(node.left);
        int right = f(node.right);
        return 1 + (left > right ? left : right);
    }

    public static boolean secret(BinaryTreeNode node) {
        if (node == null)
            return true;
        int left = f(node.left);
        int right = f(node.right);

        return Math.abs(left - right) <= 1 &&
                secret(node.right) &&
                secret(node.left);

    }

    public static BinaryTreeNode what(int[] arr) {
        return what(arr, 0, arr.length - 1);
    }

    private static BinaryTreeNode what(int[] arr, int k, int j) {

        if (k > j)
            return null;
        int m = (k + j) / 2;
        BinaryTreeNode node = new BinaryTreeNode(arr[m]);
        node.left = what(arr, k, m - 1);
        node.right = what(arr, m+1, j);
        return node;

    }

}

