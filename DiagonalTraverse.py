# Time complexity: O(M * N)
# Space complexity: O(1)
# Compiled on leetcode: Yes
# Challenges faced: Difficulty in coming up with various cases and their correct ordering (of if conditions)
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        m = len(matrix)
        if m == 0:
            return result
        n = len(matrix[0])
        row = 0
        column = 0
        direction = 1 # Represents traversing in upward direction
        for i in range(m*n):
           # Case of traversing upwards:
            result.append(matrix[row][column])
            if direction == 1:
                if column == n - 1:
                    row += 1
                    direction = -1
                elif row == 0:
                    column+=1
                    direction = -1
                else:
                    row -= 1
                    column += 1
            # Case of traversing downwards:        
            else:
                if row == m - 1:
                    column += 1
                    direction = 1
                elif column == 0:
                    row += 1
                    direction = 1    
                else:
                    row += 1
                    column -=1
        return result             
     