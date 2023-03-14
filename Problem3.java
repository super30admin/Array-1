// Time: O(N)
// Space: O(1)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
         if (matrix.length == 0) {
            return res;
        }
        int m = matrix.length;
         int n = matrix[0].length;
        int left=0,right=n-1;
        int up = 0, down = m-1;
        while(res.size() < m*n){
            // left to right
            for(int i=left ; i<= right ; i++){
                res.add(matrix[up][i]);
            }
            up++;
            // top to down
            for(int i = up ; i<= down ; i++){
                res.add(matrix[i][right]);
            }
            right--;
            //right to left;
            if(up<=down){
            for(int i = right ; i>= left; i--){
                res.add(matrix[down][i]);
                // System.out.println("adding"+matrix[i][left]);
            }
            }
            down--;
            //down to up
            if(left<=right){
            for(int i = down; i>=up ; i--){
                res.add(matrix[i][left]);
                // System.out.println("adding"+matrix[i][left]);
            }
            }
            left++;
            
        }
        return res;
        
    }
}