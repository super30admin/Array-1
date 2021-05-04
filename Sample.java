import java.util.Arrays;

// Your code here along with comments explaining your approach
class Sample {

    public static int[] spiralOrder(int[][] matrix)
    {
        /*
        ** Time Complexity : O(m*n)
        ** Space Complexity : O(1)
        ** Did this code successfully run on Leetcode : Yes
        ** https://leetcode.com/problems/spiral-matrix/
        ** use two pointers - rowLevel and columnLevel to keep track of the boundaries
        ** print top (left to right), right (top to bottom), bottom (right to left) and left (bottom to top) lines
        ** stop when we get m * n elements in the output array.
        */
        int rowLevel = 0;
        int columnLevel = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int size = m * n;
        int[] output = new int[size];
        int p = 0;
        while (p < size) {
            for (int j = columnLevel; j < n - columnLevel; j++)
                output[p++] = matrix[rowLevel][j];
            for (int i = rowLevel + 1; i < m - rowLevel; i++)
                output[p++] = matrix[i][n - columnLevel - 1];
            if (p < size){
                for (int j = n - columnLevel - 2; j > columnLevel - 1; j--)
                    output[p++] = matrix[m - rowLevel - 1][j];
                for (int i = m - rowLevel - 2; i > rowLevel; i--)
                    output[p++] = matrix[i][columnLevel];
            }
            rowLevel++;
            columnLevel++;
        }
        return output;
    }

    public static int[] findDiagonalOrder(int[][] mat) {
        /*
        ** Time Complexity : O(m*n)
        ** Space Complexity : O(1)
        ** Did this code successfully run on Leetcode : Yes
        ** https://leetcode.com/problems/diagonal-traverse
        ** start from (0, 0) set direction to UP (1)
        ** UP: check right bound then top bound and change direction
        ** DOWN: check bottom bound then left bound and change direction
        */
        int UP = 1, DOWN = -1;
        int direction = UP;
        int i = 0; // row index
        int j = 0; // column index
        int m = mat.length;
        int n = mat[0].length;
        int size = m * n;
        int[] output = new int[size];
        int k = 0; // to keep track of output
        while (k < size) {
            output[k] = mat[i][j];
            if (direction == UP) {
                if (j == n - 1) {
                    i++; direction = DOWN;
                }
                else if (i == 0) {
                    j++; direction = DOWN;
                } else {
                    i--; j++;
                }
            } else {
                 if (i == m - 1) {
                    j++; direction = UP;
                }
                else if (j == 0) {
                    i++; direction = UP;
                } else {
                    i++; j--;
                }
            }
            k++;
        }
        return output;
    }

    public static int[] productExceptSelf(int[] nums) {
        /*
        ** Time Complexity : O(n)
        ** Space Complexity : O(1)
        ** Did this code successfully run on Leetcode : Yes
        ** https://leetcode.com/problems/product-of-array-except-self/
        ** keep a running sum of all elements to the left and
        ** another running sum of all elements to the right of the element at i
        ** product of both = product of all except element at i
        */
        int size = nums.length;
        int[] output = new int[size];
        Arrays.fill(output, 1);
        
        int left = 1;
        int right = 1;
        
        for (int i = 0; i < size; i++){
            output[i] *= left;
            output[size-1-i] *= right;
            left *= nums[i];
            right *= nums[size-1-i];
        }

        return output;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println("Diagonal Order: " + String.join(" ", Arrays.stream(findDiagonalOrder(matrix))
                                                                        .mapToObj(String::valueOf)
                                                                        .toArray(String[]::new)));
        System.out.println("Spiral Order: " + String.join(" ", Arrays.stream(spiralOrder(matrix))
                                                                        .mapToObj(String::valueOf)
                                                                        .toArray(String[]::new)));
        System.out.println("Product Except Self: " + String.join(" ", Arrays.stream(productExceptSelf(new int[] {-1,1,0,-3,3}))
                                                                        .mapToObj(String::valueOf)
                                                                        .toArray(String[]::new)));
    }
}