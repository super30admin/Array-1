# Time Complexity: O(n)

# Space Complexity: O(n)

# I maintain two arrays to calculate the running left and right products, and finally multiply them for getting the result

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [None for i in range(n)]
        if nums is None or n == 0:
            return result
        left_product = [1 for i in range(n)]
        right_product = [1 for i in range(n)]
        
        
        for i in range(1, n):
            left_product[i] = left_product[i-1] * nums[i-1]
            right_product[n-i-1] = right_product[n-i] * nums[n-i]
            
        for i in range(n):
            right_product[i] *= left_product[i]
        
        return right_product

# Time Complexity: O(n)

# Space Complexity: O(1) ~ Because input/ouput does not count towards Space Complexity

# Instead of maintaining the right product array, I just take a variable and multiply the running right product to the left product for the result

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [None for i in range(n)]
        if nums is None or n == 0:
            return result
        result = [1 for i in range(n)]
        right_product = 1
        
        for i in range(1, n):
            result[i] = result[i-1] * nums[i-1]
            
        for i in range(1, n):
            right_product *= nums[n-i]
            result[n-i-1] *= right_product
        
        return result
            