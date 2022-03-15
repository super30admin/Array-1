import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(n*m); where m=rows and n=cols in matrix
// Space Complexity : O(1); constant as input and output array don't count towards space complexity
class MatrixSpiralTraverse {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result= new ArrayList<>();
		
    	if(matrix==null || matrix.length==0) return result;
    	
    	int m= matrix.length;//rows
    	int n= matrix[0].length; //cols    	
    	
    	int top=0; int left=0;
    	int bottom=m-1; int right=n-1; 
    	
    	while(left<=right && top<=bottom) {    		
    		//top row: left to right
    		for(int i=left; i<=right; i++) {
    			result.add(matrix[top][i]);
    		}
    		top++;
    		
    		//right wall: top to bottom
	    	for(int i=top; i<=bottom; i++){
	    		result.add(matrix[i][right]);
	    	}
	    	right--;
	    	
	    	//bottom row: right to left
	    	if(top <= bottom) {
		    	for(int i=right; i>=left; i--) {
	    			result.add(matrix[bottom][i]);
	    		}
	    	}
    		bottom--;
    		
    		//left wall: bottom to up
    		if(left <= right) {
	    		for(int i=bottom; i>=top; i--) {
	    			result.add(matrix[i][left]);
	    		}
    		}
    		left++;
		}
    	return result;
    }
    
    // Driver code to test above 
    public static void main(String args[]) { 
    	MatrixSpiralTraverse ob = new MatrixSpiralTraverse();  
    	int[][] mat= {{1,2,3},{4,5,6},{7,8,9}};  
    	//int[][] mat= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};  
        System.out.println("Matrix Spiral traversal is : "+ob.spiralOrder(mat));
    } 
}
