// Time Complexity :O(m*n) m and n is size of matrix
// Space Complexity :O(d) where d is max diagonal size
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// traverse through diagonals traversing up, while traversing add the side elements to Stack
// once traversal is complete for one diagonal, pop the stack and add to result set
// increment x and y based on conditions mentioned from line 30 to 40 in code

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int row = 0, col = 0, counter = 0;
        int[] res = new int[mat.length * mat[0].length];
        Stack<Integer> s = new Stack<>();

        while(true) {
            int i = row, j=col;
            res[counter++] = mat[i][j];
            addNeighbours(mat, i,j,s, false);
            addNeighbours(mat, i, j, s, true);
            for(int x=i-1, y=j+1; x>=0 && y<mat[0].length; x--,y++) {
                res[counter++] = mat[x][y];
                addNeighbours(mat, x, y, s, true);
            }
            while(!s.isEmpty()) {
                res[counter++] = s.pop();
            }
            if(row < mat.length-2) {
                row = row+2;
                col= 0;
            } else if (row == mat.length-2) {
                row = mat.length-1;
                col = 1;
            } else {
                row = mat.length-1;
                col= col + 2;
            }
            if (col > mat[0].length-1) break;
        }
        return res;

    }

    private void addNeighbours(int[][]mat, int i, int j, Stack<Integer> s, boolean isSide) {
        if (isSide) {
            if (j+1 < mat[0].length) {
                s.push(mat[i][j+1]);
            }
        } else {
            if(i+1 < mat.length) {
                s.push(mat[i+1][j]);
            }
        }
    }
}
