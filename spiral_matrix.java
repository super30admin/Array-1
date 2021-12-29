class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new ArrayList<>(); // if the matrix is not having any values, we return 0;
        List<Integer> result = new ArrayList<>(); // we are initializing an arraylist which stores the result;
        int m = matrix.length; // m is the no. of rows in the matrix
        int n = matrix[0].length; // n is the no. of cols in the matrix.
        int top = 0, bottom = m-1; //boundaries for rows
        int left = 0, right = n-1; // boundaries for cols.
        while(top <= bottom && left <= right){ // top should not exceed bottom and left should not exceed right
            for(int j = left; j <= right; j++){ // first we move from left to right in the top row.
                result.add(matrix[top][j]); // we add the values to the arraylist while we move from left to right in the matrix.
            }
            top++; //we increment the top by 1
            if(top <= bottom && left <= right){
                for(int i = top; i <= bottom; i++){ // now we move from new top to the bottom in the last col
                    result.add(matrix[i][right]); //we add all the elements from top to bottom present in the last col starting from new top.
                }
                right--;// we decrement the right by 1.
            }
            if(top <= bottom && left <= right){
                for(int j = right; j >= left; j--){ // we move from right to left in the last row starting from the new right
                    result.add(matrix[bottom][j]); //  we add the values while we move from right to left;
                }
                bottom--;// we decrement the bottom by 1;
            }
            if(top <= bottom && left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }

        }
        return result;
    }
}


