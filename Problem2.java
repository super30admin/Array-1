// Time Complexity :O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//follow pattern with controlled by flag with up and down; update row and colum
// on edge cases

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int i=0;
        int j=0;
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        boolean flag=true;
        for(int idx=0;idx< result.length;idx++){
            result[idx] = mat[i][j];
            if(flag){
                if(j == mat[0].length-1){
                    flag = false;
                    i++;
                }else if(i==0){
                    flag=false;
                    j++;
                }else{
                    i--;
                    j++;
                }

            }else{
                  if(i == mat.length-1){
                    flag = true;
                    j++;
                }else if(j==0){
                    flag=true;
                    i++;
                }else{
                    j--;
                    i++;
                }
            }
        }
        return result;
    }
}