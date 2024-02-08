
import java.util.ArrayList;
import java.util.List;

//TC - O(m*n)
//Space - O(1)
public class SpiralMatrix {
	public static List<Integer> spiralOrder(int[][] matrix) {
		ArrayList<Integer> list = new ArrayList<>();
		int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
		while (top <= bottom && left <= right) {
			for (int i = left; i <= right; i++) {
				list.add(matrix[top][i]);
			}
			top++;
			for (int i = top; i <= bottom; i++) {
				list.add(matrix[i][right]);
			}
			right--;
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					list.add(matrix[bottom][i]);
				}
				bottom--;
			}
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					list.add(matrix[i][left]);
				}
				left++;
			}
		}
		return list;

	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		List<Integer> a = spiralOrder(mat);
		System.out.println(a);
	}

}
