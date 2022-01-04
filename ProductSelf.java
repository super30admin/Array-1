class ProductSelf {
    public int[] productExceptSelf(int[] nums) {
       
        int[] res = new int[nums.length];
         if(nums ==null || nums.length ==0) return new int[0];
        int rp=1;
        res[0]= 1;
        for(int i=1;i<nums.length; i++){
            rp =rp*nums[i-1];
            res[i]=rp;
        }
        rp=1;
        for(int i=nums.length -2 ; i>=0; i--){
            rp = rp* nums[i+1];
            res[i] = res[i]*rp;
            
        }
        return res;
        
        
    }
}