//Time Complexity: O(m*n)
//Space Complexity: O(1)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, left = 0, bottom = m-1, right=n-1;
        List<Integer> result = new ArrayList<>();
        //null check
         if(matrix==null|| m == 0) return result;
        while(top<=bottom && left <= right){
            for(int i = left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int j=top;j<=bottom;j++){
                result.add(matrix[j][right]);
            }
            right--;
            if(top<=bottom){
                for(int i =right;i>=left;i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
            }
            
            if(left<=right){
                for(int j = bottom;j>=top;j--){
                result.add(matrix[j][left]);
            }
            left++;
            }
            
        }

        return result;
    
    }
}