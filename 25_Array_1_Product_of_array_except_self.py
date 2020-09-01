#Time Complexity : O(n) where n is the length of number array  
#Space Complexity : O(n) though three different arrays we created
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No 

#Your code here along with comments explaining your approach

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        L, R, ans=[0]*len(nums),[0]*len(nums), [0]*len(nums)
        
        L[0]=1
        for i in range(1,len(L)):
            L[i]=L[i-1]*nums[i-1]
        
        R[len(R)-1]=1
        for i in range(len(R)-2,-1,-1): 
            R[i]=R[i+1]*nums[i+1]
        
        for i in range(len(nums)): 
            ans[i]=L[i]*R[i]
        
        return ans
            