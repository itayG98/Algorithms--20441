public class FlatSubSet {
    static class StaticFlatSubSet {

        public static int longestFlat(int[] arr) {
            return longestFlat(arr, 0, 0);
        }

        public static int longestFlat(int[] arr, int i, int max) {
            if (i == arr.length)
                return max;
            max = Math.max(max, lengthFlatSequence(arr, i));
            return Math.max(max, lengthFlatSequence(arr, i + 1));
        }

        public static int lengthFlatSequence(int[] arr, int i) {
            return lengthFlatSequence(arr, i, arr[i], arr[i]);
        }

        private static int lengthFlatSequence(int[] arr, int i, int val1, int val2) {
            if (i == arr.length)
                return 0;
            if (arr[i] == val1 || arr[i] == val2)
                return 1 + lengthFlatSequence(arr, i + 1, val1, val2);
            if (val1 == val2 && Math.abs(arr[i] - val1) == 1)
                return 1 + lengthFlatSequence(arr, i + 1, val1, arr[i]);
            return 0;
        }
    }
}