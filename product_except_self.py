# Time complexity - O(n) because we make two passes over the input array.
# Space complexity - O(1) because we only use a constant amount of space (not counting the output array).

def productExceptSelf(nums):
    n = len(nums)
    output = [1] * n

    # Calculate product of all numbers to the left
    left_product = 1
    for i in range(n):
        output[i] *= left_product
        left_product *= nums[i]

    # Calculate product of all numbers to the right
    right_product = 1
    for i in range(n-1, -1, -1):
        output[i] *= right_product
        right_product *= nums[i]

    return output
