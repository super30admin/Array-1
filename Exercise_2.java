// Time complexity = O(N*M)
//Space complexity = O(1)


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        if(mat == null || mat.length == 0) return new int[0];

        int N = mat.length;
        int M = mat[0].length;

        int resultArray [] = new int[N*M];
        int r = 0;

        //Indices that will help to progress the matrix

        int row = 0, column = 0;


        //Direction to keep track of

        int direction = 1;


        while(row < N && column < M) {

            // add the current element to the result matrix

            resultArray[r++] = mat[row][column];


            // move the current diagonal depending upon the current direction

            int newRow = row + (direction == 1 ? -1 : 1);
            int newColumn = column + (direction == 1 ? 1 : -1);

            if(newRow < 0 || newRow == N || newColumn < 0 || newColumn == M) {

                // move upwards
                if(direction == 1) {

                    row = row + (column == M-1 ? 1 : 0);
                    column = column + (column < M-1 ? 1 : 0);


                }  else {

                    column  = column + (row == N-1 ? 1 : 0);
                    row = row + (row < N-1 ? 1 : 0);

                }

                //change the direction

                direction = 1 - direction;


            }

            else {

                row = newRow;
                column = newColumn;

            }

        }


        return resultArray;


    }

}
