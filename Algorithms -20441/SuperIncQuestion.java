public class SuperIncQuestion {

    public static boolean superInc(int [] arr , int k){
        for (int i = arr.length-1 ; i>=0 && k > 0 ; i-- ){
            if(k >= arr[i]){
                k-=arr[i];
            }
        }
        return k ==0 ;
    }
}
