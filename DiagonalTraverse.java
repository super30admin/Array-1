// Time Complexity : O(nm)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//a. we initialise our result as n*m to store all the values
//b. we need to create a rule that going up is divisible by 2, but going down is not - and make the cases like that

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int result[] = new int[m*n];//initialise to n*m times to store all values from mat
        
        int row = 0;
        int col = 0;
        
        for(int i=0;i<result.length;i++){
            result[i] = mat[row][col];
            
            //case 1 - go up
            if((row+col)%2==0){
                if(col==n-1){
                    row++;
                }
                else if(row==0){
                    col++;
                }
                else{//to keep moving up we need to decrement row and increment col
                    row--;
                    col++;
                }
            }
            //case 2 - go down
            else{
                if(row==m-1){
                    col++;
                }
                else if(col==0){
                    row++;
                }
                else{//to keep moving down we need to increment row and decrement col
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
}