# Time Complexity: O(n)
# Space Complexity:O(1)
# Passed LeetCode

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        answer = [0] * n
        answer[0] = 1

        rp = 1
        for i in range(1, n):
            rp = rp * nums[i - 1]
            answer[i] = rp
        rp = 1
        for j in range(n - 2, -1, -1):
            rp = rp * nums[j + 1]
            answer[j] = answer[j] * rp

        return answer

