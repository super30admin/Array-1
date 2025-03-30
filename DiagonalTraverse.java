// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Approach:
// Break the matrix elements into upward and downward directions,
// upwards element shifts one unit up and one unit right at a time and vice versa for downwards elements,
// the top most, right most, bottom most and left most are considered the edge cases.


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[] result=new int[m*n];
        if(mat.length==0) return result;
        boolean dir=true;
        int idx=0;
        int i=0;
        int j=0;
        while(idx<m*n){
            result[idx]=mat[i][j];
            idx++;
            if(dir){
                if(j==n-1){
                    i++;
                    dir=false;
                }
                else if(i==0){
                    j++;
                    dir=false;
                }
                else{
                    i--;j++;
                }
            }
            else{
                if(i==m-1){
                    j++;
                    dir=true;
                }
                else if(j==0){
                    i++;
                    dir=true;
                }
                else{
                    i++;j--;
                }
            }
        }
        return result;
    }
}