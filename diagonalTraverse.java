// Time Complexity : O(m * n)
// Space Complexity : O(1) -> we are not utilizing any additional space - only pointers, we are creating a new answer array so that we can return it.
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english
    //Most trivial thing of this problem is to make sure that if-else logic is written correctly

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        //base case
        if(mat == null || mat.length == 0){
            return new int[] {};
        }

        //rows
        int m = mat.length;
        int n = mat[0].length;

        //answer array
        int[] answer = new int[m * n];

        int index = 0;
        int row = 0;
        int col = 0;
        int dir = 1;

        //dir = 1 -> bottom to top
        //dir = -1 -> top to bottom

        while(index < m * n){
            answer[index] = mat[row][col];
            index++;
            if(dir == 1){
                if(col == n - 1){ //when column reaches the end
                    dir = -1;
                    row++;
                }
                else if(row == 0){ //when top most row is reached
                    dir = -1;
                    col++;
                }
                else{
                    row--;
                    col++;
                }
            }
            else{
                if(row == m - 1){ //when last row is reached
                    dir = 1;
                    col++;
                }
                else if(col == 0){ //when first column is reached
                    dir = 1;
                    row++;
                }
                else{
                    col--;
                    row++;
                }
            }
        }

        return answer;

    }
}