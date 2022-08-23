#executed on leetcode
#time complexity - O(nm)
#space complexity - O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat or not mat[0]:
            return []
        
        N, M = len(mat), len(mat[0])
        row, column = 0, 0
        direction = 1
        result = []
        while row < N and column < M:
            result.append(mat[row][column])
            new_row = row + (-1 if direction == 1 else 1)
            new_column = column + (1 if direction == 1 else -1)
            if new_row < 0 or new_row == N or new_column < 0 or new_column == M:
                if direction:
                    row += (column == M - 1)
                    column += (column < M - 1)
                else:
                    column += (row == N - 1)
                    row += (row < N - 1)
                    
                # Flip the direction
                direction = 1 - direction        
            else:
                row = new_row
                column = new_column
                        
        return result                 
        