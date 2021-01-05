// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : no

// Your code here along with comments explaining your approach
// Traverse diagonally till boundary then switch back the direction with next element.

public int[] findDiagonalOrder(int[][] matrix) {
    int n = matrix.length;
    int m = 0;
    if(n>0) m = matrix[0].length;
    int[] output = new int[m*n];
    int count = 0;
    int i = 0;
    int j = 0;
    int sum = i+j;
    while(count < m*n){
    
        while(i>=0 && j>=0 && i<n && j<m){output[count++] = matrix[i--][j++];}
        i++;
        if(j==m){
            i++;
            j--;
        }
        
        while(i>=0 && j>=0 && i<n && j<m){output[count++] = matrix[i++][j--];}
        j++;
        if(i==n){
            j++;
            i--;
        }  
    }
    return output;
}