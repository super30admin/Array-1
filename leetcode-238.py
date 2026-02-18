'''
238. Product of Array Except Self
https://leetcode.com/problems/product-of-array-except-self/description/

Time Complexity: O(n)
Space Complexity: O(n)


'''

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        if len(nums) == 2:
            return nums[::-1]
        
        left, right = [1]*len(nums), [1]*len(nums)
        
        for i in range(1, len(nums)):
            left[i] = left[i-1] * nums[i-1]

        
        tmp = 1
        for j in range(len(nums)-2,-1,-1):
            right[j] = right[j+1] * nums[j+1]


        res = []
        for i in range(len(nums)):
            res.append(left[i] * right[i])
        
        return res
