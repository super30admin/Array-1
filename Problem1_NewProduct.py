
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

# Three line explanation of solution in plain english:
"""
1. To return the product of all other elements without using division, find the product of left and right elements.
2. First, find the left product of every element and store in 'result' array.
3. Then, find the right product and multiply with the current left products in the 'result' and we get the final result.
"""

# Your code here along with comments explaining your approach

def productExceptSelf(self, nums: List[int]) -> List[int]:
    if not nums or len(nums) == 0:
        return []

    length = len(nums)
    result = [0] * length

    # Find the left product of every element and store in result
    rp = 1
    result[0] = rp
    for i in range(1, length):
        rp *= nums[i - 1]
        result[i] = rp

    # Find the right product of every element and multiply with current result values
    rp = 1
    for i in range(length - 2, -1, -1):
        rp *= nums[i + 1]
        result[i] *= rp

    return result