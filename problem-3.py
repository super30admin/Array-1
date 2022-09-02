#TimeComplexity: O(mn) m-> rows n-> cols
#Space Complexity: O(1)
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        top, bottom, left, right = 0, len(matrix)-1, 0, len(matrix[0])-1
        res = []
        while left <= right and top <= bottom:
            for i in range(left, right + 1):
                res.append(matrix[top][i])
            top += 1

            for j in range(top, bottom + 1):
                res.append(matrix[j][right])
            right -= 1

            if top <= bottom:
                for k in range(right, left - 1, -1):
                    res.append(matrix[bottom][k])
                bottom -= 1

            if left <= right:
                for x in range(bottom, top - 1, -1):
                    res.append(matrix[x][left])
                left += 1
        return res