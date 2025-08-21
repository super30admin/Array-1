'''
Array-1

Problem 1

Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input: [1,2,3,4] Output: [24,12,8,6] Note: Please solve it without division and in O(n).

Follow up: Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
'''

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]: # type: ignore
        if nums == None or len(nums) == 0:
            return []
        n = len(nums)
        rp = 1
        result = [1 for i in range(n)]
        #result[0] = 1
        #left prod
        for i in range(1, n):
            rp = rp * nums[i-1]
            result[i] = rp

        #right prod, multiply right prod with value in arr
        rp = 1

        for i in range(n-2, -1, -1):
            rp = rp * nums[i+1]
            result[i] = result[i] * rp

        return result            