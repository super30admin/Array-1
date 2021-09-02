package Arrays1;

public class ProductExceptSelf {
	 public int[] productExceptSelf(int[] nums) {
	        
	        int[] result= new int[nums.length];
	        if(nums==null || nums.length==0) return result;
	        //left pass
	        int rp1=1;
	        result[0]=rp1;
	        for(int i=1;i<nums.length;i++){
	            rp1=rp1*nums[i-1];
	            result[i]=rp1;
	        }
	        
	        //right pass
	        int rp2=1;
	       for(int i=nums.length-2;i>=0;i--){
	           rp2=rp2*nums[i+1];
	           result[i]=result[i]*rp2;
	       }
	      return result;  
	    }

}
