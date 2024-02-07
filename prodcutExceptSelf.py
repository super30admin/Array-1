# Time Complexity : O(n) since we are going through the nums array twice
# Space Complexity : O(1): we are storing the results in the final result array which is the output
# Did this code successfully run on Leetcode : yea
# Three line explanation of solution in plain english
"""
We are calculating the running product going from left to right and storing the data in a result array
seond we calculate the running product again going from right to left and also multipying the data from the previous step.
both the iterations we calculate the running product up the previous index for each given index value going through nums array 
"""

# Your code here along with comments explaining your approach


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [None] * n
        rp = 1
        result[0] = 1

        # calculate the running product going right
        for i in range(1, n):
            rp = rp * nums[i - 1]
            result[i] = rp

        # calculate the running product going left and using the result from the running prodcut going right
        rp = 1
        for i in range(n - 2, -1, -1):
            rp = rp * nums[i + 1]
            result[i] = result[i] * rp
        return result
