#Time Complexity: O(m * n) where m is column length and n is row length
#Space Complexity: O(1) since the space occupied by result does not count towards space complexity
#Did it run on Leetcode: Yes

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if len(mat) == 0:
            return []
        rows_len = len(mat)
        column_len = len(mat[0])
        result = [None]*(rows_len*column_len)
        row = 0
        col = 0
        direction = 1
        index = 0
        while index < rows_len*column_len:
            result[index] = mat[row][col]
            index += 1
            if direction == 1:
                if col == column_len - 1:
                    row += 1
                    direction = -1
                elif row == 0:
                    col += 1
                    direction = -1
                else:
                    row -= 1
                    col += 1
                
            elif direction == -1:
                if row == rows_len - 1:
                    col += 1
                    direction = 1
                elif col == 0:
                    row += 1
                    direction = 1
                else:
                    row += 1
                    col -= 1
                
        return result
        