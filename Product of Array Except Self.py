
# Time Complexity :O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode :Yes
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        pdt=[0]*len(nums)
        pdt[0]=1
        
        for i in range(1,len(nums)):
            pdt[i]=pdt[i-1]*nums[i-1]
        
        r=1
        for i in reversed(range(len(nums))):
            pdt[i]=r*pdt[i]
            r=r*nums[i]                   
        
        return pdt
            