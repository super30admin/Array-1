# // Time Complexity :O(n)
# // Space Complexity :(1)
# // Did this code successfully run on Leetcode :yes

class Solution:
    def productExceptSelf(self,nums):
        n=len(nums)
        res=[1]*n

        prefixval=1
#prefix 
        for i in range(n):
            res[i]=prefixval
            prefixval=prefixval*nums[i]
#suffix , traverse from reverse
        suffixval=1
        for i in range(n-1,-1,-1):
            #we dont want to overwrite the curr value at index of result so multiply by suffix
            res[i]=res[i]*suffixval
            suffixval=suffixval*nums[i]
        return res