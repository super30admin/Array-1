// Time Complexity : O(n) where n is the number of elements
// Space Complexity :O(n) where n is the number of elements
// Did this code successfully run on Leetcode : Yes, but failed for another test case
// Three line explanation of solution in plain english : 

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0){
            return new int[]{};
        }
        int m = matrix.length;
        int n = matrix[0].length;
        
        int len = m*n;
        
        int[] result = new int[len];
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i<m && j<n){
            int scenario = i+j;
            if(scenario%2 == 0){
                if(i-1<0 && j-1<0){
                result[k] = matrix[i][j];
                k++;
                j++;
            }
            else if(i-1<0 && j+1>n-1){
                result[k] = matrix[i][j];
                k++;
                i++;
            }
            else if(i+1>m-1 && j-1<0){
                result[k] = matrix[i][j];
                k++;
                i--;
                j++;
            }
            else if(i+1>m-1 && j+1>n-1){
                result[k] = matrix[i][j];
                k++;
                i++;
                j++;
            }
                else{
                    result[k] = matrix[i][j];
                    k++;
                i--;
                j++;
                }
            }
            else{
                if(i-1<0){
                result[k] = matrix[i][j];
                k++;
                i++;
                j--;
            }
            else if(j+1>n-1){
                result[k] = matrix[i][j];
                k++;
                i++;
                j--;
            }
            else if(i+1>m-1){
                result[k] = matrix[i][j];
                k++;
                j++;
            }
            else if(j-1<0){
                result[k] = matrix[i][j];
                k++;
                i++;
            }
                else{
                    result[k] = matrix[i][j];
                    k++;
                i++;
                j--;
                }
            }           
            
        }
        
        return result;
    }
}