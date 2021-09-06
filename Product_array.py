#Product_array
# time complexity: O(N)
# space complexity: O(N)
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NA
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        l = [0] * len(nums)
        r = [0] * len(nums)
        l[0] = 1
        r[len(nums)-1] = 1
        for i in range(1, len(nums)):
            l[i] = l[i-1] * nums[i-1]
        
        for i in range(len(nums)-2,-1,-1):
            r[i] = r[i+1] * nums[i+1]
        
        for i in range(0, len(nums)):
            l[i] = l[i] * r[i]
        
        return l
        