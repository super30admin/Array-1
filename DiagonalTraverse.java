
class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null) {
            throw new IllegalArgumentException("matrix null");
        }

        if (mat.length == 0 || mat[0].length == 0) {
            return new int[0];
        }

        int rows = mat.length;
        int cols = mat[0].length;
        int[] result = new int[rows * cols];
        int r = 0;
        int c = 0;

        for (int i = 0; i < result.length; i++) {
            result[i] = mat[r][c];

            if ((r + c) % 2 == 0) {//move up
                if (c == cols - 1) {
                    r++;
                } else if (r == 0) {
                    c++;
                } else {
                    r--;
                    c++;
                }
            } else {//go down
                if (r == rows - 1) {
                    c++;
                } else if (c == 0) {
                    r++;
                } else {
                    r++;
                    c--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        DiagonalTraverse sol = new DiagonalTraverse();

        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] result = sol.findDiagonalOrder(mat);
        System.out.print("Diagonal Order: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
