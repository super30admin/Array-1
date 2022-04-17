// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    //TC:  O(n)
    //SC: O(1)
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==0 || nums == null) return new int[]{};
        
        int rProduct = 1;
        int[] myArray = new int[nums.length];
        myArray[0] = 1;
        for(int i =1; i< nums.length; i++){
            rProduct = rProduct*nums[i-1];
            myArray[i] = rProduct;
        }
        rProduct = 1;
        for(int i = nums.length-2; i>=0;i--){
            rProduct = rProduct*nums[i+1];
            myArray[i] = myArray[i]*rProduct;
        }
        return myArray;
    }
}




class Solution {
    //TC O(n*m) SC O(1)
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int dir=1;
        int row=0;
        int col =0;
        int[] result = new int[n*m];
        
        int index =0;
        
        while(index < n*m)
        {
            result[index] = mat[row][col];
           
            index++;
            if(dir ==1)
            {
                if(col == m-1)
                {
                    dir =-1;
                    row++;
                }
                else if(row == 0)
                {
                    dir =-1;
                    col++;
                }
                else{
                    row--;
                    col++;
                }
            }
            
            else if(dir == -1)
            {
                if(row == n-1)
                {
                    dir =1;
                    col++;
                }
                else  if(col==0)
                {
                    dir =1;
                    
                    row++;
                }
                else{
                    row++;
                    col--;
                }
                
            }
        }
      return result;  
    }
}

class Solution {
    
    // TC O(n) SC O(1)
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int left = 0;
        int right = m-1;
        int top = 0;
        int bottom = n-1;
  
        int index = 0;
        List<Integer> result = new ArrayList<>();
        
        
        while(top <= bottom && left <= right){
            for(int j = left; j<= right; j++){
                result.add(matrix[top][j]);
            }
            top++;
            for(int i = top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
        if(top<=bottom){
            for(int j = right; j>=left;j--){
                result.add(matrix[bottom][j]);
            }
            bottom--;
        }
            if(left<=right){
            for(int i = bottom; i>=top; i--){
                result.add(matrix[i][left]);
            }
            left++;
            }
            
        }
    return result;
    }
}
