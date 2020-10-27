//Time complexity: O(m*n) | m is the number of rows and n is the number of columns
//Space Complexity: O(1) 
//Program ran successfully
//Almost missed the edge case, where the matrix is not a square matrix. Then followed Jaspinder's advice of checking the condition after each increment in the while loop
/*
    Algorithm: 1. Idea is to have four pointers: top, bottom,left and right
               2. Traverse the top (go left to right) increment the top
               3. Traverse the right column (go from top to bottom) decrement right
               4. Traverse the bottom row(go from right to left) decrement bottom
               5. Traverse the left col (bottom to top) increment left
               6. Keep following these steps till left<= right and top<=bottom
*/

class spiralTraverse {
    public List<Integer> spiralOrder(int[][] matrix) {
        //edge case
        if(matrix.length == 0) return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int top = 0;
        int left = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        
        while(left <= right && top <= bottom){
            //top
            for(int i = left; i <= right; i++){
                list.add(matrix[top][i]);
            }
            top++;
            if(left <= right && top <= bottom){
                //right column
                for(int i = top; i <= bottom; i++){
                    list.add(matrix[i][right]);
                }
                right--;    
            }
            if(left <= right && top <= bottom){
                //bottom
                for(int i = right; i >= left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;    
            }
            if(left <= right && top <= bottom){
                //left
                for(int i = bottom; i >= top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
                
            }
            
        }
        return list;
    }
}
