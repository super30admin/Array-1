class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if (matrix == null || matrix.length == 0)
            return new int[0];
        
        int[] res =new int[matrix[0].length * matrix.length];
        int count = 0;
        int i=0,j=0;
        while(count < matrix[0].length * matrix.length){
                res[count] = matrix[i][j];

            int sum = (i+j)%2;
            if(sum==0){
                if(j!=matrix[0].length-1){
                    if(i!=0){
                        i--;
                    }
                    j++;
                }
                else if(j == matrix[0].length-1) {
                    i++;
                }          


            }
            else{
                if(i!=matrix.length-1){
                    if(j!=0){
                        j--;
                    }
                    i++;
                }
                else if(i==matrix.length-1){
                    j++;
                }   
            }
                count++;
            }
       
        return res;
    }
}