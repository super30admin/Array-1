#time complexity: O(n)
#space complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:

        if n == 0 or capacity == 0:
                return 0
            
        max_profit_val = helper(capacity, profit, weights, 0, 0)
        return max_profit_val

        def helper(capacity, profit, weights, idx, max_profit):
            # Base case
            if capacity == 0 or idx >= len(weights):
                return max_profit
            if capacity < 0:
                return 0

            if weights[idx] > capacity:
                return helper(capacity, profit, weights, idx + 1, max_profit)
            else:
                # Choose
                case1 = helper(capacity - weights[idx], profit, weights, idx, max_profit + profit[idx])

                # Not choose
                case2 = helper(capacity, profit, weights, idx + 1, max_profit)

                return max(case1, case2)
        