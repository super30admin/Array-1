# time complexity: O(n)
# space complexity: O(1) -using only result array and returning the same
# Approach: create a result array and fill it with running products till before index
# multiply each index from last but second with running product of right indices
# this will ensure that we dont multiply the current element and multiply allother elements instead


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [1 for i in range(n)]
        product = 1
        for i in range(1,n):
            product = product* nums[i-1]
            result[i] = product
        product = 1
        for i in range(n-2,-1,-1):
            product = product* nums[i+1]
            result[i] = result[i]*product
        return result
                                    
        
            
            
        
        
            
        