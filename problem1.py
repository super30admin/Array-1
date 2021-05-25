class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        newarr = [0]*len(nums)
        newarr[0] = 1
        for i in range(1,len(nums)):
            newarr[i] = nums[i-1]*newarr[i-1]

        runsum1 = 1
        nums.append(1)
        for i in range(len(nums)-2,-1,-1):
            runsum1 = runsum1*nums[i+1]
            newarr[i] = newarr[i]*runsum1

        return newarr






        
