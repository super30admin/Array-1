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
    public class spiralMatrix{
        public static void main(String args[]) {
                    int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
                    System.out.println(maxProfit(matrix));
                }
                
                            
            public static List<Integer> maxProfit(int matrix[][]) {
                if(matrix == null || matrix.length == 0 || matrix[0].length==0)
                return new ArrayList<>();
            
                List<Integer> list = new ArrayList<>();
                int n = matrix.length; int m = matrix[0].length;
                int top = 0, left = 0;
                int bottom = n - 1, right = m - 1;
                
                while(top <=bottom && left <=right){
                    
                    // move from left to right
                    
                    for(int i=left;i<=right;i++){
                        list.add(matrix[top][i]);
                    }
                    top += 1; 
                    
                    //move from top to bottom
                    for(int i=top;i<=bottom;i++){
                        list.add(matrix[i][right]);
                    }
                    right -= 1; 
                    
                    //move from right to left
                    if(top<=bottom){
                        for(int i=right;i>=left;i--){
                            list.add(matrix[bottom][i]);
                        }
                        bottom -= 1; 
                    }
                    
                    //move from bottom to top
                    if(left<=right){
                        for(int i=bottom;i>=top;i--){
                            list.add(matrix[i][left]);
                        }
                        left += 1; 
                    }
                }
                
                return list;
            }
    }