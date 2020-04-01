// Time Complexity : O(NxM) N=number of rows. M number of columns. 
// Space Complexity : O(1) return response not additional data structure.  Considering that the result is not taken into consideration for Space complexity
// Did this code successfully run on Leetcode :yes. 

// Any problem you faced while coding this :


// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// Using the pattern of calculation from left to right , top down, left to right then down to top, and repeat. 
// We are using extra space to help us to avoid duplicates and run faster.

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix.
//Memory Usage: 37.7 MB, less than 5.21% of Java online submissions for Spiral Matrix.
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result= new ArrayList();
        if (matrix==null|| matrix.length==0)
            return result;
        boolean[][] visited=new boolean[matrix.length][matrix[0].length];
        int col=0;
        int row=0;
        int totalMoves=matrix.length*matrix[0].length;
        int move=1;
        result.add(matrix[0][0]);
        visited[0][0]=true;

        while (move<totalMoves){
            //right move
            while (canItMove(row,col+1,visited)){
                col++;
                result.add(matrix[row][col]);
                visited[row][col]=true;
                move++;
            }
            while (canItMove(row+1,col,visited)){//down move
                row++;
                result.add(matrix[row][col]);
                visited[row][col]=true;
                move++;
            }
            while (canItMove(row,col-1,visited)){//left
                col--;
                result.add(matrix[row][col]);
                visited[row][col]=true;
                move++;
            }
            while (canItMove(row-1,col,visited)){ //up
                row--;
                result.add(matrix[row][col]);
                visited[row][col]=true;
                move++;
            }
        }
        return result;
    }

    private boolean canItMove(int row, int col, boolean[][] visited) {
        return row>=0 && row<visited.length && col>=0 && col<visited[0].length && !visited[row][col];
    }