class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if len(nums)==2:
            return nums[::-1]
        
        rp = 1
        temp = 1
        result = [1 for i in range(len(nums))]
        print(result)
        
        #right pass
        for i in range(len(nums)):
            rp = rp * temp
            result[i]=rp 
            temp = nums[i]
         #   print(result)
        
        #left pass
        rp = 1
        temp = 1
        for i in reversed(range(len(nums))):
            rp = rp * temp
            result[i]=result[i]*rp 
            temp = nums[i]
      #      print(result)
        
        return result