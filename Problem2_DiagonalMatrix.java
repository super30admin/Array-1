// Time Complexity : O(M * N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english

/*

We will traverse upwards and downwards direction by changing the values of indeces i and j

Add the value of element in result list at index M(i,j), then

When traversing to upwards, CHECK IF we reached at last column or first row, according to that change the values of i and j 

When traversig to downwards, CHECK IF we reached at last row or first column, according to that change the values of i and j


*/

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null){
            return new int[0];
        }
        
        int m = mat.length;
        int n = mat[0].length;
        
        int i = 0, j = 0;
        boolean dir = true; // By Default going in upwards direction
        
        int[] ans = new int[m * n];
        int c = 0;
        
        while(c < ans.length){
            ans[c] = mat[i][j];
            c++;
            
           if(dir){ // Traversing Upwards
                if(j == n - 1){
                   i++;
                   dir = false;
               }
               else if(i == 0){
                   j++;
                   dir = false;
               }
               else{
                   i--; j++;
               }
           }else{ // Traversing Downwards
               if(i == m - 1){
                   j++;
                   dir = true;
               }
               else if(j == 0){
                   i++;
                   dir = true;
               }
               else{
                   i++; j--;
               }
           } 
        }
        
        return ans;
    }
}
