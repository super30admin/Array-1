"""
## Problem 1

Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input: [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
// Time Complexity : O(n) not sure
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

"""

#[1,1,2,6]  - left products
#[24,12,4,1]  - right products
# output = left products * right products

def Product(nums):
    left=1       # idea is we will take the left products like starting with 1 in output list
    output=[1]*len(nums)      # create output list of len(nums) with all 1s
    for i in range(len(nums)):  # for loop from 1st element
        output[i]=output[i]*left   # change the output list by multiplying with left which is intialised as 1 in starting
        left=left*nums[i]        # update left with product of current num
    # here at end of for loop we will have output as left products [1,1,2,6]

    right=1        # same idea we store right products starting with 1 from back
    for i in range(len(nums) - 1,-1,-1):
        output[i]=output[i] * right
        right=right*nums[i]
    return output

print(Product([1,2,3,4]))




