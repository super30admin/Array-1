# O(M * N) TIME AND O(1) SPACE
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        diagonal_order = []
        i = 0
        j = 0
        goingUp = True
        while i < len(matrix) and j < len(matrix[0]):
            diagonal_order.append(matrix[i][j])
            if(goingUp):
                if j == len(matrix[0]) - 1:
                    i += 1
                    goingUp = False
                elif i == 0:
                    j += 1
                    goingUp = False
                else:
                    i -= 1
                    j += 1
            else:
                if i == len(matrix) - 1:
                    j += 1
                    goingUp = True
                elif j == 0:
                    i += 1
                    goingUp = True
                else:
                    i += 1
                    j -= 1
        return diagonal_order