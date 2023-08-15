// tc = 0(m*n)
// sc = 0(m*n)
import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

    public static void main(String[] args) {

        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }

        };

        SpiralOrder obj = new SpiralOrder();

        List<Integer> obj1 = obj.SpiralOrderOne(arr);

        System.out.println("matrix values are " + obj1);
    }

    public List<Integer> SpiralOrderOne(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int L = 0;
        int R = n - 1;
        int T = 0;
        int B = m - 1;

        List<Integer> result = new ArrayList<>();

        // top
        while (T <= B && L <= R) {
            for (int j = L; j <= R; j++) {

                result.add(matrix[T][j]);

            }
            T++;

            // right
            if (T <= B && L <= R) {
                for (int i = T; i <= B; i++) {
                    result.add(matrix[i][R]);

                }
                R--;
            }
            // bottom
            if (T <= B && L <= R) {
                for (int j = R; j >= L; j--) {
                    result.add(matrix[B][j]);
                }
                B--;
            }
            // left
            if (T <= B && L <= R) {
                for (int i = B; i >= T; i--) {
                    result.add(matrix[i][L]);
                }

                L++;
            }

        }
        return result;
    }
}