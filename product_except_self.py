class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [1]*len(nums)

        for i in range(1,len(nums)):
            result[i]=result[i-1]*nums[i-1]
        postfix = 1
        for i in range(len(nums)-1,-1,-1):
            result[i]*=postfix
            postfix *= nums[i]
        return result
        