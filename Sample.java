// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

//Product except itself
//Time Complexity ->O(2n)->O(n)
//Space Complexity -> O(1) 
//Only space used was of output
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length]; //Since it is output no auxillary space
        int n = nums.length;
        int rProd = 1;
        result[0] = rProd;
        for(int i=1;i<n;i++){
            rProd = rProd*nums[i-1];
            result[i] = rProd;
            
        }
        rProd = 1;
        for(int i = n-2;i>=0;i--){
            rProd = nums[i+1]*rProd;
            result[i] = result[i]*rProd;
            
        }
        return result;
        
        
    }
}

//Diagonal Traversal
//Time Complexity -> o(m*n)
//Space Complexity-> O(1) 
   class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int nRows = mat.length;
        int nCols = mat[0].length;
        int[] result = new int[nRows*nCols];
        int cRow = 0; int cCol = 0;
        boolean d = true;
        for(int i = 0;i<result.length;i++){
            result[i] = mat[cRow][cCol];
         if(d){ //Going up
                if(cCol == nCols - 1){
                d = false;
                cRow++;
            } 
            else if(cRow == 0){
                d = false;
                cCol++;
            }
            else{
                cRow--;
                cCol++;
            }
            }
            else{ //Going down
                if(cRow == nRows - 1){
                d = true;
                cCol++;
            } 
            else if(cCol == 0){
                d = true;
                cRow++;
            }
            else{
                cRow++;
                cCol--;
            }


            }

            
            
        }
        return result;
        
    }
}

//Spiral Matrix
//Time Complexity-> o(m*n)

//Space Complexity-> O(1) -> no space count for output array
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList();
        int nRows = matrix.length;
        int nCols = matrix[0].length;
        int top= 0; int bottom = nRows -1;  int left = 0; int right = nCols - 1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++ ){
                result.add(matrix[i][right]);
            }
            right --;
            if(top<=bottom && left<=right){
                for(int i= right;i>=left;i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
            }
            
            if(left<=right && left<=right){
                for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
            left++;
            }
            
        }

        return result;
        
    }
}

class Solution {
    //Using RecurSion
    List<Integer> result;
    public List<Integer> spiralOrder(int[][] matrix) {
        result = new ArrayList();
        int nRows = matrix.length;
        int nCols = matrix[0].length;
        int top= 0; int bottom = nRows -1;  int left = 0; int right = nCols - 1;
        dfs(matrix,top,bottom,left,right);
        return result;
    
    }

     private void dfs(int[][] matrix,int top,int bottom,int left,int right){

        if(left>right || top>bottom) return;

            while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++ ){
                result.add(matrix[i][right]);
            }
            right --;
            if(top<=bottom ){ //we are checking it because our bottom is mutated and when we have the base condition values mutated just keep a check,no left and right check because for loop is handling it
                for(int i= right;i>=left;i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
            }
            
            if(left<=right && left<=right){ //we are checking it because our left is mutated and when we have the base condition values mutated just keep a check,no top and bottom check because for loop is handling it
                for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
            left++;
            }
            
        }
        dfs(matrix,top,bottom,left,right);
        
        
    }
   
}