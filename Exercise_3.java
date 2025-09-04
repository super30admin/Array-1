import java.util.ArrayList;
import java.util.List;
//
public class Exercise_3 {

    // time complexity - O(m * n)
    // space complexity - O(1)

    /** Define minrow, maxrow, mincol and maxcol. Traverse row and col one after the other
     * and keep incrementing and decrementing row & col pointers accordingly.
     * Avoid duplicate row and column traversal.
     */
    private static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int minrow = 0;
        int mincol = 0;
        int maxrow = m - 1;
        int maxcol = n - 1;

        List<Integer> ans = new ArrayList<>();
        while (minrow <= maxrow && mincol <= maxcol) {
            // Traverse right
            for (int i = mincol; i <= maxcol; i++) {
                ans.add(matrix[minrow][i]);
            }
            minrow++;

            // Traverse down
            for (int i = minrow; i <= maxrow; i++) {
                ans.add(matrix[i][maxcol]);
            }
            maxcol--;

            // Check before left traversal - avoid duplicate row traversal
            if (minrow <= maxrow) {
                for (int i = maxcol; i >= mincol; i--) {
                    ans.add(matrix[maxrow][i]);
                }
                maxrow--;
            }

            // Check before upward traversal - avoid duplicate column traversal
            if (mincol <= maxcol) {
                for (int i = maxrow; i >= minrow; i--) {
                    ans.add(matrix[i][mincol]);
                }
                mincol++;
            }
        }
        return ans;
    }
    static void printArray(List<Integer> arr)
    {
        int n = arr.size();
        for (int i=0; i<n; ++i)
            System.out.print(arr.get(i)+" ");
        System.out.println();
    }
    public static void main(String [] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> output = spiralOrder(nums);
        System.out.println("output is: ");
        printArray(output);

        nums = new int[][]{{1,2},{3,4}};
        output = spiralOrder(nums);
        System.out.println("output is: ");
        printArray(output);

        nums = new int[][]{{1,2,3,4},{4,5,6,7},{7,8,9,0}};
        output = spiralOrder(nums);
        System.out.println("output is: ");
        printArray(output);
    }
}
