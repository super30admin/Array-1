// Time Complexity : o(m*n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes 54
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top =0; int bottom=matrix.length-1;
        int left=0;int right=matrix[0].length-1;
        
        List<Integer> output = new ArrayList<>();
        //we need to stop whne left crosses right and top crosses bottom
        while(left <= right && top <= bottom){
            //printing top gng from l to r and increment top
            for(int j=left;j<=right;j++){
                output.add(matrix[top][j]);
            }
            top++;
            
            //no nned to check for any change in base cond as only top is changed and it is checked in for loop
            //printing right from top to bottom and decrement right 
            for(int i=top;i<=bottom;i++){
                output.add(matrix[i][right]);
            }
            right--;
            
            //as we are altering base conditions we may cross i.e., left may cross right and top may cross bottom and we will reach while after all for loops, so check as we are checking right and left in for so only check top and bottom.
            if(top<=bottom){
                //printing bottom from right to left and decrement bottom
                for(int j=right;j>=left;j--){
                    output.add(matrix[bottom][j]);
                }
            }
            bottom--;
            
            //as we are altering base conditions we may cross i.e., left may cross right and top may cross bottom and we will reach while after all for loops, so check as we are checking top and bottom in for so only check left and right.
            if(left<=right){
                //printing left from b to t and increment left
                 for(int i=bottom;i>=top;i--){
                  output.add(matrix[i][left]);
                }
            }
            left++;
        }
        return output;
    }
}