"""
// Time Complexity : O(M*N)  M : row N:L cols
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes


// Your code here along with comments explaining your approach
"""
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        top = 0
        bottom = m - 1
        left = 0
        right = n - 1
        result = []
        while left <= right and top <= bottom:
            for j in range(left, right + 1):
                result.append(matrix[top][j])
            top += 1
            if left <= right and top <= bottom:
                for i in range(top, bottom + 1):
                    result.append(matrix[i][right])
            right -= 1
            if left <= right and top <= bottom:
                for j in range(right, left - 1, -1):
                    result.append(matrix[bottom][j])
            bottom -= 1
            if left <= right and top <= bottom:
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
            left += 1
        return result

