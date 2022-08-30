# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english



# // Your code here along with comments explaining your approach


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        if len(nums)==0 or nums==None:
            return []
        
        #Putting the all elemnt as one 
        res=[1]*len(nums)
        
        prefix=1
        #going from left to right and multliplying by prefix to result
        for i in range(len(nums)):
            res[i]=prefix
            prefix*=nums[i]
        
        postfix=1
        #going from right to left and making sure the 
        for i in range(len(nums)-1,-1,-1):
            res[i]*=postfix
            postfix*=nums[i]
        
        return res