class Solution:
    
    def productExceptSelf(self,nums):
        n=len(nums)
        answer=[1]*n

        left_product=1
        for i in range(n):
            answer[i]=left_product
            left_product*=nums[i]
    
        right_product=1
        for i in range(n-1,-1,-1):
            answer[i]*=right_product
            right_product*=nums[i]
    
        return answer

sol=Solution()
print(sol.productExceptSelf([1,2,3,4]))
print(sol.productExceptSelf([-1,1,0,-3,3]))