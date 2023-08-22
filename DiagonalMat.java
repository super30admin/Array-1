// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// I am using a single array with the size of m*n and keeping track of the direction
// with a dir variable to discern whether the pattern is upward or downward.
// I keep track of row and column position with i and j respectively, and 
// depending on the position we will either increase i or j's position then change
// the direction. At the beginning of the while loop, we will add the value at
// i and j in the matrix.
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length; // rows
        int n = mat[0].length; //columns
        int[] answer = new int[m*n];
        int i = 0, j = 0;
        int idx = 0;
        int dir = 1;
        while(idx < answer.length){
            answer[idx] = mat[i][j];
            idx++;
            if(dir == 1){
                if(j == n-1){
                    i++;
                    dir = -1;
                }else if(i == 0){
                    j++;
                    dir = -1;
                }else{
                    i--;
                    j++;
                }
            }
            else if(dir == -1){
                if(i == m-1){
                    j++;
                    dir = 1;
                }else if(j == 0){
                    i++;
                    dir = 1;
                }else{
                    i++;
                    j--;
                }
            }
        }
        return answer;
    }
}