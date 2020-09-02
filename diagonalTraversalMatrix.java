    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/spiral-matrix/
    Time Complexity for operators : o(m*n) .. number of  elements in the matrix
    Extra Space Complexity for operators : o(1) .. List is the required return type.
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : Traverse thru the entire matrix by considering 4 pointers..

        # Optimized approach same like basic approach: 
                              
            # 1. consider 4 pointers top left pointing to (0,0) theelement. Bottom will be last row and right will be for last column.
              2. Traverse thru the matrix one by one the break condition will be top must be less and equalt to bottom similarly left
                 if lesser and equal to right.
              3. Starting from left to right till the left reaches to the right. Add the elements till that point and then increment
                 the top.
              4. Move from top towards bottom till the top reaches to the bottom. Add the elements till that point and then 
                 decrement the right.
              5. Move from right towards left till the right reaches to the left. Add the elements till that point and then 
                 decrement the bottom. The corner case needs to be considered here. Check if top<=bottom so that element cannot be added again
              6. Move from bottom towards top till the top reaches to the top. Add the elements till that point and then 
                 increment the left. The corner case needs to be considered here. Check if left<=right so that element cannot be added again
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