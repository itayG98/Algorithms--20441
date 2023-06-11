public class friends3Question {

    public static int friends3(int[][] mat){
        return friends3(mat,0 , 1 , 2  , 0);
    }

    private static int friends3(int[][] mat, int i, int j, int k, int count) {
        if (i == mat.length)
            return count;
        if (j == mat.length)
            return friends3(mat,i+1,0,0,count);
        if (k == mat.length)
            return friends3(mat,i,j+1,0,count);
        if(i<j && j<k && mat[i][j] == 1 && mat[j][k] == 1 && mat[k][i]==1){
            System.out.println(i+","+j+","+k);
            count++;
        }
        return friends3(mat,i,j,k+1,count);
    }


}
