class Solution {
    public int[] productExceptSelf(int[] nums) {
        //edge condition
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        
        int n = nums.length;
        int[] result = new int[n];//declaring new result array of size of nums array;
        
        //declaring the running product and 
        //initializing the first element of result array to rp
        int rp = 1;
        result[0] = rp;
        
        //calculating the left hand products 
        for(int i = 1; i < n; i++){
            rp = rp * nums[i-1];
            result[i] = rp;
        }
        
        rp = 1;
        //calculating for right hand side
        for(int i = n-2; i>=0; i--){
            rp = rp*nums[i+1];
            result[i]*=rp;
        }
        
        return result;
    }
}


//Time Complexity: O(n)
//Space Complexity: O(1)