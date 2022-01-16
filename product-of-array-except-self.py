# Time Complexity : O(N) - 2 runs of the loop for left and right products
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english
# Output array is constructed. In first loop all the elements to the left of current index are multiplied and stored.
# In second loop we traverse in reverse, here we store the product of all elements to the right in a variable and multiplied by the values currently in the output 

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        length = len(nums)
        output = [0 for _ in range(len(nums))]
        output[0] = 1
        # Store all the values to the left of the element
        for i in range(1, length):
            output[i] = nums[i-1] * output[i-1]
        # From the right find all the values to the right of the element and multiply with all the values to the left
        right_values = 1
        for i in reversed(range(len(nums))):
            output[i] *= right_values 
            right_values *= nums[i]
        return output
        