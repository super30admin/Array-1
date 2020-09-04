// Time Complexity :O(n*m) where n is the unmber of rows and m is cols
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

//   1  2  3  4 5
//   6  7  8  9 10 
//  11 12 13 14 15
//  16 17 18 19 20
// 
// 1->2->6->11->7->3->4->8->12->16->17->13->9->5->10->14->18->19->15->20
// first we go in up from 1, then down 2 -> 6 ,then up 11->7->3 and so on
// we check boundary conditions (1)while going up and (2)going down
// (1) first here we check for right most col hit 
// (2)then  we check for upper most row hit
// (3) else move downards
// similarly for downwards

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {

        // TC : O(n*m)
        // SC : O(1)

        if (matrix == null || matrix.length == 0)
            return new int[0];

        int n = matrix.length, m = matrix[0].length;

        int i = 0, j = 0, idx = 0;
        int[] output = new int[n * m];
        boolean dir = true;

        while (idx < n * m) {
            output[idx] = matrix[i][j];
            idx++;

            // Upwards
            // 1->2>3 and not 2->1->3 since 9->5 in the example we will do j++ first and it
            // will go out of bounds
            if (dir) {
                // 1
                if (j == m - 1) {
                    dir = false;
                    i++;
                } else if (i == 0)
                // 2
                {
                    dir = false;
                    j++;
                } else {
                    // 3
                    i--;
                    j++;
                }
            }

            else {
                // downwards
                // here also 1->2->3 is the order and not 2 1 3
                // similarly while going from 16-> 17 it will go out of bounds
                // 1
                if (i == n - 1) {

                    dir = true;
                    j++;

                } else if (j == 0)
                // 2
                {
                    dir = true;
                    i++;
                }
                // 3
                else {
                    i++;
                    j--;
                }
            }
        }

        return output;
    }
}