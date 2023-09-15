# ## Problem 2
# Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.
# Example:
# Input:
# [[ 1, 2, 3 ],
# [ 4, 5, 6 ],
# [ 7, 8, 9 ]]
# Output: [1,2,4,7,5,3,6,8,9]


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if not mat:
            return []
        m, n, dirn, row, col = len(mat), len(mat[0]), 1, 0, 0
        result = [0]*(m*n)

        for i in range(m*n):
            result[i] = mat[row][col]
            #bottom-top
            if dirn == 1:
                if col == n-1:
                    row += 1
                    dirn = -1
                elif row == 0:
                    col += 1
                    dirn = -1
                else:
                    row -= 1
                    col += 1
            #top-bottom
            else:
                if row == m-1:
                    col += 1
                    dirn = 1
                elif col == 0:
                    row += 1
                    dirn = 1
                else:
                    row += 1
                    col -= 1
            
        return result
