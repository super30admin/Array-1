class Solution:
    # Idea: 
    # 1. First Calculate the left product by maintaining the array in which ith element denotes the product of elements till i-1
    # 2. Similarly calculate the right product. To save space, directly update the left product array of step1.
    # Time Complexity: O(n)
    # Space Complexity: O(1) excluding the space that output array takes
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        product = [1 for i in range(len(nums))]
        for i in range(1,len(nums)):
            product[i] = product[i-1]*nums[i-1]
        right_product = 1
        for i in range(len(nums)-1,-1,-1):
            product[i] = product[i]* right_product
            right_product = right_product*nums[i]
        return product
