public class DiagonalMatrix {
    /*

      TC : O(m*n) where m: not of rows ,n:no of column in mat
      SC : O(1)

    */
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null || mat.length==0 || mat[0].length==0) return new int[]{};

        int m=mat.length;
        int n=mat[0].length;
        int direction = 1;
        int index=0;
        int result[]=new int[m*n];
        int i=0,j=0;

        while(index<m*n){
            result[index]=mat[i][j];
            index++;
            if(direction==1){
                if(j==n-1){
                    direction=-1;
                    i++;
                }
                else if(i==0){
                    direction =-1;
                    j++;
                }
                else{
                    j++;
                    i--;
                }
            }
            else{
                if(i==m-1){
                    direction=1;
                    j++;
                }
                else if(j==0){
                    direction=1;
                    i++;
                }
                else{
                    j--;
                    i++;
                }
            }
        }
        return result;
    }
}
