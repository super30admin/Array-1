#Time Complexity : O(n)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode :Yes
#Any problem you faced while coding this :No
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output = [1] *(len(nums)) # eachg position has a value of one and the lenth of the output array is the same as length of the input array
        prefix =1
        for i in range (len(nums)):
            output[i] = prefix
            prefix *= nums[i]
        postfix =1
        for i in range(len(nums)-1,-1,-1):
            output[i] *= postfix
            postfix *= nums[i]
            
        return output
