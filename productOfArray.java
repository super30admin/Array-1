// Time Complexity : O(2*n) ~ O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
1. Get total value by multiplying all the values
2. IF the number of zeros are more then 1 return all zeros values
3. If the number of zeros in equal to 1 then check the place of the zero and place the 'totalMultipliedValue'
4. If there are no zeros then loop over the array and divide the totalMultipliedValue by the current value.
*/

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalMultipliedValue = 1;
        boolean hasZero = false;
        int n = nums.length;
        int zerosLength = 0;
        int[] ans = new int[n];
        for(int i=0;i<n;i++) {
            if(nums[i] == 0) {
                //Keep track of the number of zeros
                hasZero = true;
                zerosLength++;
            }
            //Keep totalvalie but don't multiply '0' since the total becomes 0.
            else
                totalMultipliedValue *= nums[i];
        }
        //If only 1 zero is there then answer array will have only one value in the place of that array
        // If it has multiple 0's the answer array is all 0's
        if(zerosLength == n)
            totalMultipliedValue = 0;
        for(int i=0;i<n;i++) {
            if(hasZero) {
                if(nums[i] == 0 && zerosLength==1)
                    ans[i] = totalMultipliedValue;
                
            } else {
                //If no zeros then just divide the number from total
                ans[i] = totalMultipliedValue/nums[i];
            }
        }
        return ans;
    }
}
