// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problems faced while solving this problem? Couldnt solve it before class
// Approach: 
// 1. There are 2 directions : upward & dowward. row value decrements by 1 and col value increments by 1
// 2. Change the direction if col is max or row is 0 while upward and vice versa
// 3. Add elements whenever there is a change in row or col and the return result

public class Problem2 {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0) return new int[0];
        int m=matrix.length;
        int n=matrix[0].length;
        int[] result = new int[m*n];
        int i,r,c,dir;
        i=r=c=0;
        dir = 1;
        while(i<m*n) {
            result[i] = matrix[r][c];
            if(dir==1) {
                if(c==n-1) {
                    r++;
                    dir=-1;
                } else if(r==0) {
                    c++;
                    dir=-1;
                } else {
                    r--; c++;
                }
            } else {
                if(r==m-1) {
                    c++;
                    dir=1;
                } else if(c==0) {
                    r++;
                    dir=1;
                } else {
                    r++;
                    c--;
                }
            }
            i++;
        }
        return result;
    }
}