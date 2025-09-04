public class Exercise_2 {

    // time complexity - O(m * n)
    // space complexity - O(1)

    /** Traverse matrix with writing current cell in output array and
     * track a up pointer and change it based on the direction of traversal.
     * Move diagonally and change row & col based on edge cases
     */
    private static int[] findDiagonalOrder(int[][] mat) {
        boolean up = true;
        int m = mat.length;
        int n = mat[0].length;
        int k =0;
        int [] result = new int[m*n];
        int i = 0;
        int j = 0;
        while(k < result.length){
            result[k++] = mat[i][j];
            if (up) {
                // moving up-right
                if (j == n - 1) {
                    i++;
                    up = false;
                } else if (i == 0) {
                    j++;
                    up = false;
                } else {
                    i--;
                    j++;
                }
            } else {
                // moving down-left
                if (i == m - 1) {
                    j++;
                    up = true;
                } else if (j == 0) {
                    i++;
                    up = true;
                } else {
                    i++;
                    j--;
                }
            }

        }
        return result;
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String [] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        int[] output = findDiagonalOrder(nums);
        System.out.println("output is: ");
        printArray(output);

        nums = new int[][]{{1,2},{3,4}};
        output = findDiagonalOrder(nums);
        System.out.println("output is: ");
        printArray(output);

        nums = new int[][]{{1,2,3,4},{4,5,6,7},{7,8,9,0}};
        output = findDiagonalOrder(nums);
        System.out.println("output is: ");
        printArray(output);
    }
}
