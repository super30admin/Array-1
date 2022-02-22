/*
    Time Complexity : O(rows * columns)
    Space Complexity : O(1)
*/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        
        int row = 0;
        int col = 0;
        int rows = matrix.length - 1;
        int cols = matrix[0].length - 1;
        
        int noOfele = matrix.length * matrix[0].length;
        
        int counter = 0;
        
        while(counter < noOfele){
            
            for(int j = col; j <= cols && counter < noOfele; j++){
                res.add(matrix[row][j]);
                counter++;
            }
            row++;
            
            for(int i = row; i <= rows && counter < noOfele; i++){
                res.add(matrix[i][cols]);
                counter++;
            }
            cols--;
            
            for(int j = cols; j >= col && counter < noOfele; j--){
                res.add(matrix[rows][j]);
                counter++;
            }
            rows--;
            
            for(int i = rows; i >=row && counter < noOfele; i--){
                res.add(matrix[i][col]);
                counter++;
            }
            col++;
            
        }
        
        return res;
    }
}
