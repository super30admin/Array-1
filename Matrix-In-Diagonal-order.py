# Time Complexity: O(n*m) where n and m are dimensions of the matrix. 
# Space Complexity:  O(1)

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        result = []
        count = 0
        row = 0
        col = 0
        dir = 1 # Aassume upward direction as 1 and downwards as 0
        while(count < m*n):
            result.append(mat[row][col])
            count += 1
            if dir == 1:
                if col ==n-1:
                    dir = -1
                    row += 1
                elif row == 0:
                    dir = -1
                    col += 1
                else:
                    row -= 1
                    col += 1
            else:
                if row == m -1:
                    dir = 1
                    col += 1
                elif col == 0:
                    dir = 1
                    row += 1
                else:
                    row += 1
                    col -= 1

        return result