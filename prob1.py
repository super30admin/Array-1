# Product of Array Except Self: https://leetcode.com/problems/product-of-array-except-self/
# Time complexity: O(n)
# Space complexity: O(1)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1]
        total = len(nums)-1
        # Creating the prefix product and storing it in res
        for i in range(1,len(nums)):
            res.append(nums[i-1]*res[i-1])
        # Creating suffix product and multiplying it with the prefix product
        prev= nums[total]
        for i in range(total-1,-1,-1):
            res[i] *=prev
            prev *= nums[i]
        return res