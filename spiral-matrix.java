//Time complexity: O(m*n), where m is number of rows, and n is number of columns
//Space Complexity: O(1)
//running on leetcode: yes
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix==null || matrix.length==0)
        {
            return new ArrayList<>();
        }
        //make a list of integers: result
        List<Integer> result = new ArrayList<>();
        //rows
        int m = matrix.length;
        //columns
        int n = matrix[0].length;
        //pointers
        int top=0, left=0, bottom=m-1, right=n-1;
        while (top<=bottom && left<=right)
        {
            //left to right, row remains same (top) column changes (left)
            for (int i=left; i<=right; i++)
            {
                result.add(matrix[top][i]);
            }
            //increament top because top row is added in result ans wont be visited again
            top++;
            
            //top to bottom, column is same (right), row changes(top)
            for (int i=top; i<=bottom; i++)
            {
                result.add(matrix[i][right]);
            }
            //done with the last row, so decreament right
            right--;
            
            //right to left, last row, row is same (bottom), column changes (right)
            if (top<=bottom){
            for (int i=right; i>=left; i--)
            {
                result.add(matrix[bottom][i]);
            }
            bottom--;
            }
            
            //bottom to top, same column (left), row changes (bottom)
            //top was increamented so will traverse till second row
            if (left <= right){
            for (int i= bottom; i>=top; i--)
            {
                result.add(matrix[i][left]);
            }
            left++;
            }
        }
        return result;
    }
}
