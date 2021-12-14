// Time Complexity :O(n*m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

//Take dir variable as flag and when the boundary conditions are met, invert flag to print the desired pattern

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length ==0) return new int[] {};
        int m = mat.length;
        int n = mat[0].length;
        int dir = 1;
        int[] result = new int[m * n];
        int index = 0, i = 0, j = 0;
        while(index < m * n){
            result[index] = mat[i][j];
            index++;
            if(dir == 1){
                if(j == n-1){
                    dir = -1;
                    i++;
                }
                else if(i == 0){
                    dir  = -1;
                    j++;
                }
                else{
                    i--;
                    j++;
                }
            }
            else{
                if(i == m-1){
                    dir = 1;
                    j++;
                }
                else if(j == 0){
                    dir  = 1;
                    i++;
                }
                else{
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}