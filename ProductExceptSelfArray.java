// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class ProductArrayExceptSelfSolution {
    public static int[] productExceptSelf(int[] nums) {
        
        int[] product = new int[nums.length];
        
        for(int i=0; i<nums.length; i++) {
            product[i] = 1;
        }
        
        for(int i=1; i<nums.length; i++) {
            product[i] = product[i-1] * nums[i-1];
        }
        
        int right = 1;
        
        for(int i=nums.length-1; i>=0; i--) {
            product[i] = product[i] * right;
            right = right * nums[i];
        }
        return product;        
    }

    public static void main(String args[]) {
        int[] numbers = {1,2,3,4};
        int[] result = new int[numbers.length];
        result = productExceptSelf(numbers);
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}