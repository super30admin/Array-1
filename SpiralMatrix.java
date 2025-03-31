class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        List<Integer> res = new ArrayList<>();
        while(left <= right && top <= bottom){

            for(int i=left; i<=right; i++){
                res.add(matrix[top][i]);
            }
            top++;

            if((left <= right && top <= bottom)){
                for(int i=top; i<=bottom; i++){
                    res.add(matrix[i][right]);
                }
                right--;
            }

            if((left <= right && top <= bottom)){
                for(int i=right; i>=left; i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if((left <= right && top <= bottom)){
                for(int i=bottom; i>=top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;   
    }
}