/**** Method 1 ****/
//Time Complexity: O(n)
//Space Complexity: O(n)

//Successfully submitted in LeetCode

// Start with i= 0, j=0 and when reach any of the wall i.e last index of col or row, we change the direction.

import java.util.ArrayList;
import java.util.List;

public class ARR1_54_Spiral_Matrix {

  public List<Integer> spiralOrder(int[][] arr) {
    int minr = 0;
    int minc = 0;
    int maxr = arr.length - 1;
    int maxc = arr[0].length - 1;

    List<Integer> ans = new ArrayList<>();

    while (minr <= maxr && minc <= maxc) {
      //top wall
      for (int j = minc; j <= maxc; j++) {
        ans.add(arr[minr][j]);
      }
      minr++;

      //right wall
      for (int i = minr; i <= maxr; i++) {
        ans.add(arr[i][maxc]);
      }
      maxc--;

      //bottom wall
      if (minr <= maxr) {
        for (int j = maxc; j >= minc; j--) {
          ans.add(arr[maxr][j]);
        }
        maxr--;
      }

      //left wall
      if (minc <= maxc) {
        for (int i = maxr; i >= minr; i--) {
          ans.add(arr[i][minc]);
        }
        minc++;
      }
    }
    return ans;
  }
}
