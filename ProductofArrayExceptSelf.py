#Time Complexity : O(n) where n is the length of the nums list
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No

#Approach: We use a running product variable. In the first for loop, we iterate through the nums list and we find the running
# product at each step (multiplication of the numbers in the left). We store this in the result array. In the next for loop, 
# we iterate from the 2nd last element to the 1st element. We again find the running product at each step (multiplication of the numbers in right)
# We multiple this running product with the value at the index of the current iteration in the result array.
# Taking the running product variable reduces the space complexity from n to 1.

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [0] * len(nums)
        rp = 1
        result[0] = 1
        for i in range(1, len(nums)):
            rp *= nums[i-1]
            result[i] = rp

        rp = 1
        for i in range(len(nums) - 2, -1, -1):
            rp *= nums[i+1]
            result[i] = rp * result[i]
        
        return result

        