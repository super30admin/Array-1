/**
 * https://leetcode.com/problems/diagonal-traverse/
 * 
 * time: O(n) need to go over the entire array
 * space: O(1) Put elements in results array
 * 
 * note: For space Auxilary data structures are only considered
 *      i/p & o/p DS should not be considered for space
 * 
 * Order matters in the if else-if block 
 * due to the following corner case:
 * up: first row last column
 * down: fist column last row
 * 
 * Three line explanation of solution in plain english:
 * 0. keep storing the result from the matrix and increment the index
 * 1. Two major cases - can go up/down direction        --1
 * 2. corner cases checks while going out of bounds     --3
 * 3. normal case check while going up/down             --2 do this as second step as it is easy
 * 
 */
class Problem27 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[n * m];
        
        int dir = 1;
        int i = 0;
        int j = 0;
        int index = 0;
        
        while(i!=m && j!=n){
            result[index] = mat[i][j];
            index++;
            
            if(dir == 1){       // up direction 
                if(j==n-1){         // going out at last column
                    dir = -1; i++;
                } else if(i==0){    // going out first row
                    dir = -1; j++;
                } else {            // normal case
                    i--;j++;
                }
                    
            } else if (dir == -1){  // down direction
                if(i==m-1){         // going out last row
                    dir = 1; j++;
                } else if(j==0){    // going out first column
                    dir = 1; i++;
                } else {            // normal case
                    i++; j--;
                }
            }
             
        }
        return result;

    }
}
