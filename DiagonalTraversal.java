/*
498. Diagonal Traverse - MEDIUM
https://leetcode.com/problems/diagonal-traverse/
Did this code successfully run on Leetcode: Yes
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DiagonalTraversal {

    /*
        [ 1, 2, 3 ]
        [ 4, 5, 6 ]
        [ 7, 8, 9 ]
    */

    /*
    use the indices property of a 2D matrix
    for diagonal elements, rowNo + colNo is the same for all elements in the same diagonal

    sum | elements
    0   |    1
    1   |    2,4
    2   |    3,5,7
    3   |    6,8
    4   |    9

    Store these elements in a HashMap as <sum, element>
    as we are traversing row-wise, all elements are added from the top to bottom
    Thus, reverse alternate lists in the map and add to the final result

    TC: O(m*n); m - rows, n - cols
    SC: O(m+n) entries in the map as the sum can be from 0 to (m+n-1)
    */
    public int[] findDiagonalOrderWithHashMap(int[][] matrix) {
        // base case
        if (matrix == null || matrix.length == 0) {
            return new int[] {};
        }
        
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int m = matrix.length, n = matrix[0].length;
        int[] res = new int[m*n];
        
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum = i+j;
                
                ArrayList<Integer> list = map.getOrDefault(sum, new ArrayList<Integer>());
                list.add(matrix[i][j]);
                map.put(sum, list);
            }
        }
        
        // upwards
        boolean flag = true;
        int j = 0;
        for (int i = 0; i < m + n - 1; i++) {
            ArrayList<Integer> list = map.get(i);
            if (flag == true) {
                Collections.reverse(list);
            }
            // reverse direction after processing one sum value, i.e. one diagonal
            flag = !flag;
            for (int num: list) {
                res[j++] = num;
            }
        }
        
        return res;
    }
    

    /*
    Traverse in the elements in the matrix in the same manner as we'd visually
    If we are going upwards, the row decreases and column increases
    - if we hit the top row -> increment col, or the rightmost column -> increment row, 
      and the direction has to be reversed
    - here specifically, we check for rightmost column condition first, 
      as for the top-right element, there will be an overflow if we increase the column.
    If we are going downwards, the row increases and column decreases
    - if we hit the leftmost colum -> increment row, or bottom row -> increment col, 
      and the direction has to be reversed
    - here specifically, we check for bottom row condition first, 
      as for the bottom-left element, there will be an overflow if we increase the row.
    */
    public int[] findDiagonalOrder(int[][] matrix) {
        // base case
        if (matrix == null || matrix.length == 0) {
            return new int[] {};
        }
        
        int m = matrix.length, n = matrix[0].length;
        
        boolean isDirectionUp = true;
        int res[] = new int[m*n];
        int i = 0, j = 0, index = 0;
        
        while (i < m && j < n) {
            res[index++] = matrix[i][j];
            // up
            if (isDirectionUp == true) {
                // this condition has to be first to avoid early direction change
                if (j == n-1) { // rightmost column
                    i++;
                    isDirectionUp = !isDirectionUp;
                } else if (i == 0) { // topmost row
                    j++;
                    isDirectionUp = !isDirectionUp;
                } else {
                    i--;
                    j++;
                }
            } 
            // down
            else if (isDirectionUp == false) {
                // this condition has to be first to avoid early direction change
                if (i == m-1) { // bottommost row
                    j++;
                    isDirectionUp = !isDirectionUp;
                } else if (j == 0) { // leftmost column
                    i++;
                    isDirectionUp = !isDirectionUp;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return res;
    }
}
