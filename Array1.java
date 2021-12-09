public class Array1 {
        public int[] productExceptSelf(int[] nums) {
        /*
        TC: O(n) where n is the length of the array
        SC: O(1) since we are using only output array the time complexity wont be considered in space complexity calculation
        */
            if(nums==null || nums.length==0) return new int[]{};

            int result[]=new int[nums.length];

            //initialize
            int rp=1;
            result[0]=1;
            int n=nums.length;

            //calculating running pproduct from left to right
            for(int i=1;i<n;i++){
                rp=rp*nums[i-1];
                result[i]=rp;
            }

            //calculating running pproduct from Right to left
            rp=1;
            for(int i=n-2;i>=0;i--){
                rp=rp*nums[i+1];
                result[i]=result[i]*rp;
            }
            return result;
        }
}
