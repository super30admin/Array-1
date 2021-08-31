// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0, right = matrix[0].length-1, top = 0, bottom = matrix.length-1;
        List<Integer> alist = new ArrayList<>();

        while(top <= bottom && left <= right){
            for(int i=left; i <= right; i++)
                alist.add(matrix[top][i]);

            top++;

            if(top > bottom)
                break;

            for(int i=top; i <= bottom; i++)
                alist.add(matrix[i][right]);

            right--;

            if(left > right)
                break;

            for(int i=right; i >= left; i--)
                alist.add(matrix[bottom][i]);

            bottom--;

            if(top > bottom)
                break;

            for(int i=bottom; i >= top; i--)
                alist.add(matrix[i][left]);

            left++;
        }
        return alist;
    }
}

// Your code here along with comments explaining your approach