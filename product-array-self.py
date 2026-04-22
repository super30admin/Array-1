
# time O(n), space O(n)

# iterate through res to first generate prefixes, then take prefixes and multiply by suffix in opposite order
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        # nums = [1,2,3,4]
        res = [1]*len(nums)

        prefix = 1
        for i in range(len(nums)):
            res[i]*=prefix 
            prefix*=nums[i]

        suffix = 1
        for i in range(len(nums)-1,-1,-1):
            res[i]*=suffix 
            suffix*=nums[i] 

        return res