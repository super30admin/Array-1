# Time Complexity: O(n) where n is the length of nums
# Space Complexity: O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # left_result = [1 for _ in range(len(nums))]
        # running_product = 1
        # for i in range(1, len(nums)):
        #     running_product = running_product * nums[i-1]
        #     left_result[i] = running_product
            

        # right_result = [1 for _ in range(len(nums))]
        # running_product = 1
        # for i in range(len(nums) -2, -1, -1):
        #     running_product = running_product * nums[i+1]
        #     right_result[i] = running_product
        
        # for i in range(len(left_result)):
        #     left_result[i] = left_result[i] * right_result[i]
        # return left_result

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
