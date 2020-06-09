# Time Complexity : O(n), where n is the length of nums
# Space Complexity : O(1), because there is no extra computational DS.
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

# Your code here along with comments explaining your approach
class Solution(object):
    # compute a product of all numbers to the left for every number, on the same
    # array compute a product of all numbers to the right for every number and multiply
    # it with the left product, this will result in a product of all numbers except self.
    def productExceptSelf(self, nums):
        leftP = []
        p = 1
        for i in range(len(nums)):
            leftP.append(p)
            p *= nums[i]

        p = 1
        for i in range(len(nums) - 1, -1, -1):
            leftP[i] *= p
            p *= nums[i]
        return leftP


print(Solution().productExceptSelf([1,2,3,4]))
