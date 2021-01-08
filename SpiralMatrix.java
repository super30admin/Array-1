
class SpiralMatrix {
    List<Integer> result; 
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0){
            return new ArrayList<>();
        }
        
         result = new ArrayList<>();
        int m  = matrix.length;
        int n = matrix[0].length;
        
        
       // keep 4 directions top, bottom, left, right and squeeze in after every iteretion
        
        int top =0;
        int bottom = m-1;
        int left =0;
        int right = n-1;
        
//         while(top <= bottom && left <= right){
            
//             //top row
//             if(top <= bottom){
//                 //print top row, that is move from i=left to right 
//                 for(int i = left; i<= right;i++){
//                     result.add(matrix[top][i]);
//                 }
//                 top++;
                
//             }
            
//             //right column
//             if(left <= right){
//                 //print right column, start from top to bottom 
//                 for(int i = top; i <= bottom;i++){
//                     result.add(matrix[i][right]);
//                 }                                
//                 right--;
//             }
            
//             //bottom row
//             if(top <= bottom){
//                 for(int i = right; i>= left;i--){
//                     result.add(matrix[bottom][i]);
//                 }
//                 bottom--;
//             }
//             if(left<= right){
//                 for(int i = bottom; i >= top; i--){
//                     result.add(matrix[i][left]);
//                 }
//                 left++;
//             }
//         }
        
        //return result;
        
        
        i = left;S 
        helper(matrix,top,bottom,i,right,result);
        
        return result;
    }
    
    private void helper(int[][] matrix,int top,int bottom,int left,int right){
        
        if(!(top <= bottom) || !(left <= right)){
            return;
        }
        
        //go top row
        result.add(matrix[top][left]);
        helper(matrix,top,bottom, left+1,right);
        
        //go right column
        
        //go to bottom column
        
        
    }
}