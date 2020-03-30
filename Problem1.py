# Time Complexity - O(n)
#Space Complexity - O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        n=len(nums)
        mul=1
        res=[1]*(n)
        left=[1]*(n)
        print(left)
        right=[1]*(n)
        print(right)
        
        
        """Solution with Division : Division Exception
        for i in range(n):
            mul=mul*nums[i]
        
        for i in range(n):
            k=mul//nums[i]
            res.append(k)
        
        return res"""
        
        for i in range(1,n):
            left[i]=left[i-1]*nums[i-1]
            
        print(left)
        
        for i in range(n-2,-1,-1):
            right[i]=right[i+1]*nums[i+1]
        
        print(right)
        
        for i in range(n):
            res[i]=left[i]*right[i]
        
        return(res)
        