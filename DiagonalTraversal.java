// Time Complexity : O(N)
// Space Complexity : O(1), No extra data structure used.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class DiagonalTraversal {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length==0 || mat==null) return new int[]{};

        int r=0,c=0;
        int m=mat.length, n= mat[0].length;
        int[] result=new int[m*n];
        int i=0;
        boolean up=true;
        while(i<m*n){
            result[i]=mat[r][c];
            if(up){
                if(c==n-1){
                    up=false;
                    r++;
                }else if(r==0){
                    up=false;
                    c++;
                }
                else{
                    c++;
                    r--;
                }

            }else{
                if(r==m-1){
                    up=true;
                    c++;
                }
                else if(c==0){
                    up=true;
                    r++;
                }
                else{
                    c--;
                    r++;
                }
            }
            i++;
        }

        return result;
    }
}