/* 54. Spiral Matrix
Time Complexity: O(m*n)
Space Complexity: O(m*n)
Keep four pointers, top, left, bottom and right => top and bottom point to start and end of the rows, left and right for columns
You can do this using recursion also. A while loop can be replaced by recursion
*/


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
            return new ArrayList<>();

        int m = matrix.length;
        int n= matrix[0].length;

        List<Integer> result = new ArrayList<>();

        int top = 0, bottom = m-1, left = 0, right = n-1;

        while(left <= right && top <= bottom){
            //Top Row
            for(int i=left; i<=right; i++)
                result.add(matrix[top][i]);
            top++;

            //Right Column
            for(int i=top; i<=bottom; i++)
                result.add(matrix[i][right]);
            right--;

            //Since we have done top++ before, its save to check here again
            //Bottom row
            if(top<=bottom){
                for(int i=right; i>=left; i--)
                    result.add(matrix[bottom][i]);
            }
            bottom--;

            //Left Column
            if(left<=right){
                for(int i=bottom; i>=top; i--)
                    result.add(matrix[i][left]);
            }
            left++;
        }
        return result;
    }
}


/* 54. Spiral Matrix
Time Complexity: O(m*n)
Space Complexity: O(m*n)
Keep four pointers, top, left, bottom and right => top and bottom point to start and end of the rows, left and right for columns
*/


class Solution {
    List<Integer> result = new ArrayList<>();

    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
            return new ArrayList<>();

        helper(matrix, 0, matrix[0].length-1, 0, matrix.length-1);

        return result;
    }

    public void helper(int[][] matrix, int left, int right, int top, int bottom){
        if(left > right || top > bottom)
            return;

        //Top Row
        for(int i=left; i<=right; i++)
            result.add(matrix[top][i]);
        top++;

        //Right Column
        for(int i=top; i<=bottom; i++)
            result.add(matrix[i][right]);
        right--;

        //Since we have done top++ before, its save to check here again
        //Bottom row
        if(top<=bottom){
            for(int i=right; i>=left; i--)
                result.add(matrix[bottom][i]);
        }
        bottom--;

        //Left Column
        if(left<=right){
            for(int i=bottom; i>=top; i--)
                result.add(matrix[i][left]);
        }
        left++;
        helper(matrix, left, right, top, bottom);
    }
}
