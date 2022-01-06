//m*n = size of the matrix
//Time Complexity: O(m*n) 
//Space Complexity: O(m*n)
//This problem checks our capabilty to handle edge cases. While going up, we need to make sure to check if we are the last 
//column first and then check if we are at the first row to change the direction of iteration. Similarly, while going down, we need to check if are at the last row
//first and then check if we are at the first column. This will make sure that we handle all the edge cases successfully.

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length ==0) return null;
        int m = mat.length; int n = mat[0].length;
        int[] result = new int[m*n];
        int k = 0;
        int dir = 1;
        int i = 0; int j = 0;
        
        while(k < m*n){
            result[k] = mat[i][j];
            k++;
            
            if(dir == 1 ){
                if(j == n-1){
                    i++;
                    dir = -1;
                } else if(i == 0){
                    j++;
                    dir = -1;
                }else{
                    i--;
                    j++;
                }
            }else{
                if(i == m-1){
                    j++;
                    dir = 1;
                } else if(j == 0){
                    i++;
                    dir = 1;
                }else{
                    i++;
                    j--;
                }
            }
        }
        return result;
        
    }
}