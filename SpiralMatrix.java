// Time Complexity : O(N*M) where n is rows elements and m is column elements
// Space Complexity : O(1) since the fucntion requires a list output 
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: 
// We will use 4 variables to navigate thru the matrix - top starting from 0,left starting from 0,bottom starting from n-1,right starting from m-1
// First we will move from left to right, after reaching at last column, we will do top++ and then move downwards. After reaching at last row, we will do right-- and move left and so on

/// Your code here along with comments explaining your approach
public List<Integer> spiralOrder(int[][] matrix) {
    if(matrix == null || matrix.length == 0) return new ArrayList<>();
    
    int n = matrix.length; //rows
    int m = matrix[0].length; //columns
    
    //result list
    List<Integer> list = new ArrayList<>();
    
    int top=0,bottom=n-1,left=0,right=m-1;
    
    while(top <= bottom && left <= right){ // initiating a while loop
        // for moving left to right
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++; // increment the top once at end
        //for moving top to bottom
        if(left <= right){
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
           right--; // once at bottom, decrement right
        }
        // for moving right to left
        if(top <= bottom){
            for(int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;// once at end, decrement bottom
        }
        //for moving bottom to top
        if(left <= right){
            for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++; // once at end, increment left
        }
    }
    return list;
}