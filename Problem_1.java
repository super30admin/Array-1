
public class Problem_1 {
	
public int[] productExceptSelf(int[] nums) {
        
        int[] output = new int[nums.length];
        if(nums == null || nums.length == 0){
            return new int[]{};
        }
        
        int prod = 1;
        int temp = nums[0];
        
        output[0] = prod;
        
        for(int i = 1; i < nums.length; i++){
            prod = temp * prod;
            temp = nums[i];
            output[i] = prod;
        }
        
        temp = nums[nums.length-1];
        prod = 1;
        for(int i=nums.length-2; i >= 0; i--){
            prod = temp * prod;
            temp = nums[i];
            output[i] = output[i] * prod;
        }
        
        return output;
    }

}
