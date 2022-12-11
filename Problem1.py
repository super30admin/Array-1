T.C : O(n)
S.C : O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if not nums:
            return nums
        result = [1]*len(nums)
        l = 1
        for i in range(len(nums)):
            result[i] = l
            l *= nums[i]
        r = 1
        for i in range(len(nums)-1,-1,-1):
            result[i] *= r
            r *= nums[i]
        return result
