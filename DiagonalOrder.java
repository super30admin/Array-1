class DiagonalOrder {
  public int[] findDiagonalOrder(int[][] mat) {

    boolean direction = true;
    int m = mat.length;
    int n = mat[0].length;
    int[] answer = new int[m * n];

    int col = 0;
    int row = 0;

    for (int i = 0; i < (m * n); i++) {
      answer[i] = mat[row][col];

      if (direction) {
        if (row == 0 && col != n - 1) {


          col++;
          direction = false;

        } else if (col == n - 1) {

          row++;
          direction = false;
        } else {

          row--;
          col++;
        }


      } else {
        if (col == 0 && row != m - 1) {

          row++;
          direction = true;

        } else if (row == m - 1) {

          col++;
          direction = true;

        } else {
          row++;
          col--;
        }

      }

    }

    return answer;
  }

}

