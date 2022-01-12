// Time Complexity : O(m*n)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : Yes
// Any issues faced: No Problems faced

// Your code here along with comments explaining your approach
public class Problem2 {
	public int[] findDiagonalOrder(int[][] mat) {
        if(mat==null || mat.length==0) {
            return new int[0];
        }
        int m = mat.length;
        int n = mat[0].length;
        int[] result  =new int[m*n];
        int i=0; int dir = 1;
        int r = 0; int c = 0;
        while(i<m*n) {
            result[i] = mat[r][c];
            i++;
            if(dir==1) {
                if(c==n-1) {
                    dir = -1;
                    r++;
                } else if(r==0) {
                    dir = -1;
                    c++;
                } else {
                    c++; r--;
                }
            } else {
                if(r==m-1) {
                    dir = 1;
                    c++;
                } else if(c==0) {
                    dir = 1;
                    r++;
                } else {
                    c--; r++;
                }
            }
        }
        return result;
    }
}
