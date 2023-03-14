#Time Complexity - O(n)
#Space Complexity - O(n)
class Solution:
    def productExceptSelf(self, nums):
        res = [1] * (len(nums))

        preFix = 1
        for i in range(len(nums)):
            res[i] = preFix
            preFix *= nums[i]

        postFix = 1
        for i in range(len(nums) -1, -1, -1): #Reverse order of the array
            res[i] *= postFix
            postFix *= nums[i]

        return res