// Time Complexity : O(n*m) where n is number of rows and m is no of columns in matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        //Basic sanitation check
        if(matrix.length==0 || matrix==null) return new int[0];
        
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        //Resultant array
        int[] result = new int[rows*columns];
        
        //Some variables used for later
        int i=0;int dir=1;
        int r=0;int c=0;
        
        while(i<rows*columns){
            result[i]=matrix[r][c];//element at each value
            
            //direction upwards
            if(dir==1){
        //check for columns out of bound exception, these has to come before r==0 condition
                if(c==columns-1){
                    r++;
                    dir=-1;//change the direction
                }
                else if(r==0){
                    c++;//increment column if not out-of-bounds
                    dir=-1;
                }
                else{//Normal condition
                    r--;
                    c++;
                }
            }
            //dir=-1 -> direction downwards
            else{
        //check for rows out of bound exception, these has to come before c==0 condition
                if(r==rows-1){
                    c++;
                    dir=1;//change the direction
                }
                else if(c==0){
                    r++;//increment row if not out-of-bounds
                    dir=1;
                }
                else{//Normal condition
                    r++;
                    c--;
                }
            }
             i++;
        }
       return result;     
    }
   
}
