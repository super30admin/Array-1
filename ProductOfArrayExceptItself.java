/*
Intuition : If we do product on both eneds we will get the intended result
time : O(n)
Space : O(1)
 */

public class ProductOfArrayExceptItself {
        public static int[] productExceptSelf(int[] nums) {

            //edge case
            if(nums == null || nums.length == 0){
                return new int[0];
            }

            //Initialization

            int[] result = new int[nums.length];

            int rp = 1;
            int temp = 1;

            //left pass
            for(int i = 0; i < nums.length; i++){
                rp = rp * temp;
                result[i] = rp;
                temp = nums[i];
            }

            rp = 1; temp = 1;

            //right pass
            for(int i = nums.length - 1; i >= 0; i--){
                rp = rp * temp;
                result[i] = result[i] * rp;
                temp = nums[i];
            }

            return result;

        }

    public static void main(String[] args) {
        int[] nums = new int[]{ -1,1,0,-3,3};
        int[] result = productExceptSelf(nums);

        for(int i : result){
            System.out.print("  " + i);
        }

    }
}
