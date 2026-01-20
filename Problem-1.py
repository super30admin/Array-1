# Product Except Self
# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no


# Your code here along with comments explaining your approach
#In the result array maintain the left product of each element and iterate backewards to multiple the left product with right product
#time - O(n)
#space - O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res=[0]*len(nums)
        i=0
        res[i]=1
        lp=1
        for i in range(1,len(nums)): #iterate for left product
            lp=lp*nums[i-1]
            res[i]=lp
        
        rp=1
        for j in range(len(nums)-2,-1,-1):#iterate for left product
            rp=rp*nums[j+1]
            res[j]=rp*res[j]
        return res
