// Time Complexity : O(m * n), m=rows, n=cols
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english:
// We define 4 boundaries (top, bottom, left, right) and keep updating them as we traverse.
// At each step, we go left→right, top→bottom, right→left, and bottom→top, collecting elements in spiral order.
// We continue this until all elements are visited (i.e., top > bottom or left > right).


import java.util.*;
public class SpiralOrder {
    public List<Integer> solve(int[][] matrix){
        if(matrix==null || matrix.length==0){
            return new ArrayList<>();
        }
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;

        while(top<=bottom && left<=right){

            // Move from left to right
            if(top<=bottom && left<=right){
                for(int i=left; i<=right; i++){
                    res.add(matrix[top][i]);
                }
                top++;
            }
            //Move from top to bottom
            if(top<=bottom && left<=right){
                for(int i=top; i<=bottom; i++){
                    res.add(matrix[i][right]);
                }
                right--;
            }
            //Move from right to left
            if(top<=bottom && left<=right){
                for(int i = right; i>=left;i--){
                    res.add(matrix[bottom][i]);

                }
                bottom--;
            }
            //Move from bottom to top
            if(top<=bottom && left<=right){
                for(int i=bottom; i>=top;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }


        }
        return res;


    }
    public static void main(String[]args){
        SpiralOrder ob = new SpiralOrder();
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] matrix2 = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        List<Integer> res = ob.solve(matrix);
        List<Integer> res2 = ob.solve(matrix2);

        System.out.println("Sprial order is: "+res);
        System.out.println("Spiral order is: "+res2);
        


    }
    
}
