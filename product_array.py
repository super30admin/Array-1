def productExceptSelf(self, nums: List[int]) -> List[int]: # TC: O(n) SC: O(1)
        n=len(nums)
        result=[0]*n
        result[0]=1
        left=1
        for i in range(1,n):
            left=left*nums[i-1]
            result[i]=left

        right=1
        for i in range(n-2,-1,-1):
            right=right*nums[i+1]
            result[i]=result[i]*right
        return result
        