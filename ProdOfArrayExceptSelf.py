class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        '''// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

We are creating a resultant array and storing all the left products by iterating through the array once. After that in we are iterating again in order to calulate the right product and update the existing result array.

// Your code here along with comments explaining your approach'''
        if len(nums)==0:
            return 0
        
        if len(nums)==1:
            return 0
        
        prod=[None for i in range(len(nums))]
        
        
        #Left prod
        for i in range(len(nums)):
            if i==0:
                prod[i]=1
            else:
                prod[i]=nums[i-1]*prod[i-1]
        
        rp=1
        #Right prod*left prod
        for i in range(len(nums)-2,-1,-1):
            rp*=nums[i+1]
            prod[i]=prod[i]*rp
                
        return prod
        
