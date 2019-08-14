import java.util.ArrayList;
import java.util.List;

/**
 * Logic: Four-pointer compress approach
 * Time: O(n)
 * Space: O(1)
 * Leetcode accpeted: Yes
 * Problems face: No
 */
public class SpiralMatrix {
	public static List<Integer> spiralOrder(int[][] matrix) {
		if(matrix == null || matrix.length == 0) return new ArrayList<>();
        int nrows = matrix.length;
		int ncols = matrix[0].length;
		List<Integer> result = new ArrayList<>();
		int top = 0, bottom = nrows-1, left = 0, right = ncols-1;
		
		while(left <= right && top <= bottom) {
			
			//Top constant. Traverse thru that row starting from left until right
			for(int i=left; i<=right; i++) {
				result.add(matrix[top][i]);
			}
			top++; //compress top
			
			//Right constant. Traverse thru that column starting from top until bottom
			for(int i=top; i<=bottom; i++) {
				result.add(matrix[i][right]);
			}
			right--; //compress right
			
			//Bottom constant. Traverse thru that row starting from right until left
			// Since top has been already moved, check if it crossed bottom
			if(top <= bottom) {
				for(int i=right; i>=left; i--) {
					result.add(matrix[bottom][i]);
				}
				bottom--; //compress bottom
			}
			
			//Left constant. Traverse thru that column starting from bottom until top
			// Since top has been already moved, check if it crossed bottom
			if(left <= right) {
				for(int i=bottom; i>=top; i--) {
					result.add(matrix[i][left]);
				}
				left++; //compress left
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println(spiralOrder(matrix));;
	}

}
