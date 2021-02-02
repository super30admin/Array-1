// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : have 2 conditions for going in upwards direction or downwards. Increment i and j pointers accordingly. handle edge cases when i anj are at the boundaries of the matrix

class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix.length == 0) {
            return new int[]{};
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] result = new int[rows*cols];

        int i=0;
        int j=0;
        boolean upDirection = true;
        int index = 0;

        while(i < rows && j < cols) {

            result[index] = matrix[i][j];
            index++;

            if(upDirection) {

                if(j==(cols-1)) {
                    upDirection = false;
                    i++;
                } else if(i == 0) {
                    upDirection = false;
                    j++;
                } else {
                    i--;
                    j++;
                }

            } else {
                if(i==(rows - 1)) {
                    upDirection = true;
                    j++;

                } else if(j==0) {
                    upDirection = true;
                    i++;

                } else {
                    i++;
                    j--;
                }
            }

        }

        return result;
        
    }
}