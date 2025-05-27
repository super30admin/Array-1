"""
Keep 4 directions: top, bottom, left, right
Move right, down, left, and up — reducing boundaries after each direction
Repeat until all elements are visited
"""
"""
Time Complexity: O(m * n) — All elements visited once
Space Complexity: O(1) not counting output list
"""

class spiral:
    def spiralMatrix(self,matrix):
        if not matrix:
            return []

        res = []
        top, bottom = 0, len(matrix) - 1
        left, right = 0, len(matrix[0]) - 1

        while top <= bottom and left <= right:

            for i in range(left, right + 1):
                res.append(matrix[top][i])
            top += 1

            for i in range(top, bottom + 1):
                res.append(matrix[i][right])
            right -= 1

            if top <= bottom:
                for i in range(right, left - 1, -1):
                    res.append(matrix[bottom][i])
                bottom -= 1

            if left <= right:
                for i in range(bottom, top - 1, -1):
                    res.append(matrix[i][left])
                left += 1

        return res
if __name__=="__main__":
    obj = spiral()
    matrix = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
    print(obj.spiralMatrix(matrix))
