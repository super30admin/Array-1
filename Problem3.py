#  Time Complexity : O(m*n)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
#  Three line explanation of solution in plain english :  Created four pointers. We keep on travelling from right to left, top to bottom, right to left, bottom to top. We keep on reducing the problem to map every element of matrix to create spiral travel.

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        left = 0
        right = len(matrix[0]) - 1
        top = 0
        bottom = len(matrix) - 1

        res = []
        while(left <= right and top <= bottom):
            for i in range(left, right + 1):
                res.append(matrix[top][i])
            top += 1

            for j in range(top, bottom + 1):
                res.append(matrix[j][right])
            right -= 1

            if top <= bottom:
                for k in range(right, left - 1 , -1):
                    res.append(matrix[bottom][k])
                bottom -= 1
            
            if left <= right:
                for l in range(bottom, top - 1, -1):
                    res.append(matrix[l][left])
                left += 1
            
        return res