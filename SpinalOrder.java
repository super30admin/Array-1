//time complexity =o(N)
//space complexity=o(N)
//Approach: keep top pointer for top of the row and bottom pointer for bottom of the row,
//left pointer for left most corner of columns , right pointer for end of column.
//Iterate from left to right
//then from top to bottom
//then if top is less than bottom then iterate from right to left
//then if left is less than right then iterate from bottom to top

import java.util.ArrayList;
import java.util.List;

public class SpinalOrder {
	
	public static List < Integer > spiralOrder(int[][] matrix) {
	       List<Integer> result = new ArrayList<>();
	       int top =0;
	       int left =0;
	       if(matrix.length ==0) return result;
	       int right =matrix[0].length-1;
	       int bottom = matrix.length-1;
	       while(top<=bottom && left<=right){
	           //top row
	    	   //Iterate from left to right
	           for(int i=left; i<=right; i++){
	               result.add(matrix[top][i]);
	           }
	           top++;
	           //right column
	           //from top to bottom
	           for(int j=top ;j<=bottom ;j++){
	               result.add(matrix[j][right]);
	           }
	           right--;
	           //from right to left
	           //make note of edge condition top should be less than bottom for inner spinal this condition occurs.
	           if(top<=bottom){
	                for(int z=right;z>=left;z--){
	               result.add(matrix[bottom][z]);
	           }
	           }
	          
	           bottom--;
	           
	           //if left is less than rght then iterate from bottom to top
	           if(left<=right){
	                 for(int k=bottom;k>=top;k--){
	                     result.add(matrix[k][left]);
	           }
	           }
	           
	           left++;
	    }
	        return result;
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
