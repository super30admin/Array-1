// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :

class Diagonal {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int [] res = new int[m*n];
        int index = 0;
        int r = 0;
        int c = 0;
        boolean dir = true;
        while(index<res.length){
            res[index] = mat[r][c];
            index++;
            if(dir){
                if(r-1<0 && c!=n-1){
                    c++;
                    dir = false;
                }
                else if(c==n-1){
                    dir = false;
                    r++;
                }
                else{
                    r--;
                    c++;
                }
            }
            else{
                if(c-1<0 && r!=m-1){
                    dir = true;
                    r++;
                }
                else if(r==m-1){
                    c++;
                    dir = true;
                }
                else{
                    r++;
                    c--;
                }
            }
        }
        return res;
    }
}