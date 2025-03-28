package s30.week3;

//https://leetcode.com/problems/diagonal-traverse/
/*
* tc: O(m*n)
* sc: O(1)
* */

public class DiagonalTraversal {

    public static int[] traverse(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0, c = 0;
        int[] result = new int[m*n];
        boolean direction = true;
        for(int i = 0 ; i < m*n ; i++) {
            System.out.println(r + " " + c + " " + direction);
            result[i] = matrix[r][c];
            if(direction) {
                if(r == 0 && c != n-1) {
                    c++;
                    direction = false;
                } else if(c == n-1) {
                    r++;
                    direction = false;
                } else {
                    r--;
                    c++;
                }
            } else {
                if(c == 0 && r != m-1) {
                    r++;
                    direction = true;
                } else if(r == m-1) {
                    c++;
                    direction = true;
                } else {
                    r++;
                    c--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] result = traverse(matrix);
        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}
