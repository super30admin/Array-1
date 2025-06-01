//Time complexity - O(m*n)
//Space complexity - O(1)
// Did you solve on leetcode - yes
// Problems faced - no
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m= mat.length;
        int n= mat[0].length, i=0,j=0,k=0;
        boolean flag = true;
        int result[] = new int[m*n];
        while(k<m*n) {
            result[k++] = mat[i][j];

            if(flag) {
                if(j==n-1) {
                    i++;
                    flag = false;
                } else if(i==0) {
                    j++;
                                        flag = false;

                } else {
                    i--;
                    j++;
                }
            } else {
                if(i == m-1) {
                    j++;
                    flag = true;

                } else if(j==0) {
                    i++;
                    flag = true;

                } else {
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}
