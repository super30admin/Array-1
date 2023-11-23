import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

  public List<Integer> spiralOrder(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;

    List<Integer> arr = new ArrayList<>();

    int l = 0;
    int r = n - 1;

    int t = 0;
    int b = m - 1;

    while (r >= l && b >= t) {

      for (int i = l; i <= r; i++) {
        arr.add(matrix[t][i]);
      }
      t++;

      if (r >= l && b >= t) {

        for (int i = t; i <= b; i++) {
          arr.add(matrix[i][r]);
        }
        r--;
      }

      if (r >= l && b >= t) {

        for (int i = r; i >= l; i--) {
          arr.add(matrix[b][i]);
        }
        b--;
      }

      if (r >= l && b >= t) {

        for (int i = b; i >= t; i--) {
          arr.add(matrix[i][l]);
        }
        l++;
      }

    }

    return arr;

  }


}
