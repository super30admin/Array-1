// https://leetcode.com/problems/product-of-array-except-self/description/

// Time Complexity : Optimized - O(N), where N is the number of elements in input array
// Space Complexity : Optimized - O(1), only op array is used and it does not count as extra space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// At each point we need product of all elements to the left,
// and product of all elements to the right

// Your code here along with comments explaining your approach



class Solution {

    private int[] bruteForce(int[] nums){
        int[] op=new int[nums.length];

        // For each element, use nested loops to calculate left and right product
        for(int i=0;i<nums.length;i++){

            // Calculate left product
            int leftP=1;
            for(int j=0;j<i;j++){
                leftP=leftP*nums[j];
            }

            // Calculate right product
            int rightP=1;
            for(int j=i+1;j<nums.length;j++){
                rightP=rightP*nums[j];
            }    

            // Product except current element= leftP * rightP
            op[i]=leftP*rightP;        
        }

        return op;
    }

    private int[] optimized(int[] nums){
        // In brute force, we see that the work of producing leftP and rightP is repeated
        // To avoid that we can store running product in an array and use that

        int[] op=new int[nums.length];

        // Calculate running left product from and store in op
        op[0]=1;
        for(int i=1;i<nums.length;i++){
            op[i]=op[i-1]*nums[i-1];
        }

        // Calculate running product from right on the go, and
        // update op
        int runningRightP=1;
        for(int i=nums.length-1;i>=0;i--){
            op[i]=op[i]*runningRightP;
            runningRightP=runningRightP*nums[i];
        }

        return op;
    }

    public int[] productExceptSelf(int[] nums) {
        //return bruteForce(nums);
        return optimized(nums);
    }
}