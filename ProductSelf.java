class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
		
		int left = 1;
		
		for(int i=0; i<=nums.length-1; i++) {
			if(i>0) {
				left = left * nums[i-1];
			}
			output[i] = left;
        }
		
		int right = 1;
		
		for(int k=nums.length-1; k>=0; k--) {
			if(k<nums.length-1) {
				right = right * nums[k+1];
			}
			
			output[k] = output[k] * right;
		}
		
		return output;
    }
}