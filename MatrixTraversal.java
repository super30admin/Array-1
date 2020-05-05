// Time Complexity : O(m*n), where m is the number of rows and n is the number of columns of input array
// Space Complexity : O(m*n), where m is the number of rows and n is the number of columns of input array
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>();
        if(matrix.length==0)
            return res;
        
        int row_min=0, row_max = matrix.length-1, col_min=0, col_max=matrix[0].length-1,loop=0;
        
        while(row_min<=row_max && col_min<=col_max){
            for(int i=col_min;i<=col_max;i++)
                res.add(matrix[row_min][i]);
        
            row_min++;
            for(int i=row_min;i<=row_max;i++)
                res.add(matrix[i][col_max]);
        
            col_max--;
            if(row_min<=row_max){
            for(int i=col_max;i>=col_min;i--)
                res.add(matrix[row_max][i]);
                
            }
            row_max--;

            if(col_min<=col_max){
            for(int i=row_max;i>=row_min;i--)
                res.add(matrix[i][col_min]);
                
            }
            col_min++;
            
        }
        
        return res;
    }
}