'''
Time Complexity - O(m*n)
Space Complexity - O(1)
'''


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        result = [1] * (m*n)
        row, col = 0, 0
        flag = 1
        index = 0
        while(index < len(result)):
            result[index] = mat[row][col]
            index += 1
            if (flag == 1):
                if col == n-1:
                    row += 1
                    flag = -1
                elif row == 0:
                    col += 1
                    flag = -1
                else:
                    row -= 1
                    col += 1
            else:
                if row == m-1:
                    col += 1
                    flag = 1
                elif col == 0:
                    row += 1
                    flag = 1
                else:
                    row += 1
                    col -= 1
        return result
