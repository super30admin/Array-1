# Array-1

## Problem 1

# Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

# Example:

# Input: [1,2,3,4]
# Output: [24,12,8,6]
# Note: Please solve it without division and in O(n).

# Follow up:
# Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if len(nums)==0 or nums==[]:
            return []
        arr = [0 for i in range(len(nums))]
        rp = 1
        arr[0] = rp
        for i in range(1,len(nums)):
            rp = rp*nums[i-1]
            arr[i] = rp 
        # return arr
        rp = 1
        for i in range(len(nums)-2,-1,-1):
            rp = rp*nums[i+1]
            arr[i] = rp*arr[i]
        return arr
    # <!-- #Time Complexity: O(n)
    # #Space Complexity: O(1)
    # #Approach: The array elements will be multiplied with the a running product and updated continuously untill index - 2 elements. Then again start multiplying the array elements with the running and then with the old array elements keeping the index starting from len(arr)-2.  -->
            
            
            
        