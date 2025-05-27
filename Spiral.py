# Time Complexity: O(m*n)
# Space Complexity: O(m*n)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if len(matrix) == 0 or len(matrix[0]) == 0:
            return []
        m = len(matrix)
        n = len(matrix[0])
        result = []
        top = 0
        bottom = m-1
        left = 0
        right = n-1

        while left <= right and top <= bottom:
            # Top Row
            for i in range(left,right+1):
                result.append(matrix[top][i])
            top +=1

            # Right Column
            for i in range(top, bottom+1):
                result.append(matrix[i][right])
            right -= 1

            # Bottom Row
            if(top <= bottom):
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])
            bottom -= 1

            # Left Column
            if(left <= right):
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
            left += 1
        return result