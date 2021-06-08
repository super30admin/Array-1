// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: iterate over the spiral
// handle case when top crosses bottom  & left crosses the right within the loop

class SpiralMatrix{
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length; int n= matrix[0].length;
        int top = 0; int bottom = m-1;
        int left = 0; int right = n-1;

        while(top<=bottom && left<=right){
            //top
            for(int j=left; j<=right; j++){
                res.add(matrix[top][j]);
            }
            top++;

            //right
            for(int i=top;i<=bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;

            //bottom
            if(top<=bottom){
                for(int j=right; j>=left; j--){
                    res.add(matrix[bottom][j]);
                }
                bottom--;
            }

            //left
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}