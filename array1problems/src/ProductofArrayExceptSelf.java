class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        int[] output = new int[nums.length];
        int productleft=1;

        for(int x=0;x<nums.length;x++){
            output[x]=productleft;
            productleft*=nums[x];
        }

        int productright=1;
        for(int x=nums.length-1;x>=0;x--){
            output[x]*=productright;
            productright*=nums[x];
        }
        return output;
    }
}

//Time complexity = o(n) 
//space complexity =o(1) 