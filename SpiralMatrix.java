/**
 * Time Complexity : O(n) where n = size of array
 * Space Complexity: O(n)
 */

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length==0) return result;
        int m = matrix.length;
        int n = matrix[0].length;
        int left,top,bottom,right;
        left = top = 0;
        bottom = m-1;
        right = n-1;
        while(left<=right && top<=bottom){
            //top row
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }top++;
            
            //right col
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }right--;
            
            if(top<=bottom){
                //bottom row
                for(int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
            }
            bottom--;
            
            if(left<=right){
                //left col
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }   
            }
            
            left++;
        }
        return result;
    }

    public static void main(String args[]){
        SpiralMatrix obj = new SpiralMatrix();
        int[][] myArr = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> result = new ArrayList<>();
        result = obj.spiralOrder(myArr);
        for(int x: result){
            System.out.print(x+",");
        }
    }
}