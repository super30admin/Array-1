class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if(nums== None or  len(nums)==0):
            return []
        lprod =1
        result=[1]
        for i in range(1,len(nums)):
            lprod *= nums[i-1]
            result.append(lprod)
        rp=1
        for i in range(len(nums)-2,-1,-1):
            rp *= nums[i+1]
            result[i]=result[i]*rp
        return result