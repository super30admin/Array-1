// Time Complexity : O(m*n) m-rows n -columns of gvn matrix
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

/**
 * Traversing the matrix in spirals
 * Traverse forward and downwards and check the condition and then traverse backwards and upwards...making one loop and then repeat on the inner rectangles
 */
// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> lst = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0) return lst;

        int top=0,bottom = matrix.length-1,left = 0, right = matrix[0].length-1;

        while(top<=bottom && left <= right){
            for(int i=top;i<=right;i++)                  //forward
                lst.add(matrix[top][i]);
            top++;

            for(int i=top;i<=bottom;i++)                //downward
                lst.add(matrix[i][right]);
            right--;

            if(top<=bottom && left<=right){             //backward
                for(int i=right;i>=left;i--)
                    lst.add(matrix[bottom][i]);
                bottom--;
            }
            if(top<=bottom && left<=right){             //upward
                for(int i=bottom; i>=top;i-- )
                    lst.add(matrix[i][left]);
                left++;
            }
        }
        return lst;
    }
}