# https://leetcode.com/problems/product-of-array-except-self/
# TC: O(3n) => O(n)
# SC: O(n)

# This solution uses running sum logic. Iterate through input array nums from left to right to calculate product of elements except that
# element in res array. Second iteration will be iterating the nums array in reverse direction to calculate product of elements except 
# that element, multiply the value of res[i] 
  
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums)
        
        for i in range(1, len(nums)):
            res[i] = res[i-1] * nums[i-1]

        prod = 1
        for i in range(len(nums) - 2, -1, -1):
            prod = prod * nums[i+1]
            res[i] = prod * res[i]
            
        return res