// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0)
            return result;
        int m = matrix.length,n = matrix[0].length;
        int top = 0, bottom = m-1,left = 0 , right = n-1;
        while(top<=bottom && left <= right){
            for(int j= left; j<=right;j++){
                result.add(matrix[top][j]);}
            top ++;
            for(int i = top; i<=bottom;i++){
                result.add(matrix[i][right]);}
            right--;
            if(top <= bottom){
                for(int j = right;j>=left;j--){
                    result.add(matrix[bottom][j]);}
            }
                bottom --;
                if(left <= right){
                    for(int i = bottom;i>=top;i--){
                        result.add(matrix[i][left]);   }
                    
                }
                left++;
            }
       return result;
        }
        
    }
