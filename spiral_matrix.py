"""
Given an m x n matrix, return all elements of the matrix in spiral order.


"""
"""
Time Complexity: O(m*n)
Space Complexity: O(1)
"""


def spiral_order(matrix):
    m, n = len(matrix), len(matrix[0])
    res = []

    top, bottom = 0, m - 1
    left, right = 0, n - 1

    while top <= bottom and left <= right:
        for i in range(left, right + 1):
            res.append(matrix[top][i])
        top += 1

        for i in range(top, bottom + 1):
            res.append(matrix[i][right])
        right -= 1

        if top <= bottom and left <= right:
            for i in range(right, left - 1, -1):
                res.append(matrix[bottom][i])
            bottom -= 1

        if left <= right and top <= bottom:
            for i in range(bottom, top - 1, -1):
                res.append(matrix[i][left])
            left += 1

    return res


print(spiral_order([[1, 2, 3], [4, 5, 6], [7, 8, 9]]))
