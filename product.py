class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        #calculate left and right product arrays, finally multiple these two arrays to get the answer,
        #further you can optimise this by calculating both in single array
        
        ans = [0]*(len(nums))
        rp = 1
        
        #Calculating left rp
        
        ans[0] = 1
        
        for i in range(1, len(nums)):
            rp = rp * nums[i-1]
            ans[i] = rp
                
        rp = 1
                
        #Calculating right rp
        
        ans[len(nums) - 1] = ans[i]*rp
        
        for i in range(len(nums)-2, -1,-1):
            rp = rp*nums[i+1]
            ans[i] = ans[i]*(rp)
                
        return ans
        






        
