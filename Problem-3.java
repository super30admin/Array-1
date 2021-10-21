// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english
// We maintain four flags twofor rows first and last 2 for columns top and bottom.
// According to condtions we update the flag and achieve our output.


// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        
        List<Integer> ls = new ArrayList<>();
        while(ls.size() < (matrix.length * matrix[0].length)) {
            for(int i=left;i<=right;i++) {
                ls.add(matrix[top][i]);
            }
            top++;
            
            for(int i=top;i<=bottom;i++) {
                ls.add(matrix[i][right]);
            }
            right--;
            
            if(bottom >= top) {
                for(int i=right;i>=left;i--) {
                    ls.add(matrix[bottom][i]);
                }
                bottom--;   
            }
            
            if(left <= right) {
                for(int i=bottom;i>=top;i--) {
                    ls.add(matrix[i][left]);
                }
                left++;
            }
            
        }
        return ls;
    }
}