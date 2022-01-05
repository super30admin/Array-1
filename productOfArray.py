# some erros remains. I'll fix it ASAP

from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        size = len(nums)
        result = [None for i in range(size)]
        result[0] = 1
        runningProduct = 1
        for i in range(len(nums)+1,0):
            runningProduct *= nums(i-1)
            result[i] = runningProduct
        
        for i in range(size-2,0,-1):
            runningProduct *= nums[i+1]
            result[i] = result[i] * runningProduct
        return result
            
        # TC = NxN
        # loop through all the element and get their indexes
        # for i in range(len(nums)):
        #     # start from left till it reaches current element
        #     for j in range(len(nums)):
        #         if j == i: break
        #         product *= nums[j]
        #     #start from right in reverse till it reaches current element
        #     for k in range(len(nums)-1,-1,-1):
        #         if k == i: break
        #         product *= nums[k]
            
        #     result.append(product)
            
        return result



sol = Solution()
print(sol.productExceptSelf([1,2,3,4]))