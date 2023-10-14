# TC : O(N) - N is the length of nums array
# SC : O(1) 

# Approach - To get the product of number except self, the product with prefix and postfix 
# will give the product. So initially a result array with prefix product is selected and 
# then postfix is calculated to get the final resultant

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums)

        prefix = 1
        for i in range(len(nums)):
            res[i] = prefix
            prefix *= nums[i]
        
        postfix = 1
        for i in range(len(nums)-1, -1,- 1):
            res[i] *= postfix
            postfix*=nums[i]

        return res
