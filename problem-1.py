# Leetcode: YES 
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        mul=1
        result=[]
        # get product of all the elements toward left to the element to the current element index using running sum(mul)
        for x in nums:
            result.append(mul)
            mul=mul*x
        mul=1
        # get product of all the elemnets towards right to the current element and mul with curr index and replace curr index
        for i in range(len(nums)-1, -1, -1):
            result[i]*=mul
            mul*=nums[i]
        return result