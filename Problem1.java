
public class Problem1 {
	 //Time Complexity : O(n)
    //Space Complexity :O(1)
    public static int[] productExceptSelf(int[] nums) {
        int prod=1;
        int[] output=new int[nums.length];
        output[0]=1;
        for(int i=1;i<nums.length;i++){
            output[i] = prod*nums[i-1];
            prod=output[i];
        }
        prod=1;
         for(int i=nums.length-1;i>=0;i--){
            output[i]= output[i]*prod;
             prod=nums[i]*prod;
             
        
        }
        
        return output;
    }
    
    public static void main(String args[]) {
    	int[] nums= new int[] {1,2,3,4};
    	int[] res=productExceptSelf(nums);
    	
    	for(int i: res) {
    		System.out.println(i);
    	}
    }
}
