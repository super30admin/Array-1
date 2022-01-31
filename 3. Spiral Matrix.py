class Solution:
    # Time Complexity - O(m*n)
    # Space Complexity - O(1) as we're returning the array
    def spiralOrder(self, matrix):
        output = []
        left, right = 0, len(matrix[0])
        top, bottom = 0, len(matrix)

        while left < right and top < bottom:
            # get every value in the top row
            for i in range(left, right):
                output.append(matrix[top][i])
            top += 1

            # get every value in the right most column
            for i in range(top, bottom):
                output.append(matrix[i][right - 1])
            right -= 1

            if not (left < right and top < bottom):
                break

            # get every value from the bottom row
            for i in range(right - 1, left - 1, -1):
                output.append(matrix[bottom - 1][i])
            bottom -= 1

            # get every value in the left most col
            for i in range(bottom - 1, top - 1, -1):
                output.append(matrix[i][left])
            left += 1
        return output

