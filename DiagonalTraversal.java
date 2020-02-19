/*
Time Complexity : O(m*n)
Space Complexity -O(1)

*/
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int r=0, c=0;
        int maxRow = matrix.length; 
        if(maxRow== 0)
            return new int[maxRow];
        int maxCol = matrix[0].length;
        int []res = new int[maxRow*maxCol];
        int index=0;
        while(r < maxRow && c < maxCol){
            //add cur element in the result array
            res[index++] = matrix[r][c];
            // going upward
            if((r+c)%2 == 0){ 
                //while going upward if col reaches last col increase row index
                if(c == maxCol-1)
                    r++;
                //while going upward if I am exhaused will all the rows, I will be increasing the col index
                else if(r == 0)
                    c++;
                //else i will increase the col index and decrease the row index
                else{
                    r--;
                    c++;
                }
            }
            else{
                //going downward
                 //while going downward if row reaches last row increase col index
                if(r == maxRow-1)
                    c++;
                //while going downward if I am exhaused will all the columns i will be increasing the row index
                else if(c == 0)
                    r++;
                //else i will increase the row index and decrease the col index
                else{
                    r++;
                    c--;
                }                 
            }            
        }
        return res;
    }
}
