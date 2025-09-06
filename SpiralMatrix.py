# Time complexity: O(m*n)
# Space complexity: O(1) since we are not considering the output as an extra space as it is auxiliary space.
# Did it run on leetcode: Yes

# We are checking for top <= bottom and left <= right only for 2 loops because for others the for loops take care

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m, n = len(matrix), len(matrix[0])
        result = []
        top, left = 0, 0
        right = n - 1
        bottom = m - 1
        while (left <= right and top <= bottom):
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top += 1

            for j in range(top, bottom + 1):
                result.append(matrix[j][right])
            right -= 1

            if (top <= bottom):
                for k in range(right, left - 1, -1):
                    result.append(matrix[bottom][k])
                bottom -= 1

            if (left <= right):
                for l in range(bottom, top - 1, -1):
                    result.append(matrix[l][left])
            left += 1

        return result