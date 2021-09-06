package Arrays1;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	 public List<Integer> spiralOrder(int[][] matrix) {
	        List<Integer> result= new ArrayList<Integer>();
	        if(matrix==null || matrix.length==0) return result;
	        int rows= matrix.length;
	        int cols= matrix[0].length;
	        int top=0;
	        int bottom=rows-1;
	        int left=0;
	        int right=cols-1;
	        
	        
	        // till we traverse entire matrix
	        while(top<=bottom && left<=right){
	           
	            // left to right
	            for(int j=left;j<=right;j++){
	                result.add(matrix[top][j]);
	            }
	            top++;
	            if(top<=bottom && left<=right){
	            //top to bottom
	            for(int j=top;j<=bottom;j++){
	                result.add(matrix[j][right]);
	            }
	            right--;
	            }
	            
	             if(top<=bottom && left<=right){
	            // right to left
	            for(int j=right;j>=left;j--){
	                 result.add(matrix[bottom][j]);
	            }
	            bottom--;
	             }
	             if(top<=bottom && left<=right){
	            //bottom to top
	            for(int j=bottom;j>=top;j--){
	                result.add(matrix[j][left]);
	            }
	            left++;
	        }
	        
	    }
	        return result;
	}

}
