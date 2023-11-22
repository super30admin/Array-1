// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


//initailize rp = 1
//check the left product and right product of the array.
//merge them to get the product.

public class Problem1 {
    public static int[] productExceptSelf(int[] nums) {
        int[] list = new int[nums.length];
        int rp = 1;
        list[0] = 1;
        for(int i=1;i<nums.length; i++){
            rp = rp*nums[i-1];
            list[i] = rp;
        }
        
        rp = 1;
        
        for(int i=nums.length - 1; i >= 0; i --){
           list[i] = list[i] * rp;
            rp = rp*nums[i];
           
        }
        return list;
    }

    public static void main(String[] arg) {
        int[] nums = new int[]{1,2,3,4};
        int[] result = productExceptSelf(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
