// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int [] result = new int[m*n];
        int i = 0;
        int j = 0;
        int k = 0;
        int dir = 1;
        
        while(k< m*n)
        {
            result[k] = mat[i][j];
            k++;
            if(dir == 1)
            {
                if (j == n - 1)
                {
                    i++;
                    dir = -1;
                }
                else if(i == 0)
                {
                    j++;
         
                    dir = -1;
                }
                else
                {
                    i--;
                    j++;
                }
               
            }
            else {
                if(i == m - 1){
                    j++; dir = 1;
                }else if(j == 0){
                    i++; dir = 1;
                    
                }else{
                    j--;
                    i++;
    
                }
              
            } 
           
        }
        return result;  
    }
}
