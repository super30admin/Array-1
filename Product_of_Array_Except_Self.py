class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        N = len(nums)
        result = []
        prod_left = 1
        
        # Populate left array with product of left in first pass
        for num in nums:
            result.append(prod_left) 
            prod_left *= num
        
        prod_right = 1
        
        # Multiply with product of right during backward pass
        for i in reversed(range(N)):
            result[i] *= prod_right
            prod_right *= nums[i]
        
        return result

### Complexity Analysis

# Time Complexity: O(N) --> Two pass through the array
# Space Complexity: O(1) --> No extra space used