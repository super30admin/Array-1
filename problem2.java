// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/* Two main cases that are being checked here is if the direction is upwards or downwards. Each of them has sub-conditions based on the 
position of the element. So, if the direction is upwards and element is on row 0, then we move to the next column and change the direction
If the element is on last column, then we move to the next row and change the direction. Else, for normal element, we decrement the row(move up) and 
increment the column.
Case 2: if the direction is downwards: Subcase- if the row is m-1, then we increment the column and change the direction. 
if the column is 0, then we increment the row and dir=1. Else, for noraml elements, we increment row and decrement the column index */
//Problems faced: checked for r==0 before c==n-1 in the first case which was giving me index out of bounds error.

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null || mat.length==0) return new int[]{};
        int dir=1;
        int m=mat.length;
        int n=mat[0].length;
        int[] result= new int[m*n];
        int idx=0; int r=0; int c=0;
        while(idx < m*n){
            result[idx] = mat[r][c];
            idx++;
            //traverse
            if(dir==1){
                if(c == n-1){
                    r++; dir=-1;
                }else if(r == 0){
                    c++; dir=-1;
                }
                else{
                    r--; c++;
                }
            }
            else{
                if(r == m-1){
                    c++; dir=1;
                }
                else if(c==0){
                    r++; dir=1;
                }
                else {
                    c--; r++;
                }    
            }
        }
        return result;
    }
}