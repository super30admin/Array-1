// 498 diagonal Traverse
// solved on leetcode
// time complexity - O(m*n)
// space complexity - O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int direction =1;
        
        int row=0;
        int rowEnd=mat.length-1;
        int col=0;
        int colEnd=mat[0].length-1;
        int [] result=new int[(rowEnd+1)*(colEnd+1)];
        int i=0;
        
        while(i<(rowEnd+1)*(colEnd+1)){
            result[i]=mat[row][col];
            i++;
            // direction 1 represents moving upwards
            if(direction==1){   
                if(col==colEnd){    // if it touches last column
                    row++;
                    direction--;
                }else if(row==0){    // if it touches rist row
                    col++;
                    direction--;
                }else{
                    row--;
                    col++;
                }
                
            }else{  
                // else represents moving downwards
                if(row==rowEnd){        // if it touches bottom row
                    col++;          
                    direction++;
                }else if(col==0){       // if it touches first column
                    row++;
                    direction++;
                }else{
                    row++;
                    col--;
                }
            }
            
        }
        
        return result;
        
    }
}