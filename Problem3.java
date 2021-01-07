/**
 * Time complexity - O(n^2)
 * Space complexity - O(1)
 * All test cases passed
 */
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int left = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        List<Integer> list = new ArrayList<>();

        while(left<=right&&top<=bottom)
        {
            //travel from left to right on top row
            for(int i=left; i<=right; i++)
            {
                list.add(matrix[top][i]);
            }
            top++;

            //travel from second row last column to last row last column
            for(int i=top; i<=bottom; i++)
            {
                list.add(matrix[i][right]);
            }
            right--;

            //travel from last row second last column to last row first column
            if(bottom>=top){
                for(int i=right; i>=left; i--)
                {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //travel from second last row first column to second row first column
            if(left<=right)
            {
                for(int i=bottom; i>=top; i--)
                {
                    list.add(matrix[i][left]);
                }
                left++;
            }

        }
        return list;
    }
}