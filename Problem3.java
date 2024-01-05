//Accepted on LT
// The idea here tooo is check for bounds and change the direction

// Time should O(mn)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top =0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        List<Integer> r = new ArrayList<>();
        while(left<=right && top<=bottom){
            for(int j = left ; j<=right;j++){
                 r.add(matrix[top][j]);

            }
            top++;
            for(int i = top;i<=bottom;i++){
               r.add(matrix[i][right]);
            }
            right--;
            if(left>right || top>bottom){
                break;
            }
            for(int i = right;i>=left;i--){
               r.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i = bottom;i>=top;i--){
               r.add(matrix[i][left]);
            }
            left++;


        }
        return r;
    }
}