class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m-1, left = 0, right = n-1;
        List<Integer> result = new ArrayList<>();
/*
        //for(int i =0; i < m*n; i++)
        //OR
        while(top <= bottom && left <= right){

            for(int i=left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;
            

            // if(top <= bottom && left <= right)
            // {
            //     for(int i = top; i <= bottom; i++){
            //     result.add(matrix[i][right]);
            //     }
            //     right--;
            // }
            
            // if(top <= bottom && left <= right){
            //     for(int i = right; i>= left; i--){
            //     result.add(matrix[bottom][i]);
            //     }
            //     bottom--;
            // }

            // if(top <= bottom && left <= right){
            //     for(int i = bottom; i >= top; i--){
            //     result.add(matrix[i][left]);
            //     }
            //     left++;
            // }


            //OR
            //if(top <= bottom && left <= right)
            {
                for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
                }
                right--;
            }
            
            if(top <= bottom ){
                for(int i = right; i>= left; i--){
                result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom; i >= top; i--){
                result.add(matrix[i][left]);
                }
                left++;
            }
        }
        */

        int idx = 0;
        while(idx < m*n){
            for(int i=left; i<=right; i++){
                result.add(matrix[top][i]);
                idx++;
            }
            top++;

            //if(top <= bottom && left <= right)
            {
                for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
                idx++;
                }
                right--;
            }
            
            if(idx < m*n){
                for(int i = right; i>= left; i--){
                result.add(matrix[bottom][i]);
                idx++;
                }
                bottom--;
            }

            if(idx < m*n){
                for(int i = bottom; i >= top; i--){
                result.add(matrix[i][left]);
                idx++;
                }
                left++;
            }
        }

        return result;
    }
}
