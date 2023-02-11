"""
Rasika Sasturkar
Time Complexity: O(m*n), where m = no. of rows, n = no. of columns
Space Complexity: O(1)
"""


def spiralOrder(matrix):
    """
    Using 4 directions:
    Left to right - increment top pointer
    Top to bottom - decrement right pointer
    Right to left - decrement bottom pointer
    Bottom to top - increment left pointer
    """
    m = len(matrix)
    n = len(matrix[0])

    left = 0
    right = n - 1
    top = 0
    bottom = m - 1

    result = []
    while top <= bottom and left <= right:
        # top row
        for i in range(left, right + 1):
            result.append(matrix[top][i])
        top += 1

        # right col
        for j in range(top, bottom + 1):
            result.append(matrix[j][right])
        right -= 1

        # bottom row
        if top <= bottom:
            for i in range(right, left - 1, -1):
                result.append(matrix[bottom][i])
        bottom -= 1

        # left col
        if left <= right:
            for j in range(bottom, top - 1, -1):
                result.append(matrix[j][left])
        left += 1

    return result


def main():
    """
    Main function - an example from LeetCode problem to show the working.
    This code ran successfully on LeetCode and passed all test cases.
    """
    matrix1 = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    print(spiralOrder(matrix1))  # returns [1, 2, 3, 6, 9, 8, 7, 4, 5]
    matrix2 = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
    print(spiralOrder(matrix2))  # returns [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]


if __name__ == "__main__":
    main()
