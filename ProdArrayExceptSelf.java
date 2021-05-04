/*
Description: Here an auxillary 1D array is created for computing the left elements' product and on same array we also calculate the 
products of elements' right to that particular index in the nums array, the product of previously calculated left products gives the result.
Time Complexity: O(n) usage of for loop.
Space Complexity: O(1) we use no extra space other than that specified in input and required in the output
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int results[] = new int[nums.length];
        if(nums == null || nums.length==0) return results;
        
        int rp = 1; results[0]=1;
        //left run
        for(int i=1;i<nums.length;i++){  //calculating left products
            rp = rp*nums[i-1];
            results[i] = rp;
        }
        rp = 1;
        //right run
        for(int i=nums.length-2;i>=0;i--){//calculating right products
            rp = rp*nums[i+1];
            results[i] = results[i]*rp;//multiplying the previously calculated left ptoducts to the right ones to obtain the final result at that index
        }
        return results;
    }
}
