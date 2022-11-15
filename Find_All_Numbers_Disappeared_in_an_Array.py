class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        
        # Sol1 (TC: n, SC: 1)
        res = []
        for i, j in enumerate(nums):
            j = abs(j)
            index = j - 1
            nums[index] = nums[index] * (-1) if nums[index] > 0 else nums[index]
            
        for i in range(len(nums)):
            if nums[i] > 0:
                res.append(i + 1)
                
        return res
