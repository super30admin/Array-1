import java.util.ArrayList;
import java.util.List;

//Time Complexity: O(N), where N is the total number of elements in the input matrix. We add every element in the matrix to our final answer.

//Space Complexity: O(N), the information stored in ans

//Did this code successfully run on Leetcode : yes
//Any problem you faced while coding this:no
public class FindSpinalOrder {
	   public static List < Integer > spiralOrder(int[][] matrix) {
	        List ans = new ArrayList();
	        if (matrix.length == 0)
	            return ans;
	        int r1 = 0, r2 = matrix.length - 1;
	        int c1 = 0, c2 = matrix[0].length - 1;
	        while (r1 <= r2 && c1 <= c2) {
	            for (int c = c1; c <= c2; c++) ans.add(matrix[r1][c]);
	            for (int r = r1 + 1; r <= r2; r++) ans.add(matrix[r][c2]);
	            if (r1 < r2 && c1 < c2) {
	                for (int c = c2 - 1; c > c1; c--) ans.add(matrix[r2][c]);
	                for (int r = r2; r > r1; r--) ans.add(matrix[r][c1]);
	            }
	            r1++;
	            r2--;
	            c1++;
	            c2--;
	        }
	        return ans;
	    }
	   
		public static void main(String[] args) {
			int arr[][]={{1,2,3},{4,5,6},{7,8,9}}; 
			List<Integer> result = new ArrayList();
				result =	spiralOrder(arr);
			System.out.print("result is");
		
				for(int i= 0;i<result.size();i++) 
					System.out.print(","+result.get(i) );
				}

}
