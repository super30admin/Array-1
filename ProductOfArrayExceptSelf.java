import java.util.Arrays;

// Time Complexity : O(n); where n is length of array
// Space Complexity : O(1); constant as input and output array don't count towards space complexity
class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
    	if(nums==null || nums.length==0) return nums;
    	
    	int[] result= new int[nums.length];
    	
    	//Left running product saved in result array
    	result[0]=1;    	
    	for(int i=1; i<nums.length; i++) {
    		result[i]=result[i-1] * nums[i-1];
    	}
    	
    	//final Result= left running product * right running product
    	int runningProduct= 1;
    	for(int i=nums.length-2; i>=0; i--) {    
    		runningProduct= runningProduct * nums[i+1];
    		result[i]= result[i] * runningProduct;
    	}
    	
    	return result;
    }
    
    // Driver code to test above 
    public static void main(String args[]) { 
    	ProductOfArrayExceptSelf ob = new ProductOfArrayExceptSelf();  
    	int[] nums= {1,2,3,4};    
    	//int[] nums= {-1,1,0,-3,3};
        System.out.println("Product array except self is : "+Arrays.toString(ob.productExceptSelf(nums)));
    } 
}
