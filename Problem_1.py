"""
handledproduct in array but maintaing a running product
TC - O(n)
SC - O(1)
"""
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums is None or not nums;
            return []
        ans = [None for _ in range(len(nums))]
        rp = 1
        ans[0] = 1
        for i in range(1,len(nums)):
            rp = rp * nums[i-1]
            ans[i] = rp
        rp = 1
        for j in range(len(nums)-2,-1,-1):
            rp *= nums[i+1]
            ans[i] *= rp
        return ans