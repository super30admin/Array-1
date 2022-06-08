#54. Spiral Matrix

"""
Time Complexity = O(n)
Space Complexity = O(1)
Did this code successfully run on Leetcode : YES

Using 4 variables, TOP, LEFT, RIGHT, BOTTOM to decide direction in which we are parsing matrix.
Changing values of these pointers as we get required elements
"""


class Solution:

    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])

        # null array case

        # logic
        result = list()
        left = 0
        right = n - 1
        top = 0
        bottom = m - 1

        for x in range(0, m * n):
            # If we get required elemets, break. No point in going further
            if len(result) == m * n:
                break

            # left to right on top side
            for j in range(left, right + 1):
                result.append(matrix[top][j])
            top = top + 1

            # form top to bottom on right side
            for j in range(top, bottom + 1):
                result.append(matrix[j][right])
            right = right - 1

            # If we get required elemets, break. No point in going further
            # this is checked twice.
            if len(result) == m * n:
                break

            # from right to left in bottom side
            for j in reversed(range(left, right + 1)):
                result.append(matrix[bottom][j])
            bottom = bottom - 1

            # from bottom to top on left side
            for i in reversed(range(top, bottom + 1)):
                result.append(matrix[i][left])
            left = left + 1

        return result
