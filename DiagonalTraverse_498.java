import java.util.*;
import java.util.Map.Entry;

class DiagonalTraverse_498 {

//TC: O(m*n) = where m is number of rows and n is number of columns
//SC: O(m*n) - Because of HashMap and O(1) - temp array - since we are returning that, it won't count in the auxilary space.

    public int[] getTheElementsDiagonal(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return new int[] {};

        int m = matrix.length;
        int n = matrix[0].length;
        int[] oneDim = new int[m * n];

        Map<Integer, List<Integer>> cache = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < m; i++) { // Rows
            for (int j = 0; j < n; j++) {
                int sum = i + j;
                if (cache.containsKey(sum)) {
                    List<Integer> currentList = cache.get(sum);
                    currentList.add(matrix[i][j]);
                    cache.put(sum, currentList);
                } else {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(matrix[i][j]);
                    cache.put(sum, list);
                }
            }
        }

        int tempIndex = 0;
        for (Map.Entry<Integer, List<Integer>> entry : cache.entrySet()) {

            // if it returns 0 of mod then even diagnal. - Put it in the list
            // else it is odd diagnal - reverse the list.
            if (entry.getKey() % 2 == 0) {
                List<Integer> currentList = entry.getValue();
                for (int p = currentList.size() - 1; p >= 0; p--) {
                    oneDim[tempIndex] = currentList.get(p);
                    tempIndex++;
                }
            } else {
                List<Integer> currentList2 = entry.getValue();
                for (int k = 0; k < currentList2.size(); k++) {
                    oneDim[tempIndex] = currentList2.get(k);
                    tempIndex++;
                }
            }
        }
        return oneDim;

    }

    public static void main(String[] args) {
        DiagonalTraverse_498 diagonalTraverse_498 = new DiagonalTraverse_498();
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[] array = diagonalTraverse_498.getTheElementsDiagonal(matrix);
        System.out.println(array);
    }
}