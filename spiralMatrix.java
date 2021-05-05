// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class spiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result= new ArrayList<>();
        if(matrix==null || matrix.length==0 || matrix[0].length==0)
            return result;
        
        int row=matrix.length;
        int column= matrix[0].length;
        int top=0;
        int left=0;
        int bottom=row-1;
        int right=column-1;
        
        while(left<=right && top<=bottom){
            
             if(left<=right && top<=bottom){
                 
            for(int i=left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;
             }
            
             if(left<=right && top<=bottom){
                 
             for(int i=top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
             }
            
            if(left<=right && top<=bottom){
                
                for(int i=right; i>=left; i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
            }
            
             if(left<=right && top<=bottom){
             for(int i=bottom; i>=top; i--){
                result.add(matrix[i][left]);
            }
            left++;   
             }
        }
        
        return result;
        
        
    }
    
}
