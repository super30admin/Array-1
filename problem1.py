"""
// Time Complexity : O(N)  N: number of elements
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
first calculate running product for left side then while calculating running product for right side
update the result array with product of left and right running product 

// Your code here along with comments explaining your approach
"""

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [0] * n
        result[0] = 1
        rp = 1
        for i in range(1, n):
            rp = rp * nums[i - 1]
            result[i] = rp
        rp = 1
        for i in range(n - 2, -1, -1):
            rp = rp * nums[i + 1]
            result[i] = rp * result[i]
        return result
