// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES

// in this problem we're going over the four different direction using for loop, and reducing the box size each time for that specific row or column.

class SprialMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int top=0, bottom=m-1, left=0, right=n-1;
        List<Integer> result = new ArrayList<>();

        while(top<=bottom && left<=right){

            for(int i = left; i<=right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;

            // we also need to make sure that condition od the while loop stays true on all the given point in the loop. though we need to check it again as we change the value of the side wall.
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    result.add(matrix[bottom][i]);
                }
            }
            bottom--;

            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    result.add(matrix[i][left]);
                }
            }
            left++;

        }
        return result;
    }
}