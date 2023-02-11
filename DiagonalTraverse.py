"""
Rasika Sasturkar
Time Complexity: O(m*n), where m = no. of rows, n = no. of columns
Space Complexity: O(1)
"""


def findDiagonalOrder(mat):
    """
    Using 2 directions - Up and Down and considering different cases
    of row++, col++, row--, col--
    """
    # null case
    if mat is None:
        return []

    m = len(mat)  # rows
    n = len(mat[0])  # cols
    r = 0
    c = 0
    result = [0 for _ in range(m * n)]

    direction = 1
    index = 0

    while index < len(result):
        result[index] = mat[r][c]
        index += 1

        # case up
        if direction == 1:
            if c == n - 1:
                r += 1
                direction = -1
            elif r == 0:
                c += 1
                direction = -1
            else:
                r -= 1
                c += 1
        # case down
        else:
            if r == m - 1:
                c += 1
                direction = 1
            elif c == 0:
                r += 1
                direction = 1
            else:
                r += 1
                c -= 1

    return result


def main():
    """
    Main function - an example from LeetCode problem to show the working.
    This code ran successfully on LeetCode and passed all test cases.
    """
    mat1 = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    print(findDiagonalOrder(mat1))  # returns [1, 2, 4, 7, 5, 3, 6, 8, 9]
    mat2 = [[1, 2], [3, 4]]
    print(findDiagonalOrder(mat2))  # returns [1, 2, 3, 4]


if __name__ == "__main__":
    main()
