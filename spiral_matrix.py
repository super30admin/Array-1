"""
TC -> O(min(m,n))
SC -> O(mn) -> result

Use 4 pointers top,bottom, left and right.
After each pointer is updated, perform checks so there is no out of bounds issues
"""
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        left = 0
        right = n - 1
        top = 0
        bottom = m - 1

        res = []
        i = 0
        j = 0
        while (left <= right and top <= bottom):
            for j in range(left, right + 1):
                res.append(matrix[i][j])
            top += 1
            if top <= bottom:
                for i in range(top, bottom + 1):
                    res.append(matrix[i][j])
                right -= 1
                for j in range(right, left - 1, -1):
                    res.append(matrix[i][j])
                bottom -= 1
            if (left <= right):
                for i in range(bottom, top - 1, -1):
                    res.append(matrix[i][j])
                left += 1
        return res
