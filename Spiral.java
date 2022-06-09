// Time Complexity :o(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// In this program, we kept four variables for 4 directions. Using them, traverse the matrix and modify the variables

import java.util.ArrayList;
import java.util.List;

public class Spiral {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};  
        
        List<Integer> res = new ArrayList<>();

        res = spiralOrder(matrix);

        for(int i = 0; i < res.size();i++)
        {
            System.out.print(res.get(i)+" ");
        }
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        List<Integer> result = new ArrayList<>();
        
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n -1;
        
        while(top <= bottom && left <= right)
        {
            for(int j = left; j<=right;j++)
            {
                result.add(matrix[top][j]);
            }
            top++;
            
            for(int i = top; i<=bottom;i++)
            {
                result.add(matrix[i][right]);
            }
            right--;
            
            if(top <= bottom){
            for(int j = right;j>=left;j--)
            {
                result.add(matrix[bottom][j]);
            }}
            bottom--;
            
            if(left <= right){
            for(int i = bottom;i>=top;i--)
            {
                result.add(matrix[i][left]);
            }
                left++;
            }
        }
        return result;                
    }    
}
