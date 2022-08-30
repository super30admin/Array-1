# # Array-1

# ## Problem 1

# Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

# Example:

# Input: [1,2,3,4]
# Output: [24,12,8,6]
# Note: Please solve it without division and in O(n).

# Follow up:
# Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

#Solution 1 -> 

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        res = [0 for i in range(n)]
        if nums == None or n == 0:
            return result 
        rp = 1
        res[0] = 1
        for i in range(1,n):
            rp = rp * nums[i-1]
            res[i] = rp
        
        rp = 1
        for i in range(n-2,-1,-1):
            rp*=nums[i+1]
            res[i] = res[i]*rp
    
        return res
    
# Time Complexity -> o(n)
# Space Complexity -> o(n)


