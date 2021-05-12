class ProductOfArrayExceptSelf{
    public int[] productExceptSelf(int[] nums) {
        
        
        /*
        
        Thought Process -> 
        
        Go left by keeping running product, and then back right with multiplying again with running product
        
        TC -> O(N)
        SC -> O(1) as result is considered as output itself
        
        */
        
        int rp=1;
        int res[] = new int[nums.length];
        res[0] = rp;
        for(int i=1; i<nums.length;i++){
            rp *= nums[i-1];
            res[i] = rp;
        }
        rp=1;
        for(int i=nums.length-2; i>=0; i--){
            rp *= nums[i+1];
            res[i] *= rp; 
        }
        return res;
    }
}