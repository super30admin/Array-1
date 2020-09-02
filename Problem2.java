// Time Complexity : O(m*n) - m : length of column , n: length of row
// Space Complexity : O(1) - Used one array to return which is not considered
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/*
 * Given a matrix of M x N elements (M rows, N columns), return all elements of
 * the matrix in diagonal order as shown in the below image.
 * 
 * Example:
 * 
 * Input:
 * 
 * [
 * 
 * [ 1, 2, 3 ],
 * 
 * [ 4, 5, 6 ],
 * 
 * [ 7, 8, 9 ]
 * 
 * ]
 * 
 * Output: [1,2,4,7,5,3,6,8,9]
 */


class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length ==0 || matrix[0].length == 0){
            return new int[] {};
        }
        
        int m = matrix.length; int n = matrix[0].length;
        
        int[] result = new int[matrix.length * matrix[0].length];
        
        int i =0;
        int j =0;
        int index = 0;
        
        int dir = 1;
        while(index < m*n){
            result[index] = matrix[i][j];
            index++;
            
            if(dir == 1){
                if(j == n -1){
                    dir = -1;
                    i+=1;
                }else if(i == 0){
                    dir = -1;
                    j+=1;
                }else{
                   i = i-1;
                   j = j+1;
                }
            }else{
                 if(i == m -1){
                    dir = 1;
                    j+=1;
                }else if(j == 0){
                    dir = 1;
                    i+=1;
                }else{
                   i = i+1;
                   j = j-1;
                }
            }
        }
        
        return result;
    }
}