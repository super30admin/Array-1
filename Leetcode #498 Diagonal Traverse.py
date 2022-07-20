# Time Complexity: O(n * m).
# Space Complexity: O(1)


class Solution:
    def findDiagonalOrder(mat):
        if mat is None or len(mat) == 0:
            return []

        m = len(mat)
        n = len(mat[0])
        result = []
        row = 0 
        col = 0
        index = 0
        # 1 for upward direction and 0 for downward direction
        direction = 1

        while index < m * n:
            result[index] = mat[row][col]
            index += 1

            if direction == 1:
                if col == n-1:
                    direction -= 1
                    row += 1
                elif row == 0:
                    direction = -1
                    col += 1
                else:
                    row += 1
                    col += 1
            else:
                if row == m -1:
                    direction = 1
                    col += 1
                elif col == 0:
                    direction = 1
                    row += 1
                else:
                    row += 1
                    col += 1 

        return result