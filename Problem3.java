// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english
// 1. Get a boolean visited matrix, and a global result list to store the traversal order
// 2. The traversal should be in this priority: right, down, left and up. Traversal while visited[i][j] == true and index are in bound.
// 3. Whenever you encounter that the index is out of bound or if the next node is visited than move in other direction.
// Priority of changinf direction while traversing:
// 1. right
// 2. down
// 3. left
// 5. up

// Your code here along with comments explaining your approach

import java.util.*;

class Problem3 {

    public static List<Integer> result;
    public static boolean[][] visited;
    public static int count = 1;

    public static List<Integer> spiralOrder(int[][] matrix) {
        result = new ArrayList<>();
        visited = new boolean[matrix.length][matrix[0].length];
        result.add(matrix[0][0]);
        visited[0][0] = true;
        recurse(matrix, 0, 0, visited);
        return result;
    }

    public static void recurse(int[][] matrix, int i, int j, boolean[][] visited) {
        // base
        if (count == matrix.length * matrix[0].length) {
            return;
        }
        // recurse
        if (j != matrix[0].length - 1 && !visited[i][j + 1]) {
            while (j != matrix[0].length - 1 && !visited[i][j + 1]) {
                j++;
                result.add(matrix[i][j]);
                visited[i][j] = true;
                count++;
            }
        } else if (i != matrix.length - 1 && !visited[i + 1][j]) {
            while (i != matrix.length - 1 && !visited[i + 1][j]) {
                i++;
                result.add(matrix[i][j]);
                visited[i][j] = true;
                count++;
            }
        } else if (j != 0 && !visited[i][j - 1]) {
            while (j != 0 && !visited[i][j - 1]) {
                j--;
                result.add(matrix[i][j]);
                visited[i][j] = true;
                count++;
            }
        } else if (i != 0 && !visited[i - 1][j]) {
            while (i != 0 && !visited[i - 1][j]) {
                i--;
                result.add(matrix[i][j]);
                visited[i][j] = true;
                count++;
            }
        }
        recurse(matrix, i, j, visited);
        return;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9 } };
        List<Integer> answer = spiralOrder(matrix);
        System.out.print(answer);
    }
}
