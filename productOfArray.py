# TC = O(N)
# SC = O(1)
# LEETCODE = YES
# PROBLEMS = NO

from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        size = len(nums)
        result = []
        runningProduct = None
          
        for i in range(size):
            if i == 0:
                runningProduct = nums[i]
            else:
                runningProduct *= nums[i]
            result.append(runningProduct) 
        runningProduct = None
        
        for i in range(size-1,-1,-1):
            if i == size - 1:
                result[i] = result[i-1]
                runningProduct = nums[i]
            elif i == 0:
                result[i] = runningProduct
            else:
                result[i] = result[i-1] * runningProduct
                runningProduct = nums[i] * runningProduct
                
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
            
        # return result



sol = Solution()
print(sol.productExceptSelf([1,2,3,4]))