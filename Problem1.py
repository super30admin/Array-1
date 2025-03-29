# Problem 1

# Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

# Example:

# Input: [1,2,3,4]
# Output: [24,12,8,6]
# Note: Please solve it without division and in O(n).

# Follow up:
# Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)


# TC : O(n) where n is the length of the input array. 
#     The function makes two passes through the array, 
#     each taking O(n) time.
# SC : O(1) excluding the output array. 
#      Only a constant amount of extra space is used for variables (left_product and right_product). 
#      The output array is not counted in the auxiliary space complexity since it's required as part of the solution.

# Approach : 
#   1. First calculating the product of all elements to the left of each position
#   2. Then calculating the product of all elements to the right of each position
#   3. Finally multiplying these two products for each position

# Did this code successfully run on Leetcode : YES

def productExceptSelf(nums):
    # Initialize output array with 1s, same length as input array
    output = [1] * (len(nums))

    # Initialize the left product as 1
    left_product = 1
    # First pass: Calculate products of all elements to the left of each position
    for i in range(len(nums)):
        # Store the current left product in the output array
        output[i] = left_product
        # Update left_product by multiplying with current element for next iteration
        left_product *= nums[i]

    # Initialize the right product as 1
    right_product = 1
    # Second pass: Going right to left, 
    # multiply each position by products of all elements to the right
    for i in range(len(nums)-1, -1, -1):
        # Multiply existing left products with right products
        output[i] *= right_product
        # Update right_product by multiplying with current element for next iteration
        right_product *= nums[i]

    # Return the final output array
    return output
    
nums = [1,2,3,4]
productExceptSelf(nums)