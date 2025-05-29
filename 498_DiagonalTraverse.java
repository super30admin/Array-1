// Traverse the matrix diagonally using a direction vector (up-right and down-left). 
//   After each move, if the position goes out of bounds, correct the indices and reverse direction
//   This allows visiting every element in the diagonal zigzag order.

// Time Complexity: O(m * n) — each of the m × n elements is visited exactly once.
// Space Complexity: O(1) extra space — excluding the output array.

class Solution {

    public int[] findDiagonalOrder(int[][] mat) {
        boolean direction = true;
        int i=0, j=0;
        int m = mat.length;
        int n = mat[0].length;
        int []res = new int[n*m];
        for(int k=0;k<n*m;++k){
            res[k] = mat[i][j];
            // going top direction
            if(direction){
                if(j == n-1){
                    i++;
                    direction = false;
                }
                else if(i == 0){
                    j++;
                    direction = false;
                }
                else{
                    i--;j++;
                }
            }else {
                if(i == m-1){
                    j++;
                    direction = true;
                }
                else if(j == 0){
                    i++;
                    direction = true;
                }
                else{
                    i++;j--;
                }
            }


        }
        return res;
    }
}
