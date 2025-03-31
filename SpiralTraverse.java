import java.util.ArrayList;
import java.util.List;
// Time Complexity :  O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*

This code traverses a 2D matrix in a spiral order, collecting elements in a list.
 It uses four boundaries—top, bottom, left,
 and right—to control movement and ensure every element is visited exactly once.
 The traversal moves left to right along the top, top to bottom along the right,
 right to left along the bottom, and bottom to top along the left.
 After each pass, the corresponding boundary is adjusted to shrink the traversal area.
 These conditions ensure the algorithm efficiently covers the matrix in O(m × n)
 time without using extra space.
*/


class SpiralTraverse {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<Integer>();
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int top=0;
        int bottom=m-1;
        int right = n-1;


        while(top<=bottom && left<=right)
        {

            for(int i=left;i<=right;i++)
            {
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }


            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    ans.add(matrix[i][left]);
                }
                left++;
            }



        }

        return ans;
    }
}