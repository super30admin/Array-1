# // Time Complexity : O(n)
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
# we can store left hand side product and right hand side of product of element in an array.
# we can optimize the space complexity by using single array and storing the product.
# for second iternation we can use tempory variable to store the product.

# // Your code here along with comments explaining your approach


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        retNums = [0] * len(nums)
        retNums[0] = 1
        temp = 1

        for i in range(1, len(nums)):
            retNums[i] = nums[i - 1] * retNums[i - 1]

        for i in range(len(nums) - 2, -1, -1):
            temp = temp * nums[i + 1]
            retNums[i] = temp * retNums[i]

        return retNums

