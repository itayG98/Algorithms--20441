public class sortMod {

    public void sortModUlo(int [] arr, int k){
        int temp ;
        int ptr= 0;
        for (int i=0 ; i<k ;i++){
            for (int j = ptr ; j< arr.length; j++){
                if (arr[j]%k == i){
                    temp = arr[ptr];
                    arr[ptr] =arr[j];
                    arr[j] = temp;
                    ptr++;
                }
            }
        }
    }
}
