//Time complexity is O(m*n)
//Space complexity is O(m*n)
//Able to submit in leetcode
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int up =0;
        int left=0;
        int down = m-1;
        int right = n-1;
        while(result.size()<(m*n)){
            for(int i=left;i<=right;i++){
                result.add(matrix[up][i]);
            }
            for(int i= up+1;i<=down;i++){
                result.add(matrix[i][right]);
            }
            if(up!=down){
                for(int i=right-1;i>=left;i--){
                    result.add(matrix[down][i]);
                }
            }
            if(left!=right){
                for(int i=down-1;i>up;i--){
                    result.add(matrix[i][left]);
                }
            }
            left=left+1;
            right = right -1;
            up = up+1;
            down = down-1;
        }
        return result;
    }
}