# Time Complexity: O(n*m) where n and m are dimensions of the matrix. 
# Space Complexity:  O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        top = 0
        bottom = len(matrix) -1
        left = 0
        right = len(matrix[0]) -1

        while (top <= bottom and left <= right):
            for i in range(left, right+1):
                result.append(matrix[top][i])
            top += 1
            
            if (top <= bottom and left <= right):
                for i in range(top, bottom+1):
                    result.append(matrix[i][right])
                right -= 1

            if (top <= bottom and left <= right):
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1
            if (top <= bottom and left <= right):
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left += 1
        return result
