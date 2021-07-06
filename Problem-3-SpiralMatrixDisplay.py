class Solution:
    def spiralOrder(self, matrix) :

        m = len(matrix)
        n = len(matrix[0])
        left = 0
        right = n - 1
        top = 0
        bottom = m - 1
        result = []

        while top <= bottom and left <= right:

            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top = top - 1

            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
            right = right - 1

            if top <= bottom:
                for i in range(right, left + 1):
                    result.append(matrix[bottom][i])
                bottom = bottom - 1

            if left <= right:
                for i in range(bottom, top + 1):
                    result.append(matrix[i][left])
                left = left - 1

        return result

sol=Solution()
mat=[[1,2,3],[4,5,6],[7,8,9]]
print (sol.spiralOrder(mat))