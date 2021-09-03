package Array1;// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

import java.util.ArrayList;

// Your code here along with comments explaining your approach
class FindDiagonalOrder {
    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m*n];
        int dir = 0;
        int count = 0;
        int i = 0, j = 0;
        while(count < m*n){
            ans[count] = mat[i][j];
            count++;
            if(dir == 0){
                if(j==n-1){
                    dir = 1;
                    i++;
                } else if(i==0){
                    j++;
                    dir = 1;
                } else{
                    i--;
                    j++;
                }
            } else {
                if(i==m-1){
                    dir = 0;
                    j++;
                } else if(j==0){
                    i++;
                    dir = 0;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new ArrayList<Integer>() {{ for (int i : new FindDiagonalOrder().findDiagonalOrder(new int[][]{{1,2},{3,4}})) add(i); }});
    }
}