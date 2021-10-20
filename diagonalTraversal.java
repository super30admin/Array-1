// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int direction =1; // 1 = up 0= down;
        int[] diagonal = new int[mat.length * mat[0].length];
        
        int row = 0;
        int column = 0;
        
        for(int i=0 ;i< mat.length * mat[0].length; i++){
            
        diagonal[i] = mat[row][column];   
            
        if(direction == 1){
            if(column == mat[0].length -1){
                row++;
                direction = 0;
            }
            else if(row == 0){
                column ++;
                direction = 0;
            }else{
                row -- ;
                column++;
            }
        }else{
             if(row == mat.length-1){
                column++;
                direction = 1;
            }
            else if(column == 0){
                row++;
                direction = 1;
            }else{
                row ++ ;
                column--;
            } 
        }
        }
        return diagonal;
    }
}