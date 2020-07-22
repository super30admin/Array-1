# problem 1 : 238. Product of Array Except Self : https://leetcode.com/problems/product-of-array-except-self/
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if not nums:
            return None
        res1 = [0] * len(nums)
        res1[0] = 1
        prod1 = 1
        for i in range(1, len(nums)):
            res1[i] = nums[i-1] * res1[i-1]
        for j in range(len(nums)- 2, -1, -1):
            prod1 *= nums[j + 1]
            res1[j] *= prod1
        return res1




# problem 2 : 498. Diagonal Traverse : https://leetcode.com/problems/diagonal-traverse/
# Time Complexity : O(n*m)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []
        rows, cols = len(matrix), len(matrix[0])
        res = [0] * (rows  * cols)
        count = 0
        # 1 is up and 0 is down
        row, col, d = 0, 0, 1
        while count < (rows*cols):
            res[count] = matrix[row][col]
            if d:
                if col == cols-1:
                    row += 1
                    d = 0
                elif row == 0:
                    col += 1
                    d = 0
                else:
                    row -= 1
                    col += 1
            else:
                if row == rows-1:
                    col += 1
                    d = 1
                elif col == 0:
                    row += 1
                    d = 1
                else:
                    row += 1
                    col -= 1
            count += 1
        return res
        



# problem 3 : 54. Spiral Matrix : https://leetcode.com/problems/spiral-matrix/
# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None

import math
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        # if not matrix :
        #     return []
        # row, col = len(matrix), len(matrix[0])
        # spirals = math.ceil(min(row,col) / 2)
        # res = []
        # for sp in range(spirals) :
        #     rf, rl = sp, row - 1 - sp
        #     cf, cl = sp, col - 1 - sp
        #     if rf == rl and cf == cl:
        #         res.append(matrix[rf][cf])
        #     elif rf == rl and cf != cl:
        #         res += matrix[rf][cf:cl+1]
        #     elif rf != rl and cf == cl:
        #         while rf <= rl :
        #             res.append(matrix[rf][cf])
        #             rf += 1
        #     else :
        #         res += matrix[rf][cf:cl+1]
        #         for i in range(rf+1, rl+1):
        #             res.append(matrix[i][cl])
        #         for i in range(cl - 1, cf-1, -1):
        #             res.append(matrix[rl][i])
        #         for i in range(rl - 1, rf, -1):
        #             res.append(matrix[i][cf])
        # return res
        
        ## easier to understand approach
        if not matrix:
            return []
        m, n = len(matrix), len(matrix[0])
        top, right, bottom, left = 0, n-1, m-1, 0
        count = 0
        res = []
        while count < m*n:
            ## from top left to top right
            for i in range(left, right+1):
                res.append(matrix[top][i])
                count += 1
            top += 1
            if count == m*n:
                return res
            ## from top right to bottom right
            for i in range(top, bottom + 1):
                res.append(matrix[i][right])
                count += 1
            right -= 1
            if count == m*n:
                return res

            ## from bottom right to bottom left
            for i in range(right, left-1, -1):
                res.append(matrix[bottom][i])
                count += 1
            bottom -= 1
            if count == m*n:
                return res
            ## from bottom left to top left
            for i in range(bottom, top - 1, -1):
                res.append(matrix[i][left])
                count += 1
            left += 1
        return res
        
        
        
        
        

