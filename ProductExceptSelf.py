# TC : O(n) ; n = length of nums
# SC : O(1)
# Approach : First we go from left to right, storing running sum at every index. We again set the rp and temp to 1. 
# Now we again iterate through the list right to left multiplying running sum to nums[i]. We return the result array.  
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if not nums or len(nums) == 0:
            return []
        temp = 1 ; rp = 1
        result = []
        for i in range(len(nums)):
            rp = rp * temp
            result.append(rp)
            temp = nums[i]
        
        temp = 1 ; rp = 1
        
        for i in range(len(nums)-1, -1, -1):
            rp = rp * temp
            result[i] = result[i] * rp
            temp = nums[i]
        
        return result