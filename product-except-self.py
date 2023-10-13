# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : YES


# Three line explanation of solution in plain english
# The solution calculates the prefix and suffix products of each element in the input list 'nums'. 
# It then uses these prefix and suffix products to compute the product of all elements except self for each element in 'nums'. 
# The final product list is returned as the result. 


# Your code here along with comments explaining your approach
class Solution(object):
    def get_prefix_nums(self, nums):
        product = 1
        result = []
        for i in range(0, len(nums)):
            result.append(product)
            product *= nums[i]
        return result

    def get_suffix_nums(self, nums):
        product = 1
        result = []
        for i in range(len(nums) - 1, -1, -1):
            result.append(product)
            product *= nums[i]
        return result[::-1]

    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        prefix_nums = self.get_prefix_nums(nums)
        suffix_nums = self.get_suffix_nums(nums)

        result_nums = []

        for i in range(0, len(nums)):
            result_nums.append(
                prefix_nums[i] * suffix_nums[i]
            )

        return result_nums
