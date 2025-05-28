// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Goes through the matrix diagoanly and checks if the pointer exists 
// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] arr = new int[m * n];
        int i = 0, j = 0;
        boolean flag = true;
        for(int idx = 0; idx < m*n; idx++){
            arr[idx] = mat[i][j];

            if(flag){
                if(j == n-1){
                    flag = false;
                    i++;
                }else if(i == 0){
                    flag = false;
                    j++;
                }else{
                    i--;
                    j++;
                }
            }else {
                if(i == m-1){
                    flag = true;
                    j++;
                }else if(j == 0){
                    flag = true;
                    i++;
                }else{
                    j--;
                    i++;
                }
            }
        }
        return arr;
    }
}
