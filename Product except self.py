class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [1 for _ in nums]
        leftProduct, rightProduct = 1, 1
        for i in range(1, len(nums)):
            result[i] = nums[i - 1] * leftProduct
            leftProduct = result[i]

        for i in range(len(nums) - 2, -1, -1):
            rightProduct = nums[i + 1] * rightProduct
            result[i] = result[i] * rightProduct

        return result