#  Product of Array Except Self
'''
Leetcode all test cases passed: Yes
Solution:
    productExceptSelf(self, nums: List[int]) -> List[int]:
        n is the length of nums
        Space Complexity: O(1)
        Time Complexity: O(n)
'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        l = 0
        r = len(nums) - 1
        
        running_product_left = 1
        running_product_right = 1
        
        res = [1] * len(nums)
        
        for i in range(len(nums)):
            res[l] *= running_product_left
            res[r] *= running_product_right
            
            running_product_left *= nums[l]
            running_product_right *= nums[r]
            
            l += 1
            r -= 1
        
        return res
