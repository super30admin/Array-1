# Time O(n)
# Space O(n)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        postfix = [0]*n
        postfix[-1]=1
        pre = 1
        for i in range(n-2, -1, -1):
            postfix[i] = postfix[i+1]*nums[i+1]
        for i in range(1,n):
            pre = nums[i-1]*pre
            postfix[i]*=pre

        return postfix
