// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> n = new ArrayList<>();

    //we maintain 4 pointers as we have to traverse the array in 4 directions
    //left -> right
    //left <- right
    //top -> bottom
    //bottom -> top
    int top = 0;
    int bottom = matrix.length - 1;
    int left = 0;
    int right = matrix[0].length - 1;
    int dir = 0;
    
    while(top<=bottom && left<=right){
        if(dir == 0){  
            //we travel from left to right till the rightmost element and keep adding the elements to the output
            //arraylist
            for(int i = left; i<=right;i++){
                n.add(matrix[top][i]);
            }  
            top++; //move to the next row , rightmost element
        }
        else if(dir == 1){
            //we move from top to bottom in the rightmost column of the matrix
            for(int i = top; i <= bottom;i++){
                n.add(matrix[i][right]);
                //right--;
            } 
            //as we have covered the last element of the rightmost column, we move the right pointer to
            //the left column's last element
            right--;
        }
        else if(dir == 2){
            //we traverse from right to left.
            for(int i = right; i >= left;i--){
                n.add(matrix[bottom][i]);
                //bottom--;
            } 
            bottom--;// the last row is covered. so we decrement the bottom pointer
        }
        else if(dir == 3){
            //we move from bottom to top till the first element of the matrix as we have already visited it
            for(int i = bottom; i >= top;i--){
                n.add(matrix[i][left]);
                //left++;
            } 
            left++;
        }
        dir = (dir + 1) % 4;
    }
    return n;
}