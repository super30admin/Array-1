"""
https://leetcode.com/problems/spiral-matrix/
TC - O(m+n)
SC - O(n)
"""

mat = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]


def spiralMatrix(matrix):
    matLen = len(matrix)
    n = len(matrix[0])
    top = 0
    bottom = matLen - 1
    left = 0
    right = n - 1
    rtnData = []

    while top <= bottom and left <= right:

        for i in range(left, right + 1):
            rtnData.append(matrix[top][i])
        top += 1

        for i in range(top, bottom + 1):
            rtnData.append(matrix[i][right])
        right -= 1

        if top <= bottom:
            for i in range(right, left - 1, -1):
                rtnData.append(matrix[bottom][i])
            bottom -= 1
        if left <= right:
            for i in range(bottom, top - 1, -1):
                rtnData.append(matrix[i][left])
            left += 1

    return rtnData


print(spiralMatrix(mat))