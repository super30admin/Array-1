// Time Complexity :O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: start at the top left corner of matrix. Maintain a dir flag for diagonals
// going up and down(initially true -> up). For up diagonals dec row and increment col. For bottom diagonals, inc r, dec c
// If we go out of bounds, reverse direction and move i and j accordingly
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int i=0, j=0, r=0;
        int res[] = new int[mat.length*mat[0].length];
        boolean dir = true; //true for up and false for down
        while(i!=mat.length && j!=mat[0].length){
            res[r++] = mat[i][j];
            if(dir){
                if(j+1>=mat[0].length){
                    i++;
                    dir = false;
                }
                else if(i-1<0){
                    j++;
                    dir = false;
                }
                else{
                    i--; j++;
                }
            }
            else{
                if(i+1>=mat.length){
                    j++;
                    dir = true;
                }
                else if(j-1<0){
                    i++;
                    dir = true;
                }
                else{
                    i++;
                    j--;
                }
            }
        }
        return res;
    }
}