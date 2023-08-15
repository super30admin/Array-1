// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution {


    public List<Integer> spiralOrder(int[][] matrix) {
        int m= matrix.length;
        int n= matrix[0].length;
       List<Integer> res = new ArrayList<>();
        int top=0, right =n-1;
        int bottom =m-1, left =0,index=0;

        while(top<=bottom && left<=right)
        {
            for(int i=left ;i<=right;i++){
            res.add( matrix[top][i]);
            }
            top++;

            for(int i= top; i<=bottom;i++)
            {
                res.add( matrix[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int i=right ;i>=left;i--)
            {
                res.add(matrix[bottom][i]);
            }
            }
            bottom--;
            if(left<=right){
            for(int i=bottom ;i>=top ;i--)
            {
               res.add(matrix[i][left]); 
            }
            }
            left++;
        }
        return res;
    }
}