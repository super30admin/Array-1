// Time Complexity : O(n)  - n is the nummber of elements in the array
// Space Complexity : O(1) - because we are not using any space than the output array
// Did this code successfully run on Leetcode : Yes
// Here in order to get the product of array of an element except itself I will take the product of elements to it's left and then to it's right. The first for loop will be traversing from left to right and the next for loop will be traversing from right to left. I will store the left product in out array and multiply the values in right traversal iteration. temp variable is used to save the running product during the traversal. 


// Your code here along with comments explaining your approach

public static int[] productExceptSelf(int[] ar) {
	        int[] out = new int[ar.length];
			for(int i=0,tmp=1;i<ar.length;i++) {
					out[i]= tmp;
					tmp = tmp* ar[i];
			}
			for(int i=ar.length-1,tmp=1; i >= 0; i--) {
				out[i] = out[i] * tmp;
				tmp = tmp * ar[i];		
			}
			return out;
	    }
}
