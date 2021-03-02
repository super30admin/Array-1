# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
# The brute force approach
        '''ans = [1] * len(nums)
        for i in range (len(nums)):
            res = 1
            for j in range (len(nums)):

                if i ==j:
                    continue
                else:
                    res = res * nums[j]
                    ans[i] = res
        return ans'''
ans1 = [1] * len(nums)
rp = 1
for i in range(1, (len(nums))):
    rp = rp * nums[i - 1]
    ans1[i] = rp
rp = 1
for j in range(((len(nums)) - 2), -1, -1):
    rp = rp * nums[j + 1]
    ans1[j] = rp * ans1[j]

return ans1
