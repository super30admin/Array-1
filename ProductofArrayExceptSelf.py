# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if(nums==[]):
            return []
        p=1
        result=[1]
        for i in range(1,len(nums)):
            p=p*nums[i-1]
            result.append(p)
        i=len(nums)-2
        p=1
        while(i>=0):
            p=p*nums[i+1]
            result[i]=result[i]*p
            i-=1
        return result