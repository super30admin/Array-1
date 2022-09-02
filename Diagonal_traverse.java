//TimeComplexity O(m*n)
//SpaceComplexity O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        if(mat.length == 0)return new int[] {};
        
        int r = 0;
        int c = 0;
        int m = mat.length;
        int n = mat[0].length;
        int index = 0;
        int dir = 1;
        int[] result = new int[m*n];
        while(index < (m*n)){
            
        result[index] = mat[r][c];
        index++;
        //up
        if(dir == 1){
         
        if(c == n-1){
             dir = -1;
             r++;
            }
        else if(r == 0){
             dir = -1;
             c++;
         } else{
             r--;
             c++;
        }  
        } 
        //down
        else{
            
            if(r == m-1){
                c++;
                dir =1;
            }else if(c == 0){
                dir =1;
                r++;
            }else{
                r++;
                c--;                
            }            
        }
        }            
       return result; 
    }
}
