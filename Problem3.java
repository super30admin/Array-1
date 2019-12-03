//Time Complexity O(n*m) 
//Space Complexity O(1) 
This Solution worked on LeetCode
Explanation - In spiral traversal it is rotating clockwise, so for matrix spiral traversal , It includes top row, right column, bottom row then left column.and we change the top,bottom, right and left values as we traverse the matrix. 
left and top is initialized to 0, bottom is initialized to number of rows-1, right is initialized to number of columns-1

Solution:
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    //Edge Case
        if(matrix==null || matrix.length==0 || matrix[0].length==0)
            return new ArrayList<>(0);
          //Logic
        List<Integer> out = new ArrayList<Integer>();
        int m = matrix.length;
        int n = matrix[0].length;
        int j=0;
        int left=0,top=0,right=n-1,bottom =m-1; 
        while(left<=right && top<=bottom){
            //top row
            for(int i=left;i<=right;i++){
                out.add(matrix[top][i]);  
            }  
            top++;      //Increment the top after the top row
            //right column
            for(int i=top;i<=bottom;i++){
                out.add(matrix[i][right]);  
            }
            right--;          //Decrement the right after the right column
            //bottom row
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    out.add(matrix[bottom][i]);  
                }
            }
            bottom--;           //Decrement the bottom after the bottom row
            //left column
            if(left <=right){
                for(int i=bottom;i>=top;i--){
                    out.add(matrix[i][left]);
                }
            }
            left++;             /Increment the left after the left column
        }
        return out;
    }
}
