class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        mul = 1
        result = [1]*len(nums)

        for i in range(1, len(nums)):
            mul = mul*nums[i-1]
            result[i] = mul

        lenmul = 1
        for i in range(len(nums)-2, -1, -1):
            lenmul = lenmul*nums[i+1]
            result[i] = result[i]*lenmul

        return result
    
#Time complexity is O(2n) where n is the length of array as we go over the entire array twice forward and backwards
#Space complexity is O(1) as we are not using auxiliary data structure