// Time Complexity :O(n*m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
// To be able to diagonally print the element ,we either go upwards or downwards, we are maintaining the value for direction,
//if the direction is +1 ,that means we are moving upwards and if -1 means downwards.
//if we are moving upwards we can change our direction in first row or last colounm or if we move downwards we change our direction,
//at first coloumn or last row


// Your code here along with comments explaining your approach
public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0 ||  matrix[0].length==0){
            return new int[0];
        }
        
        
        int n = matrix.length;
        int m = matrix[0].length;
        int[] result = new int[n * m];
        
        int dir = 1;
        
        int index = 0;
        int i = 0;
        int j = 0;
        while(index < n*m){
               result[index] = matrix[i][j]; 
               index+=1;
            
                if(dir == 1){
                    if(j == m-1){
                        i+=1;
                        dir = -1;
                    }else if(i == 0){
                        j+=1;
                        dir = -1;
                    }else{
                        i-=1;
                        j+=1;
                    }
                }else{
                    if(i==n-1){
                        j+=1;
                        dir = 1;
                    }else if(j==0){
                        i+=1;
                        dir = 1;
                    }else{
                        j-=1;
                        i+=1;
                    }
                }
                
            }
        return result;
        }

}
