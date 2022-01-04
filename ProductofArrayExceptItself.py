class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        rp=1
        rparray=[1]
        for a in range(1,len(nums)):
            rp = rp * nums[a-1]
            rparray.append(rp)

        rp = 1
        for b in range(len(nums)-2,-1,-1):
            rp = rp * nums[b+1]

          
            rparray[b] = rparray[b]*rp


        return rparray    
                
        
        