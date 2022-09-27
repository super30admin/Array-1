"""
https://leetcode.com/problems/diagonal-traverse/

TC - O(mn)
SC - O(mn)
"""

mat = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]


def diagonalTraverse(matrix):
    if matrix is None or len(matrix) == 0: return

    m = len(matrix)
    n = len(matrix[0])
    r, c = 0, 0

    rtnData = [0] * m * n
    idx = 0
    dir1 = 1

    while idx < m * n:
        rtnData[idx] = matrix[r][c]
        idx += 1
        if dir1 == 1:
            if c == n - 1:
                dir1 = -1
                r += 1
            elif r == 0:
                dir1 = -1
                c += 1
            else:
                r -= 1
                c += 1
        else:
            if r == m - 1:
                dir1 = 1
                c += 1
            elif c == 0:
                dir1 = 1
                r += 1
            else:
                c -= 1
                r += 1

    return rtnData


print(diagonalTraverse(mat))
