// Time Complexity : O(m * n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

public int[] findDiagonalOrder(int[][] mat) {
    if(mat == null || mat.length == 0 || mat[0].length == 0)
        return new int[0];
    
    int n = mat.length;
    int m = mat[0].length;
    
    int idx = 0, i = 0, j = 0, dir = 1; //direction 1 represents going up
    int[] output = new int[m*n];
    
    while(idx < n * m){
        output[idx] = mat[i][j];
        idx++;
        
        if(dir == 1){//upward movement
            //last element to the right - boundary
            if(j == m - 1){
                dir = -1;
                i++;
            }//top row. direction has to be changed after we have travelled the first row.
        else if(i == 0){
            dir = -1;
            j++;
        }
        else{
            i--;
            j++;
            }
        }
        else{
            //boundary condition
            if(i == n - 1){
                dir = 1;
                j++;
            }
            //edge case. Need to change the direction
            else if(j == 0){
                dir = 1;
                i++;
            }
            else{
                i++;
                j--;
            }
        }
    }
    return output;
}