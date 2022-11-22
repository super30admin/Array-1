#time complexity: O(n)
#space complexity: O(1)
#ran on leetcode: yes
#Calculate the running product from right. Similarly calculate running product 
#from left. Using these 2, a product of an element except self can be found out.
#First, calculate the product from left to right and stroe it in an array/list.
#use this same array but this time calculte running product from right to left
#and instead of storing the product in teh respecitve position, muliply it
# witht he value present in that position.
class Solution:
    def productExceptSelf(self, nums):
        zero_flag=False
        prd=1
        L=[]
        #L2=[]
        for i in nums:
            prd=prd*i
            L.append(prd)
        prd=1
        print(L)
        for i in range(len(nums)-1,-1,-1):
            if(i==len(nums)-1):
                L[i]=L[i-1]*prd
                prd=prd*nums[i]
                continue
            if(i==0):
                L[i]=prd
                continue
            L[i]=L[i-1]*prd    
            prd=prd*nums[i]
        return L
s=Solution()
nums=[-1,1,0,-3,3]
print(s.productExceptSelf(nums))