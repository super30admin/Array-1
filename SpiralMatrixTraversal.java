//TC: O(m*n)
//SC: O(1)

class Solution {

    //Hey, so for the spiral matrix we reduce the top when first row is travelled;
    //reduce the column, right when top to bottom is travelled;
    //reduce the bottom when right to left is travelled;
    //reduce the left when bottom to top is travelled;
    
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        
        int top=0, bottom=m-1;
        int left=0, right=n-1;
        
        while(top<=bottom && left<=right){
            for(int j=left;j<=right;j++){
                result.add(matrix[top][j]);
            }
            top++;
            
            // if(left<=right){ //not needed as only top is changing befor e this and other condition is being checked from the while condition already;
                for(int i=top;i<=bottom;i++){
                    result.add(matrix[i][right]);
                }
                right--;
            // }
            
            if(top<=bottom){
                for(int k=right;k>=left;k--){
                    result.add(matrix[bottom][k]);
                }
                bottom--;
            }
            
            if(left<=right){        
                for(int l=bottom;l>=top;l--){
                    result.add(matrix[l][left]);
                }
                left++;
            }
            
        }
        return result;
    }
}
