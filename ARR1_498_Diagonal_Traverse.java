/**** Method 1 ****/
//Time Complexity: O(n^2)
//Space Complexity: O(n)

//Successfully submitted in LeetCode

// Brute Force: Start a loop and maintain a direction to find which way we can traverse, dir = 1, when we dir = 1, we do i-- and j++ until it reaches a wall(index out of bound) then change the dir = -1 and traverse i++ and j--, and add each of those value to array and return it.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ARR1_498_Diagonal_Traverse {

  public int[] findDiagonalOrder(int[][] mat) {
    int m = mat.length;
    int n = mat[0].length;

    int[] result = new int[m * n];
    int r = 0, c = 0;

    int dir = 1;

    for (int i = 0; i < m * n; i++) {
      result[i] = mat[r][c];

      if (dir == 1) {
        if (c == n - 1) {
          r++;
          dir = -1;
        } else if (r == 0) {
          c++;
          dir = -1;
        } else {
          r--;
          c++;
        }
      } else {
        if (r == m - 1) {
          c++;
          dir = 1;
        } else if (c == 0) {
          r++;
          dir = 1;
        } else {
          r++;
          c--;
        }
      }
    }

    return result;
  }

  public int[] findDiagonalOrder1(int[][] mat) {
    int val = mat.length * mat[0].length;

    int[] ans = new int[val];
    int idx = 0;

    List<Integer> list;

    Map<Integer, List<Integer>> map = new HashMap<>();

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        int num = i + j;

        if (map.containsKey(num)) {
          list = map.get(num);
        } else {
          list = new ArrayList<>();
        }

        list.add(mat[i][j]);
        map.put(num, list);
      }
    }

    for (int i = 0; i < map.size(); i++) {
      list = map.get(i);
      if (i % 2 == 0) {
        for (int j = list.size() - 1; j >= 0; j--) {
          ans[idx] = list.get(j);
          idx++;
        }
      } else {
        for (int j = 0; j < list.size(); j++) {
          ans[idx] = list.get(j);
          idx++;
        }
      }
    }

    return ans;
  }
}
