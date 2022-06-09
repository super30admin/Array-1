# // Time Complexity : O(M*N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        bottom, right = len(matrix) - 1, len(matrix[0]) - 1
        left, top = 0, 0
        result = []
        while (left <= right and top <= bottom):
            for i in range(left, right + 1):
                result.append(matrix[top][i])

            top += 1

            for i in range(top, bottom + 1):
                result.append(matrix[i][right])

            right -= 1
            if left <= right and top <= bottom:
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])

                bottom -= 1
                # print(bottom,top)
            if left <= right and top <= bottom:
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1
        return result