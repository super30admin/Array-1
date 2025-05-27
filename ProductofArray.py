# Time Complexity: O(n)
# Spcae Complexity: O(n)
class Solution:
    def productExceptSelf(self, nums) -> List[int]:
        n = len(nums)
        result = [0] * n
        result[0]=1
        for i in range(1, n):
            result[i] = nums[i-1] * result[i-1]
        rp=1
        for i in reversed(range(n)):
            result[i] = result[i] * rp
            rp *= nums[i]
        return result
