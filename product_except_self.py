// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach: Make use of output array to store the product of left elements
// and also utilize the same array to store product of elements to the right.

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        
        res=[1 for i in range(len(nums))]
        
        i=1
        
        while(i<len(nums)):
            
            res[i]=res[i-1]*nums[i-1]
            i+=1
        
        i=len(nums)-1
        r=1
        while(i>=0):
            res[i]*=r
            
            r=r*nums[i]
            i-=1
        
        return(res)
            
    
        