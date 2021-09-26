// Time Complexity : O(n*m)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// get direction index and take care of o and n - 1 index edge case
// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int [] result = new int[n*m];
        if(mat == null || mat.length == 0) return result;
        int dir = 1;
        int index = 0;
        int i = 0;
        int j = 0;
        while(index < (m*n)){
            result[index++] = mat[i][j];
            if(dir == 1){
                if(j == m-1 ){
                    dir = -1;
                    i++;
                }else if(i == 0) {
                    dir = -1;
                    j++;
                }else{
                    i--;
                    j++;
                }
            }
            else{
                if(i == n-1 ){
                    dir = 1;
                    j++;
                }else if(j == 0){
                    dir = 1;
                    i++;
                }else{
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}