
// Time Complexity :O(m*n)
// Space Complexity :O(m*n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: changing the direction of traversal when reached 
//end points. Looking for end cases when j==m-1 and i==n-1.

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int idx = 0;
        int[] output = new int[m*n];
        int i=0,j=0;
        int dir = 1;
        
        while(idx<m*n){
            output[idx]= mat[i][j];
            idx++;
            
            if (dir == 1 ){
            if(j==m-1){ // endcase when traversing reaches last element in the row
                i++;
                dir = -1;
                
            } else if ( i == 0){ // change of direction
                j++;
                dir = -1;
            }else { // in general traversing through dir 1
                i--;
                j++;
            }
                } else{
                if(i==n-1){
                j++;
                dir = 1;
                
            } else if ( j == 0){
                i++;
                dir = 1;
            }else {
                j--;
                i++;
            }
        }
        
    }return output;
    }
}