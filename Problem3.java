// Time Complexity :O(mn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// followed the pattern and kep track of pointers in all the 4 corner

// Your code here along with comments explaining your approach
import java.util.ArrayList;
import java.util.List;

class Problem3 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output = new ArrayList<>();
        //edge case
        if(matrix == null || matrix.length==0) return output;
        
        int R = matrix.length;
        int C = matrix[0].length;
        int top = 0 , left = 0;
        int bottom = R-1, right = C-1;
        while(top<=bottom && left <=right) // loop invariant;
        {
            //left to right
            for(int i = left; i <=right;i++)
            {
                output.add(matrix[top][i]);
            }
            top++;
            
            // top top bottom
            for(int i = top ; i <=bottom;i++)
            {
                output.add(matrix[i][right]);
            }
            right--;
            
            // right to left
            if(top<=bottom)
            {
                for(int i=right; i >=left;i--)
                {
                    output.add(matrix[bottom][i]);
                }
            }
          
            bottom--;
            
            // bottom to top
            if(left<=right)
            {
                 for(int i = bottom; i >=top;i--)
                {
                    output.add(matrix[i][left]);
                }
            }
            left++;
        }
        return output;
    }
    public static void main(String[] args)
    {
        System.out.println(spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }
}