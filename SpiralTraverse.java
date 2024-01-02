// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top =0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        List<Integer> result = new ArrayList<>();
                while(top<=bottom && left<=right)
        {


            //top row 
            for(int j=left; j<=right;j++)
            {
                result.add(matrix[top][j]);
            }
            top = top+1;

            //right column
          
            for(int i=top; i<=bottom; i++)
            {
                result.add(matrix[i][right]);
            }
            right= right-1;
        
            //bottom row
            if(top<=bottom)
            {
            for(int j=right; j>=left; j--)
            {
                result.add(matrix[bottom][j]);
            }
             bottom = bottom -1;
            }
           

            //bottom row
             if(left<=right)
            {
            for(int i=bottom; i>=top; i--)
            {
                result.add(matrix[i][left]);
            }
            left = left + 1;
            }

        }
        return result;
    }

    public static void main(String[] args)
    {
         int [][] mat = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        SpiralTraverse s = new SpiralTraverse();
        List<Integer> list = s.spiralOrder(mat);
        System.out.println(list.toString());
    }
}
