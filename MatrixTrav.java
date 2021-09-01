public class MatrixTrav {
    public int[] findDiagonalOrder(int[][] mat) {

        if (mat.length == 0 || mat == null)
            return new int[0];

        int[] nums = new int[mat.length * mat[0].length];
        int count = 0;
        int dir = 1;
        int i = 0;
        int j = 0;
        while (count < (mat.length * mat[0].length)) {
            nums[count] = mat[i][j];
            count++;

            if (dir == 1) {

                if (j == mat[0].length - 1) {
                    dir = -1;
                    i++;
                } else if (i == 0) {
                    dir = -1;
                    j++;
                } else {
                    j++;
                    i--;
                }
            } else {
                if (i == mat.length - 1) {
                    dir = 1;
                    j++;
                } else if (j == 0) {
                    i++;
                    dir = 1;
                } else {
                    j--;
                    i++;
                }
            }

        }
        return nums;
    }

    public static void main(String[] args) {
        MatrixTrav mt = new MatrixTrav();
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        mt.findDiagonalOrder(mat);
    }
}
