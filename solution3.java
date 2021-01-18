// time and space of O(row* col) if output not considerd as storing space
// space of O(1) constant
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
import java.util.ArrayList;
import java.util.List;

public class solution3 {

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<>();
		if(matrix.length == 0 ) return result;

		//for checking column boundary
		int left = 0;
		int right = matrix[0].length - 1 ;
		//for checking row boundary
		int top = 0;
		int bottom = matrix.length - 1;

		while(left<= right && top <= bottom){
		//Top row
		for(int i = left ; i<= right ; i++){
		    result.add(matrix[top][i]);
		}
		top++ ;
		// right column
		for(int i = top ; i<= bottom ; i++){
		    result.add(matrix[i][right]);
		}
		right-- ;
		if(top<= bottom){
		    for(int i = right ; i>= left ; i--){
		        result.add(matrix[bottom][i]);
		    }
		}
		bottom-- ;
		if(left<= right){
		    for(int i = bottom ; i>=top ; i--){
		        result.add(matrix[i][left]);
		    }
		}
		left++;
		}
		return result;
		}
		} 