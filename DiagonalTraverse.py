# TC : O(m * n) ; row * colums
# SC : O(1)
# Approach : We go through all the elements, appending in result array and cover all the edge cases (boundary elements) 
# through if else conditions. We use direction variable to indicate our direction of traversal. We return result array.
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or len(matrix) == 0:
            return []
        
        m = len(matrix)
        n = len(matrix[0])
        result = []
        i = 0
        j = 0
        index = 0
        direction = 1
        
        while index < m*n:
            result.append(matrix[i][j])
            if direction == 1:
                if j == n-1:
                    direction = -1
                    i += 1
                elif i == 0:
                    direction = -1
                    j += 1
                else:
                    i -= 1
                    j += 1
            else:
                if i == m-1:
                    direction = 1
                    j += 1
                elif j == 0:
                    direction = 1
                    i += 1
                else:
                    i += 1
                    j -= 1
            index += 1
        
        return result