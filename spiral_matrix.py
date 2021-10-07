#Time Complexity = O(n*m)
#Space Complexity = O(n*m)
#compiled and run on leetcode


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if (matrix == None and len(matrix) == 0 and len(matrix[0]) == 0):
            return []

        n = len(matrix)  # rows
        m = len(matrix[0])  # cols

        output = []
        top = 0
        bottom = n - 1
        left = 0
        right = m - 1

        while (top <= bottom and left <= right):

            for x in range(left, right + 1): # moving in top row
                output.append(matrix[top][x])

            for x in range(top + 1, bottom + 1): #moving in last col
                output.append(matrix[x][right])

            if (top != bottom):

                for x in range(right - 1, left - 1, -1): #moving last row
                    output.append(matrix[bottom][x])

            if (left != right):
                for x in range(bottom - 1, top, -1): #moving first col
                    output.append(matrix[x][left])

            top += 1
            right -= 1
            bottom -= 1
            left += 1

        return output