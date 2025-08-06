//Approach-whenever we are traversing a matrix we have to observe the change in the direction. here since the change in the direction is in spiral i.e.  four different directions each time we have to check for all the four boundaries.  we are doing that by having four pointers, two pointers pointing to the boundaries of the rows and two pointers pointing the boundaries of the columns. by doing this we are ensuring that we do not read a element twice by updating the pointers accordingly And also keeping the pointers in bound. 
// time complexity is O(m x n) since we are tranversing the entire matrix
//space complexity is O(1) since no additional space is being used and only space is for the variable which would be in constant space.
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        List<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {
            //tranversing L -> R on top row
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            //tranversing T -> B on right column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            //tranversing R -> L on bottom row
            if (top <= bottom) {//checking is the condition still holds true since we updated the pointers inside
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //tranversing B -> T on left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}

