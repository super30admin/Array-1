# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english

# Your code here along with comments explaining your approach
# do a forward pass to multiply all the elements from start
# again do a backward pass and multiply all the elements after that
# now multiply both elements

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output = []
        prod =1
        for i in range (len(nums)):
            output.append(prod)
            prod *= nums[i]
        prod = 1
        for i in range(len(nums)-1,-1,-1):
            output[i] *= prod
            prod *= nums[i]
        return output