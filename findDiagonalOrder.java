// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Here we traverse through each of the elements
// We check whether the row is even number or not  as for going diagonally up the row has to be even number
// if the row is not even number then it moves diagonally down

// We keep on storing the elements while moving up and down diagonally






class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
         if (matrix.length == 0) return new int[0];
         int r = 0, c = 0, m = matrix.length, n = matrix[0].length, arr[] = new int[m * n];
         for (int i = 0; i < arr.length; i++) {
             arr[i] = matrix[r][c];
             if ((r + c) % 2 == 0)
             { // moving up
                 if      (c == n - 1)
                 { r++; }
                 else if (r == 0)
                 { c++; }
                 else
                 { r--; c++; }
             } else
             {                // moving down
                 if      (r == m - 1)
                 { c++; }
                 else if (c == 0)
                 { r++; }
                 else

                 { r++; c--; }
             }
         }
         return arr;
     }
 }