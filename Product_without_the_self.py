# Time Complexity: O(n)
# Space Complexity: O(n)
# Does this code run on Leetcode: Yes
# Did you face any difficulty while coding this: No

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        ans = [1] * len(nums)
        res = 1
#prefix
        for i in range(1,  len(nums)):
            res = res * nums[i-1]
            ans[i] = res
#postfix
        res = 1
        for i in range(len(nums)-2, -1, -1):
            res = res * nums[i+1]
            ans[i] = ans[i] * res
        return(ans)