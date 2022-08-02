// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// mantain a flag for direcation and index at each iteration. if column and row are going out of bound change direction and update whichever is going
// out of bound.

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return null;
        int dir = 1;
        int m = mat.length;
        int n = mat[0].length;
        int idx=0;
        int[] result = new int[m*n];
        int r=0,c=0;
        while(idx < m*n){
                result[idx] = mat[r][c];
                idx++;
                if(dir==1){
                    if(c== n-1){
                        r++;dir=-1;
                    }
                    else if(r==0){
                        c++;dir=-1;
                    }
                    else{
                        r--;c++;
                    }
                }
                else{
                    if(r== m-1){
                        c++;dir=1;
                    }
                    else if(c==0){
                        r++;dir=1;
                    }
                    else{
                        r++;c--;
                    }
                }
        }
        return result;
        
    }
}
