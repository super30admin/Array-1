"""
Time Complexity: O(n)
Space Complexity : O(1)
Did your code run on leetcode?: Yes
Issues faced: Coming up with the equation for op[i] in both the for loops

"""
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        op = [1] * len(nums)
        leftproduct = 1
        rightproduct = 1
        for i in range(len(nums)):
            op[i]*= leftproduct
            leftproduct *= nums[i]
        for i in reversed(range(len(nums))):

            op[i]*= rightproduct
            rightproduct*= nums[i]
        return op
