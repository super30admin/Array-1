//TC- O(n)
//SC- O(1) - As we are only using array which is to be returned from function.

// We solve this taking products of left side of each element and storing in result array
// Next, product of right side of each elemtn is multiplied with left side giving final array
class ArrayProduct {
    public int[] productExceptSelf(int[] nums) {
        
        //base case
        if(nums==null || nums.length==0){
            return new int[] {};
        }

        int[] result = new int[nums.length];
        int rp = 1;
        result[0] = rp;
        // left array
        for(int i=1; i<nums.length; i++){
            rp = rp * nums[i-1];
            result[i]=rp;
        }

        rp=1;
        // right array and result product
        for(int i=nums.length-2; i>=0 ;i--){
            rp = rp * nums[i+1];
            result[i] = rp*result[i];
        }

        return result;
    }
}