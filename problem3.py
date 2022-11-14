# 54. Spiral Matrix
# TC : O(M * N )
# SC : O(1) if we do not consider that ouput array in SC
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        top_row_covered =  0
        bottom_row_covered = len(matrix) - 1
        right_col_covered =  len(matrix[0]) - 1
        left_col_covered = 0
        res = []
        i, j = 0, 0
        total = len(matrix) * len(matrix[0])
        right, down, left, up = 1, 0, 0, 0
        while total:
            res.append(matrix[i][j])
            # print(res, i, j)
            total -= 1
            if right == 1:
                if j == right_col_covered:
                    top_row_covered += 1
                    # print(right_col_covered)
                    down = 1
                    right = 0
                    i += 1
                else:
                    j += 1
            elif down == 1:
                if i==bottom_row_covered:
                    right_col_covered -= 1
                    left = 1
                    down = 0
                    j -= 1
                else:
                    i += 1
            elif left == 1:
                if j == left_col_covered:
                    bottom_row_covered -= 1
                    left = 0
                    up = 1
                    i -= 1
                else:
                    j -= 1
            elif up ==1 :
                if i == top_row_covered:
                    left_col_covered += 1
                    j += 1
                    up = 0
                    right = 1
                else:
                    i -= 1
        # print(res)
        return res
            