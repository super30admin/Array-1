"""
Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.
"""


"""
Time Complexity: O(m*n)
Space Complexity: O(1)
"""


def diagonal_traverse(mat):

    if not mat or not mat[0]:
        return []

    m = len(mat)
    n = len(mat[0])
    r = 0
    c = 0
    dir = 1
    i = 0
    result = [0] * (m * n)

    while i < m*n:
        result[i] = mat[r][c]
        i += 1

        # direction up
        if dir == 1:
            if c == n - 1:
                r += 1
                dir = -1
            elif r == 0:
                c += 1
                dir = -1
            else:
                r -= 1
                c += 1
        # direction down
        else:
            if r == m - 1:
                c += 1
                dir = 1
            elif c == 0:
                r += 1
                dir = 1
            else:
                c -= 1
                r += 1

    return result


print(diagonal_traverse([[1, 2, 3], [4, 5, 6], [7, 8, 9]]))
