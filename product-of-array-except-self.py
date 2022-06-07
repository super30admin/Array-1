# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n=len(nums)
        res=[0]*n
        res[0]=1
        pre_prod=1
        for i in range(1,n):
            pre_prod*=nums[i-1]
            res[i]=pre_prod
        pre_prod=1
        for i in range(n-2,-1,-1):
            pre_prod*=nums[i+1]
            res[i]=res[i]*pre_prod
        return res   