// Time Complexity :O(MN), where M are rows and N are Columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes

//The Idea here is to find the pattern and Whenever we encounter the edge case we change the direction and either increment or decrement the operator
// Dir 1 represents upward and -1 represent Downwards 

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
            return new int[0];
        int m = matrix.length, n = matrix[0].length;
        int[] result = new int[m * n];
        int i=0, j=0, index=0, dir=1;
        //till the length of the array
        while(index < m * n){
            result[index]=matrix[i][j];
            //Upwards
            if(dir == 1){
                if(j == n-1){
                    dir = -1;
                    i++;
                }
                else if(i == 0){
                    dir = -1;
                    j++;
                }
                else{
                    i--;
                    j++;
                }
            }
            //Downwards
            else{
                if(i == m-1){
                    dir = 1;
                    j++;
                }
                else if(j == 0){
                    dir = 1;
                    i++;
                }
                else{
                    i++;
                    j--;
                }
            }
            index++;
        }
        return result;
    }
}