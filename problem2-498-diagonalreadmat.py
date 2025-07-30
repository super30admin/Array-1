#time complexity - o(m*n)
#space complexity - 0(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:

        row = 0
        col = 0
        col_length = len(mat[0])
        row_length = len(mat)
        resultant_matrix = [0 for i in range(col_length * row_length)]
        index = 0
        flag = 0
        while index < row_length * col_length:
            resultant_matrix[index] = mat[row][col]
            index += 1
            if flag == 0:
                if col == col_length - 1:
                    row += 1
                    flag = 1
                elif row == 0:
                    col += 1
                    flag = 1
                else:
                    row -= 1
                    col += 1
            else:
                if row == row_length - 1:
                    col += 1
                    flag = 0
                elif col == 0:
                    row += 1
                    flag = 0
                else:
                    row += 1
                    col -= 1
        return resultant_matrix






