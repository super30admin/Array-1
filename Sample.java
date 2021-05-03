// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Sample {
    public static int[] findDiagonalOrder(int[][] mat) {
        int direction = 1;
        int i = 0;
        int j = 0;
        int m = mat.length;
        int n = mat[0].length;
        int size = m * n;
        int[] output = new int[size];
        int k = 0;
        while (k < size) {
            output[k] = mat[i][j];
            if (direction == 1) {
                if (j == n - 1) {
                    i++; direction = -1;
                }
                else if (i == 0) {
                    j++; direction = -1;
                } else {
                    i--; j++;
                }
            } else {
                 if (i == m - 1) {
                    j++; direction = 1;
                }
                else if (j == 0) {
                    i++; direction = 1;
                } else {
                    i++; j--;
                }
            }
            k++;
        }
        return output;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[] output = findDiagonalOrder(matrix);
        for(int o: output) {
            System.out.print(o + ", ");
        }
        System.out.println();
    }
}