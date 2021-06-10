# Time Complexity: O(n)
# Space Complexity: O(1)
# ran on leetcode : yes
class Solution(object):
    def productExceptSelf(self, nums):
        product_arr = [0] * len(nums)
        # product tracks the running product
        product = 1
        # first value as 1
        product_arr[0] = 1
        # left pass multiplication
        for i in range(1, len(nums)):
            # product * previous number
            product = nums[i - 1] * product
            product_arr[i] = product

        # reset for right pass
        product = 1
        # start from left
        for i in range(len(nums) - 2, -1, -1):
            product = product * nums[i + 1]
            product_arr[i] = product_arr[i] * product

        return product_arr