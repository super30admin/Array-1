// Time - O(n)
// Space - O(1)
// Approach - Do left pass calculate multiplication of all elaments on left of that element.
// Do right pass and multiply left pass with nums array to get result
class Solution {
    // Brute force
    // public int[] productExceptSelf(int[] nums) {
    //     int[] result = new int [nums.length];
    //     for(int i=0; i <nums.length;i++){
    //         int total =1;
    //         for(int j =0; j<nums.length;j++){
    //             if(i!=j){
    //                 total= total*nums[j];
    //             }
    //         }
    //         result[i]=total;
    //     }
    //     return result;
    // }

    public int[] productExceptSelf(int[] nums) {
        //edge
        if(nums == null || nums.length == 0) return new int [nums.length];

        final int [] result = new int[nums.length];

        //left pass
        int rp = 1;
        int temp = 1;
        for(int i=0; i<nums.length; i++){
            rp = rp * temp;
            result[i] = rp;
            temp = nums[i];
        }

        //right pass
        rp =1; temp=1;
        for(int i=nums.length-1; i>=0; i--){
            rp = rp *temp;
            result[i]=rp * result[i];
            temp = nums[i];
        }

        return result;
    }
}