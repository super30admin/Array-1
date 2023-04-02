TC: O(n)
SC: O(1)
Ran on Leetcode: Yes

"""
Take a running product rp = 1. first multiply all the elements from left starting first element as 1 as there is no element to left from first element. store it in array.
go through each element starting from last one and multiple it with right element and also multiply it with existing list. 

"""



class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        rp = 1
        res = []
        for i in range(len(nums)):
            res.append(rp)
            
            rp = rp * nums[i]
        print(res)
        rp = 1
        for i in range(len(nums)-1,-1,-1):
            res[i] *= rp
    
            rp = rp * nums[i]

        return res
