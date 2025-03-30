// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach - keep track the current position (r, c) and a boolean dir flag that indicates "moving up" or "moving down". For each of the m*n elements:
//place the current cell value into the output array.
//move (r, c) according to whether we're going up or down.
//if we hit a boundary, adjust (r, c) and flip dir flag.

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        Boolean dir = true;    //true means upward and false means downwards
        int[] output = new int[m * n];
        int r = 0, c = 0;   //iterators for matrix
        for(int i = 0; i < m*n; i++) {
            output[i] = mat[r][c];
            if(dir) {   //upward direction
                if(r == 0 && c != n - 1) {  //first row but not last column, so go to next column and go downwards  -> 1 in eg-1
                    c++;
                    dir = false;
                } else if(c == n - 1) {    //last column so go to next row and go downwards -> 3 in eg-1
                    r++;
                    dir = false;
                } else {    //normal up case like 5 in eg-1
                    r--;
                    c++;
                }
            } else {    //downwards direction
                if(c == 0 && r != m - 1) {  //0th column but not last row, 4 in eg-1
                    r++;    //go to next row and go upward
                    dir = true;
                } else if(r == m - 1) { //last row-> 8 in eg-1
                    c++;
                    dir = true;
                }
                else {  //normal downwards -> 6 in eg-1
                    r++;
                    c--;
                }
            }
        }

        return output;
    }

    //helper function to print output array
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
    public static void main(String[] args) {
        DiagonalTraverse solver = new DiagonalTraverse();

        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] result1 = solver.findDiagonalOrder(mat1);
        System.out.println("Diagonal order traversal: " + arrayToString(result1));

        int[][] mat2 = {
                {1, 2},
                {3, 4}
        };
        int[] result2 = solver.findDiagonalOrder(mat2);
        System.out.println("Diagonal order traversal: " + arrayToString(result2));

    }
}
