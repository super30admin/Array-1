# Time Complexity : O(n) where n = len(nums)
# Space Complexity : O(1) extra space (output array not counted)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : No issues

from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        #Linear Approach (Optimized)
        n = len(nums)
        ans = [1] * n

        # build prefix product for each index
        prefix = 1
        for i in range(n):
            ans[i] = prefix
            prefix *= nums[i]

        # multiply with suffix product
        postfix = 1
        for i in range(n - 1, -1, -1):
            ans[i] *= postfix
            postfix *= nums[i]

        return ans


        # Naive Approach (Quadratic time) 
        # n = len(nums)
        # ans = [1] * n

        # for i in range(n):
        #     product = 1
        #     for j in range(n):
        #         if i != j:
        #             product *= nums[j]
        #     ans[i] = product
        # return ans


if __name__ == "__main__":

    sol = Solution()
    # Example 1
    print(sol.productExceptSelf([1, 2, 3, 4]))       # expected [24, 12, 8, 6]
    # Example 2
    print(sol.productExceptSelf([-1, 1, 0, -3, 3]))  # expected [0, 0, 9, 0, 0]
    # Additional tests
    print(sol.productExceptSelf([2, 3, 4, 5]))       # expected [60, 40, 30, 24]
    print(sol.productExceptSelf([0, 4, 0]))          # expected [0, 0, 0]