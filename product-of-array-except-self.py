''' Time Complexity : O(n) 
    Space Complexity : O(1) 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this :  No

   Approach : First do left pass to calculate running product. 
              Then second iteration from right to left and updating the new product
'''

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n =len(nums)
        L = [1] * n
        prev, post = 1,1
        for i in range(n):
            L[i] = prev
            prev = prev * nums[i]
        for j in range(n-1,-1,-1):
            L[j] = post * L[j]
            post = post * nums[j]
        
        return L