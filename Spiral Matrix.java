
//TC: O(m*n)
//space complexity: o(1)
// Did this code successfully run on Leetcode :yes

// Your code here along with comments explaining your approach


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result =new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        
        
        int firstRow=0,lastRow=m-1;
        int firstCol=0,lastCol=n-1;
        
        
        while(firstRow<=lastRow&&firstCol<=lastCol){
            
            //Right
            
            for(int j=firstCol;j<=lastCol;++j){
                
                result.add(matrix[firstRow][j]);
            }
            ++firstRow;
            
            //Down
              for(int i=firstRow;i<=lastRow;++i){
                
                result.add(matrix[i][lastCol]);
            }
            
           --lastCol;
            //left
            if(firstRow<=lastRow){
                for(int j=lastCol;j>=firstCol;--j){
                
                result.add(matrix[lastRow][j]);
            } 
                --lastRow;
            }
            
            //Up
            if(firstCol<=lastCol){
                
                for(int i=lastRow;i>=firstRow;--i){
                    
                    result.add(matrix[i][firstCol]);
                }
                
                ++firstCol;
            }  
            
        }
            return result;
    }
}