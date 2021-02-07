# // Time Complexity :O(n) With two passes
# // Space Complexity :)(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
# use running product
# first pass: from left to right write product till current element
# second pass: from right to left multiply with the new running product


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if len(nums)==0 or nums == None: return []
        
        res = [] 
        rp = 1
        temp = 1
        
        #forward pass
        for i in range(len(nums)):
            res.append(rp)
            rp = rp*nums[i]
        #backward pass
        rp = 1
        for i in range(len(nums)-1, 0, -1):
            res[i] = res[i]*rp
            rp = rp * nums[i]
        res[0] = rp
        return res