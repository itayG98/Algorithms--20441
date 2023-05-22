public class IntegersInto751 {

    public static class CalcBase {

        public static int oneFiveSeven( int n){
            return oneFiveSeven(n,0);
        }

        private static int oneFiveSeven(int n, int counter) {
            if (n == 0)
                return counter;
            int ones = n - 1 >= 0 ? oneFiveSeven(n-1,counter+1) : Integer.MAX_VALUE;
            int five = n - 5 >= 0 ? oneFiveSeven(n-5,counter+1) : Integer.MAX_VALUE;
            int seven = n - 7 >= 0 ? oneFiveSeven(n-7,counter+1) : Integer.MAX_VALUE;
            int min = Math.min(ones,five);
            min = Math.min(min,seven);
            return min;
        }
    }
}
