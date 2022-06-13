class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        # set up boundaries
        # Time complexity O(N*M)
        # space complexity O(1)
        output = []
        N = len(matrix)
        M = len(matrix[0])
        left = 0
        right = M - 1
        top = 0
        bottom = N - 1

        while len(output) < N * M:
            # traverse left to right
            for j in range(left, right + 1):
                output.append(matrix[top][j])

            # traverse top to bottom
            for i in range(top + 1, bottom + 1):
                output.append(matrix[i][right])

            if top != bottom:
                # traverse right to left
                for j in range(right - 1, left - 1, -1):
                    output.append(matrix[bottom][j])

            if left != right:
                # traverse bottom to top
                for i in range(bottom - 1, top, -1):
                    output.append(matrix[i][left])

            left += 1
            right -= 1
            top += 1
            bottom -= 1

        return output
