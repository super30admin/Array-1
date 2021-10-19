#Time complexity O(n) and space complexity O(1)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        l=len(nums)
        # creating product array with same size as nums
        p=[0]*l
        p[0]=1
        #Traversing from left and finding product 
        for i in range(1,l):
            p[i]=p[i-1]*nums[i-1]
        # Creating right pointer and traversing from right 
        r=1 
        for i in range(l-1,-1,-1):
            # p array carries the product
            p[i]=p[i]*r
            # incrementing right pointer by multiply it with right elements
            r=r*nums[i]
            
        return p
