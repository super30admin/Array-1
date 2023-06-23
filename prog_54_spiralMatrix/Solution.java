package prog_54_spiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
/*
In this approach , we will be maintaining 4 pointer left, right, top, bottom
we will be incrementing and decrementing the border values
Time Complexity : O(M*N)
Space Complexity : O(M*N)
*/

    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length ; int n = matrix[0].length ;
        int left = 0 ;
        int right = n - 1 ;
        int top = 0 ;
        int bottom =  m - 1 ;
        List<Integer> result = new ArrayList<>();
        int index = 0 ;
        while(left<=right && top<=bottom){ // keep navigating until and unless left crosses right and top crosses bottom

            //Top
            if(left<=right && top<=bottom){ // In while, if we have changed the variable of base case then check them
                //again using if.

                for(int i=left; i<=right; i++){
                    result.add(matrix[top][i]);
                    index ++ ;
                }
                top ++ ;
            }


            //right
            if(left<=right && top<=bottom){ // In while, if we have changed the variable of base case then check them
                //again using if.
                for(int i = top; i<=bottom;i++){
                    result.add(matrix[i][right]);
                    index ++ ;
                }
                right -- ;
            }

            //Bottom
            if(left<=right && top<=bottom){ // In while, if we have changed the variable of base case then check them
                //again using if.
                for(int i =right; i>=left;i--){
                    result.add(matrix[bottom][i]);
                    index ++ ;
                }
                bottom -- ;
            }
            //left
            if(left<=right && top<=bottom){ // In while, if we have changed the variable of base case then check them
                //again using if.
                for(int i = bottom; i>=top;i--){
                    result.add(matrix[i][left]);
                    index ++ ;
                }
                left ++ ;
            }
        }
        return result ;

    }
}
