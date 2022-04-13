// Time Complexity : O(N*M)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

import java.util.*;

public class SpiralMatrix {
    
    
    public static List<Integer> spiralOrder(int[][] matrix) {
        
        if(matrix==null || matrix.length == 0)
        {
            return new ArrayList<>();
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        int top=0,bottom=m-1,left=0,right=n-1;
        
        List<Integer> result = new ArrayList<>();
        
        while(top<=bottom && left<=right)
        {
            //left to right
            
            for(int j=left;j<=right;j++)
            {
                result.add(matrix[top][j]);
            }
            
            top++;
            //top to bottom
           
            for(int i = top;i<=bottom;i++)
            {
                result.add(matrix[i][right]);
            }
            
            right--;
            
            //right to left
            if(top<=bottom){
            for(int j=right;j>=left;j--)
            {
                result.add(matrix[bottom][j]);
            }
            }
            bottom--;
            
            //bottom to top
            if(left<=right){
            for(int i = bottom;i>=top;i--)
            {
                result.add(matrix[i][left]);
            }
            }
            
            left++;
        }
        
        return result;
        
    }

    public static void main(String args[])
    {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

       List<Integer> list =  spiralOrder(matrix);
        for(int i:list)
        {
            System.out.print(i+" ");
        }
    }

}
