import java.util.ArrayList;
import java.util.List;

/*  
 * Complexity of algorithm is O(m*n), where m is no of rows and n is number of column.
 *  
 * */

public class SpiralMatrix {

	public List<Integer> spiralOrder(int[][] matrix) {

		if (matrix == null || matrix.length == 0)
			return new ArrayList<>();

		List<Integer> result = new ArrayList<>();
		int top = 0;
		int bottom = matrix.length - 1;
		int left = 0;
		int right = matrix[0].length - 1;

		while (top <= bottom && left <= right) {

			for (int i = left; i <= right; i++) {

				result.add(matrix[top][i]);
			}
			top++;

			for (int i = top; i <= bottom; i++) {

				result.add(matrix[i][right]);
			}
			right--;

			if (top <= bottom && left <= right) {

				for (int i = right; i >= left; i--) {
					result.add(matrix[bottom][i]);
				}

				bottom--;

			}

			if (top <= bottom && left <= right) {

				for (int i = bottom; i >= top; i--) {
					result.add(matrix[i][left]);
				}

				left++;

			}

		}

		return result;

//	         List<Integer> sprial= new ArrayList<>();

//	         for(int i=0;i<matrix.length;i++){
//	             int j;
//	             for(j=0;i<matrix[0].length;j++){

//	                 System.out.println(matrix[i][j]);
//	             }

//	             int k=1;
//	             j--;
//	             while(k< matrix.length ){
//	                 System.out.println(matrix[k++][j]);

//	             }

//	         }

//	         return sprial;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		SpiralMatrix objIn = new SpiralMatrix();

		objIn.spiralOrder(matrix);

	}

}
