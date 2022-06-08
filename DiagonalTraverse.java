// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int[] res = new int[mat.length * mat[0].length];
        int index = 0;
        int dir = 1;
        int i = 0,j = 0;
        while(index<mat.length * mat[0].length) {
            if(dir==1) {
                res[index++] = mat[i][j];
                if(i==0 && j!=mat[0].length-1)
                {
                    dir = -1;
                    j++;
                }else if(j == mat[0].length-1)
                {
                    dir = -1;
                    i++;
                }else{
                    i--;
                    j++;
                }
            }else{
                res[index++] = mat[i][j];
                if(j==0 && i!=mat.length-1)
                {
                    dir = 1;
                    i++;
                }else if(i == mat.length-1)
                {
                    dir = 1;
                    j++;
                }else{
                    j--;
                    i++;
                }
            }
        }
        
        return res;
    }
}
