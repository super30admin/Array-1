// Time complexity 0(m*n)
// space complexity 0(1)
// Code successfully executed in leetcode
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
       
        if(matrix == null || matrix.length == 0) return new int []{};
        int m = matrix.length;
        int n = matrix[0].length;
        int result[] = new int [m*n];
        
        int i=0;
        int r=0;
        int c=0;
        int dir =1;
        
        while(i < m*n){
            result[i] = matrix[r][c];
            if(dir == 1){
                if(c == n-1){
                    r++;
                    dir = -1;
                }else if (r==0){
                    c++;
                    dir = -1;
                    
                }else {
                    r--;
                    c++;   
                }
            } else {
                if(r == m-1){
                    c++;
                    dir = 1;
                }else if (c==0){
                    r++;
                    dir = 1;
                    
                }else {
                    r++;
                    c--;   
                }
                
            }
            i++;
        }
        return result;
         
    }
}