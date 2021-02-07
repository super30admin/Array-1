// Time Complexity : O(m*n)
// Space Complexity : O(1) list only used for ans
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
// use top bottom left and right pointers to track boundaries and traverse
class Solution {
    public List < Integer > spiralOrder(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int left = 0, right = n-1;
        int top = 0, bottom = m-1;
        
        List<Integer> ans = new ArrayList<>();

        while(ans.size() < m*n){
            
            for(int i = left; i<=right && ans.size() < m*n; i++) 
                ans.add(matrix[top][i]);
            top++;
            
            for(int i = top; i<=bottom && ans.size() < m*n ; i++) 
                ans.add(matrix[i][right]);
            right--;
            
            for(int i = right; i>=left && ans.size() < m*n; i--) 
                ans.add(matrix[bottom][i]);
            bottom--;
            
            
            for(int i = bottom; i>=top && ans.size() < m*n; i--) 
                ans.add(matrix[i][left]);
            left++;
            
        }
        
        return ans;
        
    }
}
