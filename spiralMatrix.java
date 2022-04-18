//Time Complexity : O(nm)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        //base case
        if(matrix==null||matrix.length==0)
            return new ArrayList<>();
        //dimensions of the matrix
        int m=matrix.length;
        int n=matrix[0].length;
        //declaring the 4sides of the matrix as left, right, top, bottom
        int top=0, bottom=m-1,left=0, right=n-1;
        //to store the output
        List<Integer> output=new ArrayList<>();
        while(top<=bottom && left<=right){
            //1st operation iterating left->right, and adding them to the flatten output matrix
            for(int i=left;i<=right;i++){
                output.add(matrix[top][i]);
            }
            //increment the top
            top++;
            //2nd operation iterating from top to bottom
            for(int j=top;j<=bottom;j++){
                output.add(matrix[j][right]);
            }
            right--;
            //3rd operation iterating from right to left
            for(int i=right;i>=left;i--){
                output.add(matrix[bottom][i]);
            }
            bottom--;
            //4th operation bottom to top
            for(int j=bottom;j>=top;j--){
                output.add(matrix[j][left]);
            }
            left++;
        }
        return output;
    }
}