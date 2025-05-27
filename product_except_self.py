"""
TC -> O(2N) ->O(N)
SC -> O(N) -> result. No aux space is used. So SC -> O(1)

Logic
Compute prefix product in first pass and store in prefix array
In the second pass, start from the end. Set a variable postfix as 1 because element at end doesnt have any right side elements
On traversing from right to left, prefix[i]*postfix. Update postfix variable 
"""
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefix = [1] * len(nums)
        postfix = 1

        for i in range(1, len(nums)):
            prefix[i] = prefix[i - 1] * nums[i - 1]

        for i in range(len(nums) - 1, -1, -1):
            prefix[i] = prefix[i] * postfix
            postfix *= nums[i]
        return prefix