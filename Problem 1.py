class Solution:
    def productExceptSelf(self, nums):
        left_product = 1
        right_product = 1
        product = []

        for i in range(len(nums)):
            product.append(left_product)
            left_product *= nums[i]

        for i in range(len(nums) - 1, -1, -1):
            product[i] *= right_product
            right_product *= nums[i]
        return product

# TC:O(n)
# SC:O(1) apart from the output array


