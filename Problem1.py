'''
Problem 1
Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input: [1,2,3,4] Output: [24,12,8,6] Note: Please solve it without division and in O(n).

Follow up: Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)


'''
'''
Time Complexity : O(N)
Space Complexity : 0(1) // returning only result array which they asked
'''

'''
Approach : 
find left sum of the all elements
find right sum of all elements combine those left and right sums
'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
            
        rp = 1
        result = []
        for i in nums:
            result.append(rp)
            rp = rp * i
        rp = 1
        for i in range(len(nums)-1,-1,-1):
            result[i] = result[i] * rp
            rp = rp * nums[i]
            
        return result