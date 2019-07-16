import java.util.ArrayList;
import java.util.List;

public class SpinalOrderRecursion {
	  List<Integer> result =new ArrayList<>();
	    public static  List < Integer > spiralOrder(int[][] matrix) {
	        if(matrix.length ==0) return     result;
	         helper(matrix, 0, matrix[0].length -1, 0, matrix.length-1);
	        return result;
	        
	    }
	     public void helper(int[][] matrix, int left, int right, int top, int bottom){
	         if(left>right || top>bottom) return;
	         for( int i=left; i<=right; i++) result.add(matrix[top][i]);
	         top++;
	         for(int i=top; i<=bottom;i++ ) result.add(matrix[i][right]);
	         right--;
	         if(top<=bottom){
	             for(int i=right;i>=left;i--) result.add(matrix[bottom][i]);
	         }
	         bottom--;
	         if(left<=right){
	             for(int i= bottom;i>=top; i--) result.add(matrix[i][left]);
	         }
	         left++;
	         helper(matrix, left, right, top,bottom);
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
