import java.util.Arrays;

/**
 * 
 */

/**
 * @author aupadhye
 *
 */
public class Array_of_products_except_self {

	/**
	 * @param args
	 */
	
	// Time Complexity is O(n) is iterating through left,right and result array
	//Space complexity is O(n) for left and right array
	public static  int[] product_except_self(int[] arr) {
		
		int n = arr.length;
		
		int[] left = new int[n];
		int[] right = new int[n];		//Maintain left and right arrays for computing products of left side except the element and right side too.
		
		left[0] = 1;
		right[n-1] = 1;
		
		for(int i=1;i<n;i++) {
			
			left[i] = left[i-1] * arr[i-1];
		}
		
		for(int j=arr.length-2;j>=0;j--) {
			
			right[j] = right[j+1] * arr[j+1];
		}
		
		int[] res = new int[n];// Multiply the left and right side of the elements in the end.
		
		for(int i=0;i<n;i++) {
			
			res[i] = left[i] * right[i];
			
		}
	return res;	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {1,2,3,4};
		System.out.println(Arrays.toString(product_except_self(arr)));
		
	}

}
