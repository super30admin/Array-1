/*
Description: Here we consider various edge cases where the direction of iteration must be changed, and list the if else
statements accordingly.
Time Complexity: O(m*n) we use a while loop that iterates m*n times
Space Complexity: O(1) no extra auxillary data spaces are used except primitive variables
*/

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.length == 0) return new int[0];
        
        int m = matrix.length;
        int n = matrix[0].length;
        int result[] = new int[m*n];
        int i=0;//index on resultant array
        int r=0; int c=0; int dir = 1;
        while(i<m*n){
            result[i]=matrix[r][c];
            if(dir==1){  
                if(c==n-1){
                    r++; dir=-1;   //changing of direction to down, when the iteration reaches to right corner of the matrix
                }
                else if(r==0){
                    c++; dir=-1; // changing the direction to down every time iteration reaches top of the matrix
                }else{
                    r--; c++; //moving to next diagonal element at the top right.
                }
            }else{
                if(r==m-1){
                    c++; dir=1; // changing the direction to up, when the iteration reaches the bottom most of the matrix
                }else if(c==0){
                    r++; dir=1; //changing the direction to up, every time it reahces left most of the matrix.
                }else{
                    c--; r++;// moving to next diagonal element at the bottom left.
                }
            }
            i++;
        }
        return result;
    }
}
