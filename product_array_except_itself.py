class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res=[0 for i in range(0,len(nums))]
        res[0]=1

        left=1
        for i in range(1,len(nums)):
            left=left*nums[i-1]
            res[i]=left
        
        right=1
        for i in range(len(nums)-1,-1,-1):
            res[i]=right*res[i]
            right=right*nums[i]

        print(res)
        return res
        