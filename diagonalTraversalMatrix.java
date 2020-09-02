    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/diagonal-traverse/
    Time Complexity for operators : o(m*n) .. number of  elements in the matrix
    Extra Space Complexity for operators : o(1) .. Array is the required return type.
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : 

        # Optimized approach same like basic approach: 
                              
            # 1. traverse thru thee array but change  i and j according to the requirement in the question.
              2. Direction flag will be  changed when moving upward and downward.
              3. if i==0 that emans you reached at top then move one position  ahead. If it is last in the forst row then
                 move to the next row and same column.
              4. Similary check on the left side.
              5. return result array.
    */
    import java.util.*;
    public class diagonalTraversalMatrix{
        public static void main(String args[]) {
                    int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
                    int arr[] = maxProfit(matrix);
                    for(int i=0;i<arr.length;i++){
                        System.out.println(arr[i]);
                    }
                }
                
                            
            public static int[] maxProfit(int matrix[][]) {
                if(matrix==null || matrix.length==0 || matrix[0].length==0)
                return new int[0];
            
                int n = matrix.length; int m = matrix[0].length;
                
                int i=0,j=0; int direction = 1;
                
                int output[] = new int[m*n];int index = 0;
                
                while(index< (m*n))
                {
                    output[index] = matrix[i][j];
                    
                    index += 1;
                    
                    if(direction == 1){
                        if(j == m-1){
                            direction = -1;
                            i += 1;
                        }else if(i==0){
                            direction = -1;
                            j += 1; 
                        }else{
                            i -= 1;
                            j += 1;
                        }
                    }else{
                        if(i == n-1){
                            direction = 1;
                            j += 1;
                        }else if(j==0){
                            direction = 1;
                            i += 1; 
                        }else{
                            i += 1;
                            j -= 1;
                        }    
                    }
                }
                return output;
            }
    }