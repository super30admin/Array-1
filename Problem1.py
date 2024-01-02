'''

Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No issues faced

Your code here along with comments explaining your approach

Calculate and maintain an array for prefix and suffix product

'''

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        fprod = [1]
        bprod = [1]
        rev = nums[::-1]
        res = []

        n = len(nums)

        for i in range(1,n):
            var = fprod[i-1] * nums[i-1]
            fprod.append(var)

        for i in range(1,n):
            var = bprod[i-1] * rev[i-1]
            bprod.append(var)

        bprod = bprod[::-1]

        for i in range(0,n):
            res.append(fprod[i] * bprod[i])

        return res