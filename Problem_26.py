# Time Complexity : O(n) where n = len(nums)
# Space Complexity : O(1) or  constant auxiliary space is needed
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        if not nums:
            return
        
        ans = collections.deque(None for _ in range(len(nums)))
        
        ans[0] = 1
        
        left = 1
        for i in range(1,len(nums)):
            left *= nums[i-1]
            ans[i] = left # In first pass we give left running product * nums[i-1] for ans[i]
            # This only considers the left side elements. ans[i-1] has product of all elements left of i except i-1 so we numtiply that with nums[i-1] and assign it to ans
        
        right = 1
        
        for i in range(len(nums)-2,-1,-1):
            # Now from end we come to beginning by multiplying all elements on the right of i to ans[i]
            right *= nums[i+1]
            ans[i] *= right
        
        
        return ans