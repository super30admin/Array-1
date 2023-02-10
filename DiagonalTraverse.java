//TC:O(m*n)
//SC:O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null|| mat.length == 0) return new int[] {};
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        
        int r=0;
        int c=0;
        int index=0;
        int dir=1;
        
        while(index < result.length){
            result[index] = mat[r][c];
            index++;
            //up
            if(dir==1){
                if(c==n-1){
                    r++;
                    dir = -1;
                }else if(r == 0){
                    c++;
                    dir = -1;
                }else{
                    r--;
                    c++;
                }
            } else{
                //down
                if(r == m-1){
                    c++;
                    dir = 1;
                }else if(c == 0){
                    r++;
                    dir = 1;
                }else{
                    r++;
                    c--;
                }
            }
        }
        
        return result;

    }
}
