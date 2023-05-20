public class ScanAllSubsets {

    static class Subsets {

        public static boolean findPositiveSubsetWithSub(int[] arr , int num){
            System.out.println("Looking for sum :"+num);
            return findPositiveSubsetWithSub(arr,num,0);
        }

        private static boolean findPositiveSubsetWithSub(int[] arr, int num, int start) {
            if (arr.length - 1 == start)
                return num == 0;
            if (num < 0)
                return false;
            return findPositiveSubsetWithSub(arr,num-arr[start],start+1) ||
                    findPositiveSubsetWithSub(arr,num,start+1);
        }
    }
}
