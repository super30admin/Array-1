// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// 1. create a seperate array of length (n) where each element of this array will hold the product of numbers on the left of the cur number in nus[]
// 2. once the left array is filed, do the same for the elements to the right of the current number in the nums[] (doing it without creating seperate array)
// 3. Each element of the ans[] is filled with the product of numbers to the left and right of the current element
// Your code here along with comments explaining your approach
// problem-1
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] ans= new int[nums.length];
        int len= nums.length;
        
        //this is how it would look like when index on the right is missing
        ans[0]=1;
        for (int i=1; i < len; i++) {
            ans[i]= nums[i-1]* ans[i-1];
        }
        
        int temp=1;
        for ( int i=len-1; i>=0; i--) {
            ans[i]=temp*ans[i];
            temp*=nums[i];
        }
        
        return ans;
        
    }
}

// problem -3 

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> nums = new ArrayList<>();
       if(matrix.length ==0 || matrix == null){
            return nums;
        }
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;
        
        while(startRow <= endRow && startCol <= endCol){
            
            // traverse right until endCol, increment row
            for(int i= startCol; i<= endCol; i++){
                nums.add(matrix[startRow][i]);
            }
            startRow++;
            
            // traverse down until endRow, decrement endCol
            for( int i= startRow; i<=endRow; i++){
                nums.add(matrix[i][endCol]);
            }
            endCol--;
            
            // traverse left until startRow, decrement endRow
            if(endRow >= startRow){
                for(int i= endCol; i>=startCol; i--){
                    nums.add(matrix[endRow][i]);
                }
            }
            endRow--;
            
            // traverse up until= srow
            if(endCol >= startCol){
                for( int i=endRow; i>=startRow; i--){
                    nums.add(matrix[i][startCol]);
                }
            }
            startCol++;
        }
        
        return nums;
    }
}
