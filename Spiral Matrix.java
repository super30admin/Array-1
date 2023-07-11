// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/* We need to maintain four pointers top, bottom, left and right and place them in the four corners of the matrix. When the top row is traversed we increment left pointer by one.
 * When right column is traversed, we decrement the right pointer by one. Then we traverse the bottom row and decrement its value by one. Then we traverse the left column and increment it by one.
 * As soon as the top pointer crosses bottom or the left pointer crosses right, it means the spiral is complete
 */
// Your code here along with comments explaining your approach


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length, n=matrix[0].length;
        int top=0,bottom=m-1,left=0,right=n-1;

        List<Integer> result=new ArrayList<>();

        while(top<=bottom && left<=right)
        {
            //traversing on the top row
            for(int j=left; j<=right;j++)
            {
                result.add(matrix[top][j]); // the column keeps incrementing
            }
//Once we have reached the right we move the top to the next row
            top++;  

            //traversing on the right row, from top to bottom
            for(int i=top;i<=bottom;i++)
            {
                result.add(matrix[i][right]);
            }
//Once we have reached the bottom we move the right to the previous column
            right--;

//Since the variable top from the base condition is mutated, and its boundary is not being checked in the for loop, we need to make sure it is lesser than bottom
            if(top<=bottom)
            {
                //traversing on the bottom row, from right to left
                for(int j=right;j>=left;j--)
                {
                    result.add(matrix[bottom][j]);
                }

//Once we have reached the left we move the bottom to the previous row
                bottom--;

            }

//Since the variable left from the base condition is mutated, and its boundary is not being checked in the for loop, we need to make sure it is lesser than right
            if(left<=right)
            {
                //traversing on the left row, from bottom to top
                for(int i=bottom;i>=top;i--)
                {
                    result.add(matrix[i][left]);
                }
//Once we have reached the top we move the left to the next column
                left++;
            }
        }

        return result;
    }
}