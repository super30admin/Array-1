class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
      //tc: O(mn) sc:O(1)
        int m=mat.length;
        int n=mat[0].length;
        int[] result=new int[m*n];
        int r=0;int c=0;int idx=0;
        while(idx<m*n){
    
            result[idx++]=mat[r][c];
            //up
             if((r+c) % 2 == 0){
                if(c == n-1){
                    r++;
                }
                else if(r == 0){
                    c++;
                }
                else{
                    r--;
                    c++;
                }
            }
            // DOWN 
            else{   
            if(r ==  m-1){
                c++;
            }
            else if( c == 0){
                r++;
            }
            else{
                r++;
                c--;
            }
            
        }}
        return result;
    }
}
