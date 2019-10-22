# time - O(N), space O(1)
# accepted in leetcode
# we will do pass the array 2 times once from forward and once from backward to calculate our result from left and right respectively
# and multiply them.
class Solution:
    def productExceptSelf(self, nums):
        runProduct = 1
        temp = 1
        result = []
        if len(nums) == 0 or nums is None: return result # edge case
        # forward pass
        for i in range(len(nums)):
            runProduct = runProduct * nums[i] # calculating the running product at every index
            result.append(runProduct) # appending it to array
            temp = nums[i] # reassign the temp variable
        # backward pass
        runProduct = 1
        temp = 1
        for i in range(len(nums) - 1, -1, -1): # reverse the loop
            runProduct = runProduct * nums[i] # calculating the running product at every index
            result[i] = runProduct * result[i] # multiplying the runningProduct with the array element
            temp = nums[i]
        return result