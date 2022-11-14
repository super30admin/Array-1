#TC: O(n)
#SC: O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n=len(nums)
        pes=[0]*n
        pes[-1]=nums[-1]
        for i in range(n-2,-1,-1):
            pes[i]=nums[i]*pes[i+1]
        rp=1
        for i in range(n):
            cur_prod=1
            if(i+1<n): cur_prod*=pes[i+1]
            cur_prod*=rp
            pes[i]=cur_prod
            rp*=nums[i]
        return pes