// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/*
We take four pointers to help us traverse in all 4 directions. To achieve spiral, we leverage any 2 pointers
to traverse, at the same time depending upon the desired way of output.We also make sure of the boundary
conditions are in check and not crossing each other and subsequently add the matrix elements to our
 output list.
 */


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        int top = 0 , left = 0 , right = colLen - 1, bottom = rowLen - 1;
        List<Integer> spiralList = new ArrayList<>();

        while(top <= bottom && left <= right) {
            for(int i = left ; i <= right ; i++)
                spiralList.add(matrix[top][i]);
            top++;

            for(int i = top ; i <= bottom ; i++)
                spiralList.add(matrix[i][right]);
            right--;

            if(top <= bottom) {
                for(int i = right ; i >= left ; i--)
                    spiralList.add(matrix[bottom][i]);
            }
            bottom--;

            if(left <= right) {
                for(int i = bottom ; i >= top ; i--)
                    spiralList.add(matrix[i][left]);
            }
            left++;
        }
        return spiralList;
    }
}