# Time complexity: O(n)
# Space complexity: O(1) since we are not considering the output as an extra space as it is auxiliary space.
# Did it run on leetcode: Yes

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums)
        lp = 1 # left running product
        for i in range(1, len(nums)):
            lp = lp * nums[i - 1]
            res[i] = lp

        rp = 1 # right running product

        for i in range(len(nums) - 2, -1, -1):
            rp = rp * nums[i + 1]
            res[i] *= rp

        return res