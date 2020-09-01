//Time Complexity: O(n)
//Space Complexity: O(1)
//Did it run on leetcode: Yes
//Problems faced any: No


public class Problem25 {
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length==0)
            return new int[0];

        int[] output = new int[nums.length];

        //compute left array
        int product = 1;
        for(int i=0; i<nums.length; i++){
            output[i] = product;
            product *= nums[i];
        }

        //compute right array
        //here we are actually merging both of them(left and right) so using only one array as output
        product = 1;
        for(int i=nums.length-1; i>=0; i--){
            output[i] *= product;
            product *= nums[i];
        }

        return output;

    }
}
