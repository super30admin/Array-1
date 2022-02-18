// Time Complexity : O(N)
// Space Complexity :O(1) [no extra space is required]
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: 

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    	//result list
        List<Integer> a = new ArrayList<Integer>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top =0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int matSize = m*n;
        while(a.size() < matSize){
            //forward
            for(int i=left;i<=right && a.size()<matSize;i++){
                a.add(matrix[top][i]);
            }
            top++;
            //downward
            for(int i=top;i<=bottom && a.size()<matSize;i++){
                a.add(matrix[i][right]);
            }
            right--;
            //backward
            for(int i=right;i>=left && a.size()<matSize;i--){
                a.add(matrix[bottom][i]);
            }
            bottom--;
            //upward
            for(int i=bottom;i>=top && a.size()<matSize;i--){
                a.add(matrix[i][left]);
            }
            left++;
            
        }
        return a;
    }
}