# O(N) TIME AND O(1) SPACE WHERE N IS LEN(NUMS)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        products = [1 for num in nums]
        current_product = 1
        for i in range(len(nums)):
            products[i] *= current_product
            current_product *= nums[i]
        current_product = 1
        for i in reversed(range(len(nums))):
            products[i] *= current_product
            current_product *= nums[i]
        return products