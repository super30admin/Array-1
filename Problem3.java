//LeetCode Problem 54
//Time Complexity: O(m*n)
//Space Complexity : O(1), no extra space utilized, problem itself requires an ArrayList output.
//Code run successfully on LeetCode.

public class Problem3 {
	
	public List<Integer> spiralOrder(int[][] matrix) {
		
		if(matrix == null || matrix.length == 0)
			return new ArrayList<>();
		
		List<Integer> result = new ArrayList<>();
		int m = matrix.length;
		int n = matrix[0].length;
		
		int top = 0, bottom = m-1;
	    int left =0, right = n-1;
	    
	    while(top <= bottom && left <= right) {
	    	
	    	for(int i = left; i <= right; i++) {
	    		result.add(matrix[top][i]);
	    	}
	    	top++;
	    	
	    	for(int i = top; i <= bottom; i++) {
	    		result.add(matrix[i][right]);
	    	}
	    	right--;
	    	
	    	if(top <= bottom) {
	    		for(int i= right; i >= left; i--) {
		    		result.add(matrix[bottom][i]);
		    	}
		    	bottom--;
	    	}
	    	
	    	if(left <= right) {
	    		for(int i = bottom; i >= top; i--) {
		    		result.add(matrix[i][left]);
		    	}
		    	left++;
	    	}
	    	
	    }
	   return result; 
    }

}
