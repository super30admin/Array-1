/*
Time Complexity -  O(m*n) - m is number of rows and n is number of columns
Sapce Complexity - O(1)
*/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> output = new ArrayList<Integer>();
        int top = 0;
        int left = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int right = n-1;
        int bottom = m-1;
        
        while(top<=bottom && left<=right){
            // right traverse
            
            for(int j = left; j<=right;j++){
                output.add(matrix[top][j]);
            }
            top ++;
            
            // bottom traverse
            if(top<=bottom && left<=right){
                for(int j = top; j<=bottom;j++){
                    output.add(matrix[j][right]);
                }
                
            }
            right --;
            
            // left traverse
            if(top<=bottom && left<=right){
                for(int j= right; j>=left;j--){
                    output.add(matrix[bottom][j]);
                }
                
            }
            bottom --;
            
            //top traverse
            if(top<=bottom && left<=right){
                for(int j=bottom;j>=top;j--){
                    output.add(matrix[j][left]);
                }
                
            }
            left ++;
            
        }
          return output;  
        
    }
        
    
}
