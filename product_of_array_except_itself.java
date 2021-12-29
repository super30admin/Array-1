class Solution{
    public int[] productExceptSelf(int[] nums){
        if(nums == null || nums.length == 0) return new int[] nums; //if there are no elements in the array or the length of the array is 0, we return empty array
        int n = nums.length;// we store the length of the integer array in a variable called as n.
        int[] result = new int[n]; // we initialize a result array whose length is equal to the number of elements present in nums array.
        int rp = 1; // we initialize the running product to 1.
        result[0] = 1; // we take the first index in the result array as 1.
        // first we are moving from left to right
        for(int i = 1; i < n; i++){ // we go through the elements present in the nums array starting from 1. we have already taken the result for index 0 as 1.
            rp = rp * nums[i -1]; // we compute the running product of all the elements that are present towards the left of i.
            result[i] = rp; // we store the running product in the result array at that particular index.
        }
        // we now move from right to left.
        rp = 1; // we are initializing the running product again back to 1.
        for(int i = n-2; i >= 0; i--){ // we start moving from right to left in the nums array
            rp = rp * nums[i+1]; // we compute the running product of the all elements that are present towards the right of i.
            result[i] = rp * result[i]; // we now compute the result for every index by multiplying it with the previous resultants.
        }
        return result; //in the end, we simply return the result.
    }
}
// tc - O(n) and sc - O(1).