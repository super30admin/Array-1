// Time Complexity : O(MN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: No issues

// Your code here along with comments explaining your approach:
// we are taking 4 pointers as boundaries to the matix top, bottom , left and right. 
// first we will move from left to right in the top row then increment top.
// then on the right col .. we will move from top to bottom and decrement right
// then we will move from right to left on the bottom row .. and decrement bottom.
// then we will move from bottom to top on the left row and incremnt left. (while top<=bottom && left<=right)
// as we are using while loop and mutating the variables that are in the condition we need to check them again after mutating else extra elements will be printed

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0;
        int bottom=matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        List<Integer> result = new ArrayList<>();
        while(top<=bottom && left<=right)
        {
            //top
            for(int i=left;i<=right;i++)
                result.add(matrix[top][i]);
            
            top++;
            //right
            // if(top<=bottom && left<=right) no need to check the condition here as we are mutating only top and top and bottom are
            // getting checked in the for loop
            for(int i=top;i<=bottom;i++)
            {
                result.add(matrix[i][right]);
            }
            right--;
            
        

            if(top<=bottom){ // no need to check for left and right as for loop will take care of it
            //bottom
            for(int i=right;i>=left;i--)
            {
                result.add(matrix[bottom][i]);
            }
            bottom--;
            }
            
    

            if(left<=right){// no need to check for top and bottom as for loop will take care of it
            //left
            for(int i=bottom;i>=top;i--)
            {
                result.add(matrix[i][left]);
            }
            }
            left++;
        


        }
    return result;
    }
}