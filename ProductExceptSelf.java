

//Revised solution as per class explanation
//time complexity O(n)
//space complexity O(n)
public class ProductExceptSelf {
	
	  public static int[] productExceptSelf(int[] nums) {
	        int[] result = new int[nums.length];
	        int runningProduct =1; //keep product 
	        int temp =1; // to keep element in an array
	        
	        //forward pass
	        for(int i =0; i< nums.length; i++){
	            
	            runningProduct*= temp;
	            result[i] = runningProduct;
	            temp = nums[i];
	        }
	        
	        runningProduct =1;
	        temp=1;
	       
	        //backword pass
	        for(int j=nums.length-1; j>=0;j--){
	            runningProduct*= temp;     //product of right element
	            result[j]*= runningProduct; //product of left element and right element
	            temp = nums[j];
	        }
	        return result;
	    }
	  
	  public static void main(String[] args) {
			int[] nums = {1,2,3,4};
			int[] result = productExceptSelf(nums);
			System.out.println("result is ={");
			for(int i= 0;i<result.length;i++)
			{
				
			System.out.println(","+result[i]);
			
			}
			System.out.println("}");
		}

}
