// Time Complexity : O(M*N)
// Space Complexity : O(M*N) if the resultant array space is considered
// Did this code successfully run on Leetcode : Yes
// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new ArrayList<>();
        
     List<Integer> result = new ArrayList<>();
     int top=0, left=0, right=matrix[0].length-1, bottom=matrix.length-1;
    int cursor;
    while(left<=right && top<=bottom)
    {
        for(cursor=left; cursor<=right; cursor++)
            result.add(matrix[top][cursor]);
        top++;
        
        for(cursor=top; cursor<=bottom; cursor++)
            result.add(matrix[cursor][right]);
        right--;
        
        if(top<=bottom){
        for(cursor=right; cursor>=left; cursor--)
            result.add(matrix[bottom][cursor]);
        }
        bottom--;
        
        if(left<=right){
        for(cursor=bottom; cursor>=top; cursor--)
            result.add(matrix[cursor][left]);
        }
        left++;
    }
    return result;
    }
}