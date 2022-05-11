'''
Approach: Start iteration over array and get running product from i-1 th index in array L. After reaching end of array, start iteration from end-1 to start and multiply the i+1 th of nums array with ith element of array L. Return L

Time: O(N)
Space: O(1)

Passes all testcases in leetcode
'''


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        L = []
        prod = 1
        L.append(1)
        for i in range(1,len(nums)):
            prod *= nums[i-1]
            L.append(prod)
            
        prod = 1
        
        for i in range(len(nums)-2,-1,-1):
            prod *= nums[i+1]
            L[i] *= prod
        return L
            
        
        
