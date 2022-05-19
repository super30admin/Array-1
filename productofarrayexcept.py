#Time Complexity : O(n) where n -> lenegth of nums
#Space Complexity : O(1) as we are using rp and result is the output so not counted in space complexity
#did your code run on leetcode : yes
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums == [] or len(nums) == 0: return []
        result = [0]*len(nums)
        
        rp = 1
        result[0] = 1
        
        #left pass
        for i in range(1,len(nums)):
            rp = rp * nums[i - 1]
            result[i] = rp

        rp = 1
        #right pass
        for i in reversed(range(0,len(nums)-1)):
            rp = rp * nums[i + 1]
            result[i] = result[i] * rp
        
        return result
            
