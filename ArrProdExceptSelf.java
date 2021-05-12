// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//   1. For each and every element we calculate the running product up to its previous left element.
//   2. For each and every element we calculate the running product up to its next right element.
//   3. Finally for each index, we multiply the element at left and right indexes to compute the product except the current element.

// Your code here along with comments explaining your approach

public class ArrProdExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        
        if(nums == null || nums.length == 0) return new int[0];
        
        int[] result = new int[nums.length];
        
        // Generating the left product of each element in input array
        result[0] = 1;
        for(int i = 1; i < nums.length; i++){
            result[i] = result[i-1]*nums[i-1];
        }
        
        // Generating the final result by applying the right product.
        int rp = 1;
        for(int i = nums.length-2; i >=0; i--){
            rp *= nums[i+1];
            result[i] = result[i] * rp;
        }
        
        return result;
    }

    public static void printArr(int[] nums){
        for(int num: nums){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArr(productExceptSelf(new int[]{1,2,3,4}));
        printArr(productExceptSelf(new int[]{-1,-1,0,-3,-3}));
    }
}
