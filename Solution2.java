//Space Complexity: O(1)
//Time complexity: O(rows*column)
class Solution2 {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length ==0) return new int[0];
        int m = matrix.length;
        int n = matrix[0].length;
        int [] result = new int [m*n];
        int index = 0;
        int i=0; int j=0;
        int direction = 1;
        
        while(index<result.length){
            result[index]= matrix[i][j];
            if(direction == 1){
              if(j == n-1){
                  i++;
                  direction =-1;
              }  else if(i==0){
                  j++;
                  direction =-1;
              }else{
                  i--;
                  j++;
              }
              }
            
            else{
                if(i == m-1){
                    j++; direction =1;
                }else if(j==0){
                    direction = 1;
                    i++;
                }else{
                    i++;
                    j--;
                }
            }index++;
        }
        return result;
    }
}