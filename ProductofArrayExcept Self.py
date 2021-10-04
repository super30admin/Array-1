'''
Time Complexity: O(n)
Space Complexity: O(2n) comes down to O(n)

Approach: Create two arrays prefix and PostFix and return the res that would have prod of pre and post
'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res=[]
        prefix=[]
        postfix=[]
        prod=1
        #Prefix
        for i in nums:
            prod*=i
            prefix.append(prod)
        prod=1
        #Postfix
        for i in range(len(nums)-1,-1,-1):
            prod*=nums[i]
            postfix.append(prod)
        postfix=postfix[::-1]
        #return res
        for i in range(len(nums)):
            if i==0:
                res.append(1*postfix[i+1])
            elif i==len(nums)-1:
                res.append(prefix[i-1]*1)
            else:
                res.append(prefix[i-1]*postfix[i+1])
        return res