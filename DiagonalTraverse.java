public class DiagonalTraverse {
    /*
    Consider 2 diresctions as dir=1 upwards and dir=-1 as downwards
    Check for change of directions. Both direction has changes under 2 conditions. Need to figure those out.
    Rest every indexing is easy.
    
    Mistake - Missed initial edge case. Also, could not understand how to declare empty array of size 0.
              Also tried doing it using 2 for loops. 
              
    TC -> O(M*N)
    SC -> O(1) as result is the output itself
    */
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0 || matrix == null) return new int[0];
        int m = matrix.length;
        int n = matrix[0].length;
        int[] res = new int[m*n];
        int dir=1;
        
        int i=0, j=0, index=0;
        while(index < m*n){
            res[index] = matrix[i][j];
            
            if(dir==1){
                if(j==n-1){
                    dir=-1;
                    i++;
                }else if(i==0){
                    dir=-1;
                    j++;
                }else{
                    i--;
                    j++;
                }
            }
            else{
                if(i==m-1){
                    dir=1;
                    j++;
                }else if(j==0){
                    dir=1;
                    i++;
                }else{
                    i++;
                    j--;
                }
            }
            index++;
        }
        return res;
    }
}
