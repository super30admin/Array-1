class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        arr = [1 for i in range(len(nums))]
        runmul = 1
        for i in range(len(nums)-1):
            arr[i+1] = arr[i]*nums[i]
        for i in range(len(nums)-1, -1, -1):
            arr[i] *= runmul
            runmul *= nums[i]
        return(arr)
