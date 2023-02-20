# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes



class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        l1 = []
        l2 = []
        preprod = 1
        for i in range(len(nums)):
            if i==0:
                l1.append(preprod)
            else:
                preprod = preprod*nums[i-1]
                l1.append(preprod)
        preprod = 1
        for i in range(len(nums)-1,-1,-1):
            if i==len(nums)-1:
                l1[i] = preprod*l1[i]
            else:
                 preprod = preprod*nums[i+1]
                 l1[i] = preprod*(l1[i])
        return l1