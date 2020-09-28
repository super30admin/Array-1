// Time Complexity : O(rows*columns)
// Space Complexity : O(rows*columns)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {


        List<Integer> nums = new ArrayList<>();

        if(matrix.length == 0 || matrix == null)
        {
            return nums;
        }
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0, right = matrix[0].length-1;

        int size = matrix.length*matrix[0].length;

        while(nums.size()<size)
        {
            for(int i = left ; i<=right && nums.size()<size ; i++)
            {
                nums.add(matrix[top][i]);
            }
            top++;

            for(int i = top ; i<=bottom && nums.size()<size ; i++)
            {
                nums.add(matrix[i][right]);
            }
            right--;

            for(int i = right ; i>=left && nums.size()<size ; i--)
            {
                nums.add(matrix[bottom][i]);
            }
            bottom--;

            for(int i = bottom ; i>=top && nums.size()<size ; i--)
            {
                nums.add(matrix[i][left]);
            }

            left++;
        }

        return nums;

    }
}
