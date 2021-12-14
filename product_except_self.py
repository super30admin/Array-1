#time complexity: O(n)
#space complexity: O(1)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums==None or len(nums)==0: return 0
        n=len(nums)
        result=[None]*n
        rp=1
        result[0]=rp
        for i in range(1,n):
            rp=rp*nums[i-1]
            result[i]=rp
            
        rp=1
        for i in range(n-2,-1,-1):
            rp=rp*nums[i+1]
            result[i]=result[i]*rp
            
        return result
        