# ## Problem 1

# Given an array nums of n integers where n > 1, return an array output such that
# output[i] is equal to the product of all the
# elements of nums except nums[i].

# Example:

# Input: [1,2,3,4]
# Output: [24,12,8,6]
# Note: Please solve it without division and in O(n).

# Follow up:
# Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of
#                                                     space complexity analysis.)

# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Three line explanation of solution in plain english

# // Your code here along with comments explaining your approach

class Solution:
    def productExceptSelf(self, nums):
        # creating result array with size of nums
        result = [0] * len(nums)
        # running product variable
        rp = 1
        # making result's 0th element 1
        result[0] = 1
        # finding left product starting from 1
        for i in range(1, len(nums)):
            # multiplying with the left element
            rp *= nums[i - 1]
            # adding the prodcuts to result array
            result[i] = rp
        # finding right product and final product
        rp = 1
        # starting from end - 1 to 0th element
        for i in range(len(nums) - 2, -1, -1):
            # multiplying with the right element
            rp *= nums[i + 1]
            # adding the prodcuts to result array
            result[i] = rp * result[i]
        return result


sol = Solution()
nums = [1, 2, 3, 4]
print(sol.productExceptSelf(nums))
