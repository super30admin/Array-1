  ---------------------- Product of Array Except Self ------------------------------------------------   
# Time Complexity : O(N) N is the length of the Array.
# Space Complexity : O(2N)  2 extra arrays for left and right
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Here I have choosen a left array and right array to store my left product in the left array and right product in the right array.
#Once I stored the left product and right product, we can multiply both elements of array to get the product of left 
#and right which is the answer except product of self.



class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if not nums:
            return []
        
        n = len(nums)
        left = [1 for i in range(n)]
        right = [1 for i in range(n)]
        
        for i in range(1,n):
            left[i] = left[i-1]*nums[i-1]
        
        for j in range(n-2, -1, -1):
            right[j] = right[j+1]*nums[j+1]
        
        for k in range(n):
            left[k] = left[k]*right[k]
        
        return left