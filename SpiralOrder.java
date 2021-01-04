// Time Complexity : The time complexity is O(M*N) where M is the number of rows and N is the number of columns
// Space Complexity : The space complexity is O(1) since we are not using any extra space.
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Maintain 4 indices, start and end indices of row and start and end indices of column. We have 4 directions to traverse.
// Left-right, top-bottom, right-left and bottom to top. While traversing from left to right, keep r1 constant and increment column from
// c1 to c2. While traversing from top to bottom, keep c2 constant and increment row from r1 to r2. While traversing from right
// to left, keep r2 constant and decrement column from c2-1 to c1-1. While traversing from bottom to top, keep c1 constant and decrement
// row from r2 to r1-1

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> output = new LinkedList<>();

        if(matrix.length == 0 || matrix[0].length == 0){
            return output;
        }

        int M = matrix.length;
        int N = matrix[0].length;

        int r1 = 0;
        int r2 = M-1;
        int c1 = 0;
        int c2 = N-1;

        while(r1 <= r2 && c1 <= c2){

            // traversing from left to right, keeping r1 constant and incrementing column from c1 to c2
            for(int i=c1;i<=c2;i++){
                output.add(matrix[r1][i]);
            }

            // traversing from top to bottom, keeping c2 constant and incrementing row from r1 to r2
            for(int i=r1+1;i<=r2;i++){
                output.add(matrix[i][c2]);
            }

            if(r1 < r2 && c1 < c2){

                // traversing from right to left, keeping r2 constant and decrementing column from c2-1 to c1-1
                for(int i=c2-1;i>c1;i--){
                    output.add(matrix[r2][i]);
                }

                // traversing from bottom to top, keep c1 constant and decrementing row from r2 to r1-1
                for(int i=r2;i>r1;i--){
                    output.add(matrix[i][c1]);
                }
            }

            r1++;
            r2--;
            c1++;
            c2--;

        }

        return output;

    }
}