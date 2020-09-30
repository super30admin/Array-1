# O(M*N) TIME AND O(1) SPACE
class Solution:
    def findDiagonalOrder(self, matrix):
        goingDown = False
        traversed_elements = []
        row,col = 0,0
        while row < len(matrix) and col < len(matrix[0]):
            traversed_elements.append(matrix[row][col])
            if goingDown:
                if col == 0 or row == len(matrix) - 1:
                    goingDown = False
                    if row == len(matrix) - 1:
                        col += 1
                    else:
                        row += 1
                else:
                    row += 1
                    col -= 1
            else:
                if row == 0 or col == len(matrix[row])-1:
                    goingDown = True
                    if col == len(matrix[row]) - 1:
                        row += 1
                    else:
                        col += 1
                else:
                    row -= 1
                    col += 1
        return traversed_elements
