class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        leftarr= [0]*len(nums)
        lproduct = 1
        rproduct = 1
        for i in range(len(nums)):
            if i>=1:
                lproduct *= nums[i-1]
            leftarr[i]=lproduct
        for i in range(len(nums)-1, -1,-1):
            if i<=len(nums)-2:
                rproduct *= nums[i+1]
            leftarr[i]*=rproduct
        return leftarr
    
"""Time complexity : O(n)
Space complexity :O(1) as the array utilized for the calculations is returned as output
and its not considered as auxilary space"""

        # arr = []
        # for i in range(len(nums)):
        #     product = 1
        #     for j in range(len(nums)):
        #         if i!=j:
        #             product *=nums[j]
        #     arr.append(product)
        # return arr
        
        # leftarr= [0]*len(nums)
        # rightarr=[0]*len(nums)
        # lproduct = 1
        # rproduct = 1
        # for i in range(len(nums)):
        #     if i>=1:
        #         lproduct *= nums[i-1]
        #     leftarr[i]=lproduct
        # for i in range(len(nums)-1, -1,-1):
        #     if i<=len(nums)-2:
        #         rproduct *= nums[i+1]
        #     rightarr[i]=rproduct
        # for i in range(len(nums)):
        #     rightarr[i]*=leftarr[i]
        # return rightarr
        
        
                
            
                
        