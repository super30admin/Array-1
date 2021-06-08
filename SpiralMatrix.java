//TC: O(M*N)
//SC: O(1) since we are using some constant variables for storing indices

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
    
        // 0 = left to right
        // 1 = top to bottom
        // 2 = right to left
        // 3 = bottom to top
        int dir = 0;
    
        while(top <= bottom && left <= right) {
            if(dir == 0) {
                //row is fixed = top, column changes from left to right
                for(int col = left; col <= right; col++) {
                    list.add(matrix[top][col]);
                }
                dir = 1; //change direction to top to bottom
                top += 1; // top wall completed
                
            } else if(dir == 1) {
                //col is fixed = right, row changes from top to bottom
                for(int row = top; row <= bottom; row++) {
                    list.add(matrix[row][right]);
                }
                dir = 2; // change direction to right to left
                right -= 1; //right wall completed
                
            } else if(dir == 2) {
                //row is fixed = bottom, col changes from right to left
                for(int col = right; col >= left; col--) {
                    list.add(matrix[bottom][col]);
                }
                dir = 3; // change the direction to bottom to top
                bottom -= 1; // bottom wall completed
                
            } else if(dir == 3) {
                //col is fixed = left, row changes from bottom to top
                for(int row = bottom; row >= top; row--) {
                    list.add(matrix[row][left]);
                }
                dir = 0; // change direction from left to right
                left += 1; // left wall completed
                
            }
        }
        
        return list;
    }
}