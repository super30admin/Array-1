from typing import List
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        result = [0] * (m*n)
        left = 0
        right = n - 1
        top = 0
        bottom = m - 1
        j = 0
        while left <= right and top <= bottom:
            for i in range(left, right + 1):
                result[j] = matrix[top][i]
                j += 1
            top += 1
            
            if left <= right:
                for i in range(top, bottom + 1):
                    result[j] = matrix[i][right]
                    j += 1
            right -= 1
            
            if top <= bottom:
                for i in range(right, left -1,-1):
                    result[j] = matrix[bottom][i]
                    j += 1
            bottom -= 1
            
            if left <= right:
                for i in range(bottom, top - 1,-1):
                    result[j] = matrix[i][left]
                    j += 1
            left += 1
             
        return result

obj = Solution()
print(obj.spiralOrder([[1,2,3],[4,5,6],[7,8,9]]))
print(obj.spiralOrder([[1,2,3,4],[5,6,7,8],[9,10,11,12]]))

# Time Complexity = O (m * n) where m and n are number of rows and columns
# Space Complexity = O(1)
        