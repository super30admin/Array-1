// TC : O(m*n)
// SC : O(1)

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0 ) return new int[] {};
        
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int index =0;
        int r=0,c=0;
        // dir =1 => upward direction, dir = -1 downward direction
        int dir=1; 
        
        while(index < m*n)
        {
            result[index] = mat[r][c]; 
            index++;
            if(dir==1){  
                //if we go beyond last column it'll be out of bounds
                if(c==n-1){
                    dir = -1;
                    r++;
                }
                // if we go beyond first row it'll be out of bounds
                else if(r==0){
                    dir = -1;
                    c++;
                }
                // general soltution while traversing
                else{
                    r--;
                    c++;
                }
            }
            else{
                //if we go beyond last row it'll be out of bounds
                if(r==m-1){
                    dir = 1;
                    c++;
                }
                //if we go beyond first column it'll be out of bounds                
                else if(c==0){
                    dir = 1;
                    r++;
                }
                // general soltution while traversing
                else{
                    r++;
                    c--;
                }
        
                }
        }
        return result;
}
}