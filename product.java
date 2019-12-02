 Time Complexity-O(n)
 Space Complexity-O(1)
 public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            res[i] = nums[i - 1] * res[i - 1];
        }
        int M=1;
        for (int i = nums.length - 1; i >= 0; i--) {
        res[i]=res[i]*M;
        M*=nums[i];     
        }
         return res;
    }
