from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n=len(nums)
        if n==1:
            return product_arr
        product_arr=[0]*n
        product=1
        product_arr[0]=1
        #left pass
        for i in range(1,n): #start with 1st index, index 0 handled already, with nothing at left
            product=product*nums[i-1] #product at curr index=already existing product*prev num
            product_arr[i]=product

        #print(product_arr)
        product=1 #start again for right pass
        for i in range(n-2,-1,-1):
            product=product*nums[i+1]#from right, product at curr index=already existing product*prev num
            product_arr[i]=product_arr[i]*product #product_arr[i] ->product at index from prev left pass*current right product
        return product_arr


s=Solution()
print(s.productExceptSelf([1,2,3,4]))


