class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;              // number of rows
        int n = mat[0].length;           // number of columns
        
        boolean dir = true;              // direction flag: true = up-right, false = down-left
        
        int r = 0, c = 0;               // starting position (top-left corner)
        int[] res = new int[m * n];     // result array to store traversal
        
        for (int i = 0; i < m * n; i++) {
            res[i] = mat[r][c];         // add current element
            
            if (dir) {                  // moving up-right ↗
                
                if (c == n - 1) {       // hit right boundary
                    r++;                // move down
                    dir = false;        // change direction
                } 
                else if (r == 0) {      // hit top boundary
                    c++;                // move right
                    dir = false;        // change direction
                } 
                else {
                    r--;                // move up
                    c++;                // move right
                }
                
            } else {                    // moving down-left ↙
                
                if (r == m - 1) {       // hit bottom boundary
                    c++;                // move right
                    dir = true;         // change direction
                } 
                else if (c == 0) {      // hit left boundary
                    r++;                // move down
                    dir = true;         // change direction
                } 
                else {
                    r++;                // move down
                    c--;                // move left
                }
            }
        }
        
        return res;                     // return final diagonal traversal
    }
}

/*
==================== QUICK SUMMARY ====================

Goal:
Traverse matrix diagonally in zig-zag order.

Core Idea:
- Use a direction flag:
    true  → move up-right (↗)
    false → move down-left (↙)

Movement Rules:
1. While moving UP (↗):
   - If at right boundary → go DOWN, change direction
   - If at top boundary   → go RIGHT, change direction
   - Else → go (r--, c++)

2. While moving DOWN (↙):
   - If at bottom boundary → go RIGHT, change direction
   - If at left boundary   → go DOWN, change direction
   - Else → go (r++, c--)

Key Insight:
- Direction only changes when we hit a boundary.
- Otherwise, keep moving diagonally.

Time Complexity: O(m * n)
Space Complexity: O(1) (excluding output array)

======================================================
*/