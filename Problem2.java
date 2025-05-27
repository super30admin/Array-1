// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] arr = new int[m*n];
        int index = 0;
        int i=0, j=0;
        boolean dir_flag = true;
        for(index=0; index<arr.length; index++){
            arr[index] = mat[i][j];
            if(dir_flag){ // upward direction
                if(j == n-1){       
                    dir_flag = false;
                    i++;
                } else if(i == 0){
                    dir_flag = false;
                    j++;
                } else {
                    i--;
                    j++;
                }
            } else{ //downward direction
                if(i == m-1){       
                    dir_flag = true;
                    j++;
                } else if(j == 0){
                    dir_flag = true;
                    i++;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return arr;
    }
}