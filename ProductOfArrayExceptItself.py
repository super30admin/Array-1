class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        lp = 1
        rp = 1
        result = []

        for i in range(0,len(nums)):
            if i != 0:
                result.append(nums[i-1] * lp)
                lp = result[i]
            else:
                result = [nums[0]]

            
        i = len(nums)-2
 
        
        while(i >= 0):
            rp = nums[i+1] * rp
            result[i] = rp * result[i]
            i -= 1
    
        return result
