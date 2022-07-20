# Time Complexity: O(n) where n is the length of nums.
# Space Complexity: O(1)
# You are expected to return an array. ANd we are using only one array. Thats why space complexity is constant

class Solution:
    def productExceptSelf(nums):
        if nums is None or len(nums) == 0:
            return []

        running_product = 1
        result = [1]
        for i in range(1, len(nums)):
            running_product = running_product * nums[i -1]
            result.append(running_product)
        
        running_product = 1
        for i in range(len(nums) - 2, -1, -1):
            running_product = running_product * nums[i + 1]
            result[i] = running_product * result[i]
        
        return result