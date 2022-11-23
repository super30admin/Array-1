class Solution:
    """
    Time complexity - O(n). n-size of nums
    Space complexity - O(n)
    """
    def productExceptSelf(self, nums: list[int]) -> List[int]:
        result = [1 for x in range(0, len(nums))]
        left_product = 1
        result[0] = 1
        for index in range(0, len(nums)):
            result[index] = left_product
            left_product *= nums[index]
        right_product = 1
        for index in reversed(range(len(nums))):
            result[index] = result[index] * right_product
            right_product *= nums[index]
        return result
        