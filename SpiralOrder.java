//Barclays interview question
//Time complexity = O(m*n)
//Space complexity = O(1) -> used an same array list and we returned into same space.
//optimize approach: consider 4 directions if top crosses bottom or left crosses right then stop the loop becoz it goes to outoff bound condition.then top = 0 ,bottom = m-1(row),left(col)=0,right(col)=m-1;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new ArrayList<>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int top =0, bottom = m-1;//row
        int left = 0,right = n-1;//colums
        
        while(top<=bottom && left<=right){
            //top row->left to right
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            //if(left<=right);{
            //right column ->from top to bottom
            for(int i= top;i<=bottom;i++){
                result.add(matrix[i][right]);
            } right--;
            //bottom row-from right to left
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                result.add(matrix[bottom][i]);
            } 
            bottom--;
        }
        //left column->from bottom to top
        if(left<=right){
            for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
            left++;
        }
        }
        return result;
    }
}
