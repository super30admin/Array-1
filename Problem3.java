import java.util.ArrayList;
import java.util.List;

public class Problem3 {

    // TC: O(M * N)
    // SC: O(1)

    public static List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length <= 0)    return new ArrayList<>();

        ArrayList<Integer> result = new ArrayList<>();
        int rows = matrix.length, columns = matrix[0].length, up = 0, down = rows - 1, left = 0, right = columns - 1;

        while (result.size() < rows * columns) {
            for (int col = left; col <= right; ++col)
                result.add(matrix[up][col]);
            for (int row = up + 1; row <= down; ++row)
                result.add(matrix[row][right]);
            if (up != down)
                for (int col = right - 1; col >= left; --col)
                    result.add(matrix[down][col]);
            if (left != right)
                for (int row = down - 1; row > up; --row)
                    result.add(matrix[row][left]);
            ++up;
            --down;
            ++left;
            --right;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{11, 23, 33}, {44, 55, 66}, {77, 88, 99}}));
        System.out.println(spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }
}
