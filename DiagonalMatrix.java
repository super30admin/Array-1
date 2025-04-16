// we can have 2 pointer r=0, c=0
// based on up/down direction we can move r and c
// move down r++ and c--, move up r-- and c++
// we use a hashmap to store the diogonal number

// if we have direction flag
// Time : O(m*n)
// Space : O(1) 

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] result = new int[m*n]; // we have mxn elements
        int r = 0, c = 0;

        boolean dir = true;

        for(int i=0; i<m*n; i++) {
            result[i] = mat[r][c];

            if(dir) { // upward motion
                if(r == 0 && c != n - 1) {
                    c++; dir = false;
                } else if (c == n - 1) {  // last column
                    r++; dir = false;
                }
                else {
                    r--; c++;
                }
            }
            else { // downward motion
                if(c == 0 && r != m - 1) { // we also check whether last row else it go outofbound
                    r++; dir = true; // 
                } else if(r == m - 1) { // last row
                    c++; dir = true;
                } else { 
                    r++; c--;
                }
            }
        }
        return result;
    }
}