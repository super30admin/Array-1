"""
Approach:

1) In order to follow the spiral pattern assign 4 pointers at each corner of the matrix
2) traverse each boundary/edge of the matrix. Top, right, bottom and left
3) when a lap is completed, you'd have to squeeze your original matrix to traverse the inner edge.
4) repeat steps 1 - 3 again you'd do this until your pointers do not cross each other

Remember to check for the while condition break after the variables change

"""
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        len_rows = len(matrix)
        len_cols = len(matrix[0])

        top = 0
        left = 0
        right = len_cols - 1
        bottom = len_rows - 1

        result = []

        while top <= bottom and left <= right:

            # top row...
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top += 1

            if left <= right:
                # left col...
                for i in range(top, bottom + 1):
                    result.append(matrix[i][right])

            right -= 1

            if top <= bottom:
                # bottom row...
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1

            if left <= right:
                # left col...
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1
        return result

"""
TC: O(n)
SC: O(1)
"""
