import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class SprialMatrix {
  public static List<Integer> spiralOrder(int[][] matrix) {
    if (matrix == null || matrix.length == 0)
      return null;
    int m = matrix.length, n = matrix[0].length;
    int top = 0, bottom = m - 1, left = 0, right = n - 1;
    List<Integer> out = new ArrayList<>();
    while (top <= bottom && left <= right) {
      for (int i = left; i <= right; i++)
        out.add(matrix[top][i]);
      top++;
      if (top <= bottom && left <= right) {
        for (int i = top; i <= bottom; i++)
          out.add(matrix[i][right]);
      }
      right--;
      if (top <= bottom && left <= right) {
        for (int i = right; i >= left; i--)
          out.add(matrix[bottom][i]);
      }
      bottom--;
      if (top <= bottom && left <= right) {
        for (int i = bottom; i >= top; i--) {
          out.add(matrix[i][left]);
        }
      }
      left++;
    }
    return out;
  }

  public static void main(String[] args) {
    int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    List<Integer> result = spiralOrder(mat);
    Object[] res2Array = result.toArray();
    System.out.println("Spiral Order: " + Arrays.toString(res2Array));
  }
}
