# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        """
        need to return a result List []

        Greedy? After pen/paper i see that if multiply everything else 
        but the last element then it is the last element. (in one pass)
        - Can have ongoin product towards the right.
        - Ongoin product from left
        
        """
        res = [1] * len(nums)
        
        if not nums:
            return res
        
        res[0] = 1
        for i in range(1, len(nums)):
            res[i] = nums[i-1] * res[i-1]

        mult = 1 
        for i in range(len(nums)-1, -1, -1):
            res[i] = res[i] * mult
            print(res)
            mult *= nums[i] 
        return res