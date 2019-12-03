//Time Complexity: O(mn)
//Space Complexity: O(1)
// Description of approach: we take 4 pointer which represent the boundaries of the input array and traverse the array in the spiral manner while adjusting the pointers along the way
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0)
            return result;
        int m = matrix.length, n = matrix[0].length;
        int left = 0, top = 0, bottom = m-1, right = n-1;
        
        while(left <= right && top<=bottom){
            //top row
            for(int i=left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;//increment pointer value sothat this row would not be processed again
            
            //right column
             for(int i=top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            
            if(top <= bottom){//check again because we manipulated pointer value above
                for(int i=right; i>=left; i--){
                    result.add(matrix[bottom][i]);
                }
            }
            
            bottom--; 
            
            if(left <= right){//check again because we manipulated pointer value above
                for(int i=bottom; i>=top; i--){
                    result.add(matrix[i][left]);
                }
            }
            
            left++;
            
        }
        return result;
    }
}