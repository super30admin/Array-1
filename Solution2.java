/*
    Time Complexity : O(rows * columns)
    Space Complexity : O(1)
*/
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] res = new int[mat.length * mat[0].length];
        
        int noOfele = mat.length * mat[0].length;
        
        boolean UP = true;
        
        int counter = 0;
        
        int row = 0; int col = 0;
        
        while(counter < noOfele){
            
            res[counter] = mat[row][col];
            
            
            if(UP){            
                if(col == mat[0].length - 1){
                    UP = false;
                    row++;
                }else if(row==0){
                    UP = false;
                    col++;
                }else{
                    row--;
                    col++;
                }
            }else{
                if(row == mat.length - 1){
                    UP = true;
                    col++;
                }else if(col == 0){
                    UP = true;
                    row++;
                } else{
                    row++;
                    col--;
                }
            }
            
            counter++;
        }
        
        return res;
    }
}
