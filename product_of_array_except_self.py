class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums is None or len(nums)==0:
            return 0
        rp=1
        l=[0]*len(nums)
        l[0]=rp
        for i in range(1,len(nums)):
            l[i]=rp*nums[i-1]
            rp=l[i]
        rp=1
        for i in range(len(nums)-2,-1,-1):  
            rp=rp*nums[i+1]
            l[i]=l[i]*rp
        return l
            
        