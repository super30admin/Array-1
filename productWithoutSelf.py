# // Time Complexity : O(N)
# // Space Complexity : O(2*N)
# // Did this code successfully run on Leetcode : yes
# // Three line explanation of solution in plain english

# Create 2 arrays, one that keeps track of product of all elements to left of self, 
# one another that keeps track of product of all elements to right of self, 
# then multiply those two arrays to get final result.

# // Your code here along with comments explaining your approach
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        # Left and right array
        left = [1] * len(nums)
        right = [1] * len(nums)
        
        # Element right to rightmost is 1 and element left to leftmost is 1
        right[-1] = 1
        left[0] = 1

        # Create right array such that all elements to left of self are in left[self]

        for i in range(1, len(nums)):
            left[i] = left[i-1] * nums[i-1]
            
        # Create right array such that all elements to right of self are in right[self]
        for i in reversed(range(len(nums) - 1)):
            right[i] = right[i+1] * nums[i+1]

        # Initialize result array
        result = [1] * len(nums)
        
        # Create result array
        for i in range(len(nums)):
            result[i] = left[i] * right[i]
            
        return result
            
        