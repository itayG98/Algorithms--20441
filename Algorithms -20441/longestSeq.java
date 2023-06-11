public class longestSeq {

    public static int longestSequemce(int[] a , int k){
        int i=0 , j=0 ;
        while ( j  < a.length){
            if(a[j] == 0)
                k--;
            if(k<0){
                if (a[i] == 0)
                    k++;
                i++;
            }
            j++;
        }
        return j-i;
    }
}
