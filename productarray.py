class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
#         O(n)===Tc
# O(1)
        product=[]
        s=len(nums)
        # print(product)
        for i in range(s):
            product.append(1)
        # print(product)
        
        for i in range(1,len(nums)):
            product[i]=product[i-1]*nums[i-1]
        # print(product)
        
        i=len(nums)-1
        right=1
        for i in range(i,-1,-1):
            product[i]=product[i]*right
            right=right*nums[i]
        
        # print(product)
        # print(right)
        return(product)