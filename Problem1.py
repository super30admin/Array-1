# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [0] * len(nums)

        for i in range(len(nums)):
            if i == 0:
                left_rp = 1
                res[i] = left_rp
            else:
                left_rp = left_rp * nums[i-1]
                res[i] = left_rp
        for i in range(len(nums)-1, -1, -1):
            if i == len(nums)-1:
                right_rp = 1
                res[i] = res[i] * right_rp
            else:
                right_rp = right_rp * nums[i+1]
                res[i] = res[i] * right_rp
        return res