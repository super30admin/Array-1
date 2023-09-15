# Time Complexity: O(n) where n is the length of nums
# Space Complexity: O(1)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [1 for _ in range(len(nums))]
        running_product = 1
        for i in range(1, len(nums)):
            running_product = running_product * nums[i-1]
            result[i] = running_product


        running_product = 1
        for i in range(len(nums) -2, -1, -1):
            running_product = running_product * nums[i+1]
            result[i] = result[i] * running_product

        return result