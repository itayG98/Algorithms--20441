public class KalmostSorted {

    public static int kAlmostSearch(int[] a, int num) {

        int left = 0;
        int right = a.length-1;
        while (left <= right) {

            int mid = (left + right) / 2;
            if (a[mid] == num)
                return mid;

            while (mid > left && a[mid] == 0) {
                mid--;
            }
            if (a[mid] == num)
                return mid;
            if (a[mid] < num)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return 1;

    }
}
