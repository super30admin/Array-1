class Solution:#time O(n) space O(1)
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        l=len(nums)
        a=[0]*l
        a[0]=1
        for i in range(1,l):
            a[i]=nums[i-1]*a[i-1]
        r=1
        for i in reversed(range(l)):
            a[i]*=r
            r*=nums[i]
        return a
