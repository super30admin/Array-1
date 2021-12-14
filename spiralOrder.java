// Time Complexity : O(m*n) // m=column and n= rows.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
First iteration is move right,down,left,up.
To avoid overlap make sure current row is valid.
For each iteration update boundaries row_start,row_end, col_start and col_end.
}*/
// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row_start = 0;
        int row_end = matrix.length -1;
        int col_start = 0;
        int col_end = matrix[0].length - 1;

        List<Integer> res = new ArrayList<>();

        int r = 0;
        int c = 0;

        while(r <= row_end && c <= col_end){
            //move right
            while(c <= col_end){
                res.add(matrix[r][c]);
                c++;
            }
            row_start++;
            r++;
            c--;

            if(row_start > row_end)break;
            //move down
            while(r <= row_end){
                res.add(matrix[r][c]);
                r++;
            }
            c--;
            col_end--;
            r--;

            if(col_end < col_start)break;
            //move left
            while(c >= col_start){
                res.add(matrix[r][c]);
                c--;
            }
            r--;
            row_end--;
            c++;
            // move up
            while(r >= row_start){
                res.add(matrix[r][c]);
                r--;
            }
            c++;
            col_start++;
            r++;
        }

        return res;
    }
} 