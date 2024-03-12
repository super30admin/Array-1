// Time Complexity : O(n*m) : m - rows, n - columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// dir maintains the direction , either we go up (decrease row and increase col) or go down (increase ro and decrease col)
// change the direction when we hot the boundary

class DiagonalTraversal {
    public int[] findDiagonalOrder(int[][] mat) {
        boolean dir = true;
    
        int m = mat.length;
        int n = mat[0].length;
        int j = 0;
        int i = 0;
        int[] result = new int[m*n];

        for (int id = 0; id<m*n; id++){
            result[id] = mat[i][j];
        if(dir){
            //UP 
            if(j == n - 1){
                i++;
                dir = false;
            }else if(i == 0){
                j++;
                dir = false;
            }else{
                i--; 
                j++;
            }
        }else{

            //DOWN 
            if(i == m - 1){
                j++;
                dir = true;
            }else if(j == 0){
                i++;
                dir = true;
            }else{
                i++; 
                j--;
            }
        }
    }
    return result;
    }
}