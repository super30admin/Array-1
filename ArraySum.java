 class ArraySum {
    public int[] productExceptSelf(int[] nums) {
        int a = nums.length;  
        int [] store = new int[a];   
        if(nums == null || nums.length == 0) return store;
        int rp = 1;
        store[0] = 1;
        
        for(int i = 1; i < a; i++){
            rp = rp * nums[i - 1];
            store[i] = rp;
        }
        rp = 1;
        for(int i =  - 2; i >= 0; i-- ){
            rp = rp * nums[i + 1];
            store[i] = store[i] * rp;
        }
        return store;
    }
}
