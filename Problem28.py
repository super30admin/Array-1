'''
Time complexity: O(n)
Space complexity: O(1)
'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [1] * len(nums)

        rMul = 1
        for i in range(1,len(nums)):
            rMul *= nums[i-1]
            result[i] = rMul
                
        rMul = 1
        for i in range(len(nums)-2, -1, -1):
            rMul *= nums[i+1]
            result[i] = result[i] * rMul

        return result