# Time Complexity : O(n)
# Space Complexity: O(1)
# Works on leetcode: yes 
# Approach: Here for each element, we need to get the product of everything left and everything right of the element
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        p = 1
        res = []
        for i in range(len(nums)):
            res.append(p)
            p*=nums[i]
        p=1
        for i in range(len(nums)-1,-1,-1):
            res[i]*=p
            p*=nums[i]
        return res