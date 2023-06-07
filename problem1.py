#Time Complexity : O(n) ... n is number of elements 
#Space Complexity : O(n)
#Any problem you faced while coding this : no

#Used the approach of storing the running product of all the previously occurring numbers and also product of the next set of numbers.

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prod = 1
        result = [1]

        for i in range(1,len(nums)):
            prod *= nums[i-1]
            result.append(prod)
        
        prod = 1
        for i in reversed(range(len(nums)-1)):
            prod *= nums[i+1]
            result[i] *= prod

        return result