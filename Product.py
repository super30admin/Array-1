# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode :
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach
'''Store left running products till i in left array at i. 
Store right running products till i in right array at i.
Multiply the two running products at i to get result of i.'''

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        left = [1] * len(nums)
        right = [1] * len(nums)
        for i in range(1, len(nums)):
            left[i] = nums[i - 1] * left[i - 1]
        
        for i in range(len(nums) - 2, -1, -1):
            right[i] = nums[i + 1] * right[i + 1]
        
        result = [0] * len(nums)
        
        for i in range(len(nums)):
            result[i] = left[i] * right[i]
        
        return result

# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach
'''Use the left array to build result by using a variable right.'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        left = [1] * len(nums)
        for i in range(1, len(nums)):
            left[i] = nums[i - 1] * left[i - 1]
        
        right = 1
        for i in range(len(nums) - 2, -1, -1):
            right *= nums[i + 1]
            left[i] = left[i] * right
        
        return left