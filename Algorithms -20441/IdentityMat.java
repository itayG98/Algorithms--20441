public class IdentityMat {

    public static boolean isIdentity( int[][] mat ,int x , int size){
        return isIdentity(mat,x,size,x,x);
    }

    private static boolean isIdentity(int[][] mat, int x, int size, int i, int j) {

        if (i == x+size-1 && j == x+size-1)
            return mat[i][j] == 1 ;
        if (i == j)
            return mat[i][j] == 1 && isIdentity(mat,x,size,i,j+1);
        if (j == x+size-1)
            return mat[i][j] == 0 && isIdentity(mat,x,size,i+1,x);
        return mat[i][j] == 0 && isIdentity(mat,x,size,i,j+1);
    }
}
