// Leetcode 498 - Diagonal Traverse
// Time - O(mn)
// Space - O(1)

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
// ``//         1-> Up
//         // 0-> Down
        int direction = 1;
        int[] result = new int[mat.length*mat[0].length];
        
        int i =0;
        int row = 0;
        int col = 0;
        
        while(i<result.length){
            
            result[i] = mat[row][col];
            i ++;
            
            if(direction==1){
                if(col==mat[0].length-1){
                    direction = 0;
                    row ++;
                }else if(row == 0){
                                        
                    direction = 0;
                    col ++;
                }else{
                row --;
                col++;
                }
            }
            else{
                if(row == mat.length-1){
                    col++;
                    direction = 1;
                }else if(col==0){
                    row++;
                    direction = 1;
                }else{
                    row++;
                    col--;
                }
            }
        }
        
        return result;
    }
}