# Submitted by : Aryan Singh_RN12MAY2023
# Time Complexity : O(m * n)
# Space Complexity : Average : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Thinking of base condition.

class Solution:
    '''
    - 4 directions are iterated separately
    - value of top, bottom, left, right pointer updated after each iteration
    - base condition taken: if value < total_nums. It can also be if left<= right and top <= bottom.
    '''
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        output = []
        max_row = len(matrix)
        max_col = len(matrix[0])
        # initialization
        top = 0
        bottom = max_row - 1
        left = 0
        right = max_col - 1
        total_nums = max_row * max_col
        val = 0
        while val < total_nums:
            # right iteration
            for c in range(left, right + 1):
                output.append(matrix[top][c])
                val += 1
            top += 1
            
            # down iteration
            for r in range(top, bottom + 1):
                output.append(matrix[r][right])
                val += 1
            right -= 1

            # left iteration
            if val < total_nums:
                for c in range(right, left - 1, -1):
                    output.append(matrix[bottom][c])
                    val += 1
                bottom -= 1

            # up iteration
            if val < total_nums:
                for r in range(bottom, top - 1, -1):
                    output.append(matrix[r][left])
                    val += 1
                left += 1
        
        return output
