// Time - O(MN)
// Space - O(1)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<Integer>();
        
        int m = matrix.length, n = matrix[0].length;
        
        int top = 0, left = 0, right = n - 1, bottom = m - 1;
        
        while(top<=bottom && left <=right) {
            for(int i=left;i<=right;i++) {
                result.add(matrix[top][i]);
            }
            top++;
            
            if(top<=bottom && left<=right) {
                for(int i=top;i<=bottom;i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            }
            
            if(top<=bottom && left <= right) {                            
                for(int i = right;i>=left;i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;                
            }
            
            if(top<=bottom && left <= right) {
                for(int i=bottom; i>= top;i--) {
                    result.add(matrix[i][left]);
                }
                left++;                
            }
        }
        
        return result;
        
    }
}
