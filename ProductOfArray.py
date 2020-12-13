# Approach1: Using two L and R arrays. We will them using this logic
# result[i] = L[i] * R[i]

# Approach 2: A modification above approach that will take only O(1) space complexity
# We wont build R array but instead use running product directly and mulitply with L[i]

# Time complexity: O(n), n = length of the given array
# Space complexity: O(1)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        if nums == None or len(nums) == 0:
            return []
        
        temp = 1
        rp = 1
        
        result = [0] * len(nums)
        
        # Left array
        for i in range(len(nums)):
            rp = rp * temp
            result[i] = rp
            temp = nums[i]
            
        # result = [1,1,2,6]
        temp = 1
        rp = 1
        
        for i in range(len(nums)-1, -1, -1):
            rp = rp * temp
            
            # result[3] =  result[3] * 1
            # result[2] =  result[2] * 4
            # result[1] =  result[1] * 12
            # result[0] =  result[0] * 24
            result[i] = result[i] * rp
            temp = nums[i]
            
        return result