public class friends3Question {

    public static int friends3(int[][] mat){
        return friends3(mat,0 , 0 , 0, new int[3]  , 0);
    }

    private static int friends3(int[][] mat, int i, int j, int k, int[] circle, int count) {
        if (i == mat.length)
            return count;
        if (j == mat.length)
            return friends3(mat,i+1,0,0,circle,count);
        if (k == mat.length)
            return friends3(mat,i,j+1,0,circle,count);
        if(i<j && j<k && mat[i][j] == 1 && mat[j][k] == 1 && mat[k][i]==1){
            circle[0] = i;
            circle[1] = j;
            circle[2] = k;
            System.out.println(circle[0]+","+circle[1]+","+circle[2]);
            count++;
        }
        return friends3(mat,i,j,k+1,circle,count);
    }


}
