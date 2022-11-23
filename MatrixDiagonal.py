class Solution:
    """
    Time complexity - O(n*m). n - no of rows in matrix m - no of columns in matrix
    Space complexity - O(1)
    """
    def findDiagonalOrder(self, mat: list[list[int]]) -> list[int]:
        n = len(mat)
        m = len(mat[0])
        row = 0
        col = 0
        result = []
        up = True
        for x in range(0, n*m):
            # upwards diagonal
            if up:
                while row >=0 and col < m:
                    result.append(mat[row][col])
                    row -= 1
                    col += 1
                # set the row and col for next traversal
                if row < 0 and col < m:
                    row = 0
                else:
                    row += 2
                    col -= 1
                up = False
            # downwards diagonal
            else:
                while row < n and col >= 0:
                    result.append(mat[row][col])
                    row += 1
                    col -= 1
                # set the row and col for next traversal
                if row < n and col < 0:  
                    col = 0
                else:
                    row -= 1
                    col += 2
                up = True
        return result
                    
                
                
        