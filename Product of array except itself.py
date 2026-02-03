class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n=len(nums)
        
        result=[0 for i in range(n)]
        result[0]=1
        rp=1
        for i in range(1,n):
            rp=rp*nums[i-1]
            result[i]=rp
        print(result)
        rp=1
        for i in range(n-2,-1,-1):
            rp=rp*nums[i+1]
            result[i]=rp*result[i]
        return result