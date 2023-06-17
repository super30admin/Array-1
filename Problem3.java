import java.util.ArrayList;
import java.util.List;

class Problem3 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rmin = 0, cmin = 0, rmax = matrix.length - 1, cmax = matrix[0].length - 1;
        int ele = matrix.length * matrix[0].length;
        int[] res = new int[ele];
        int count = 0;
        while (count < ele) {
            for (int j = cmin; j <= cmax && count < ele; j++) {
                res[count] = matrix[rmin][j];
                count++;
            }
            rmin++;
            for (int i = rmin; i <= rmax && count < ele; i++) {
                res[count] = matrix[i][cmax];
                count++;
            }
            cmax--;
            for (int j = cmax; j >= cmin && count < ele; j--) {
                res[count] = matrix[rmax][j];
                count++;
            }
            rmax--;
            for (int i = rmax; i >= rmin && count < ele; i--) {
                res[count] = matrix[i][cmin];
                count++;
            }
            cmin++;
        }
        List<Integer> result = new ArrayList<>();
        for (int num : res) {
            result.add(num);
        }
        return result;
    }
}
