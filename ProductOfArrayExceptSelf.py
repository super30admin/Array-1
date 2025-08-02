# Problem 1: Product of Array Except Self https://leetcode.com/problems/product-of-array-except-self/

# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Explanation:
    # - We can solve this problem by calculating the product of all elements to the left and right of each element.
    # - We maintain two arrays: one for the left products and one for the right products.
    # - Finally, we multiply the corresponding elements of these two arrays to get the result.    

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums == None or len(nums) ==0:
            return []

        n = len(nums)
        rp = 1 # running prod
        result = [1 for i in range(n)] 

        # Calculate left products
        for i in range(1, n):
            rp = rp*nums[i-1]
            result[i] = rp* result[i]
            print(result)

        # Calculate right products and multiply with left products directly in result
        rp = 1
        for i in range(n-2, -1, -1):
            rp = rp*nums[i+1]
            result[i] = result[i]*rp

        return result