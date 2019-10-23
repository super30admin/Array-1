
#Time complexity -O(N)
#Space complexity -O(1)
#Passed all test cases
#Approach -First we need to do forward pass and then later backward pass. For calculating forward pass we need to keep track of running product and temp variables and should update in  resultant array. In backward pass we need to start from the end onwards and here we should multiply running product with previous resultant array. starting temp and run_product variables are intialized as 1.



class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        m=len(nums)
        result=[0]*m
        #edge case
        
        if (nums==[] or len(nums)==0):
            return result
        
        
        run_prod=1
        temp=1
        
        #forward pass
        for i in range(m):
            run_prod=temp*run_prod
            result[i]=run_prod
            temp=nums[i]
            
        #backward pass
        run_prod=1
        temp=1
        for i in range((len(nums)-1),-1,-1):
            run_prod=temp*run_prod
            result[i]=run_prod*result[i]
            temp=nums[i]
            
        return result