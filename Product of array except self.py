class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)

        result = [1] * n
    
        left_product = 1
        for i in range(1, n):
            left_product *= nums[i - 1]
            result[i] *= left_product
        
        right_product = 1
        for i in range(n-2, -1, -1):
            right_product *= nums[i + 1]
            result[i] *= right_product

        return result

# Time complexity: O(N)
# Space complexity:  O(1)
