// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :My runtime in leetcode shows better that 5% of python submissions for most of the solutions i submit, should i be worried about that?


// Your code here along with comments explaining your approach
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        out=[1]
        mul=1
        for i in range(1,len(nums)):
            mul*=nums[i-1]
            out.append(mul)
        mul=1
        for i in range(len(nums)-2,-1,-1):
            mul*=nums[i+1]
            x=mul*out[i]
            out[i]=x
        return out
            
