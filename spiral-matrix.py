class Solution:
    '''
    TC: O(m *n)
    SC: O(1)
    Leetcode: Completed the problem with no issue.
    intuation: Use 4 pointer top, left, right, and bottom. use them to traverse the matrix to get the spiral. 
    '''
    def spiralOrder(self, matrix):
        m = len(matrix)
        n = len(matrix[0])
        left = 0
        right = n - 1
        top = 0
        bottom = m  - 1
        res = []
        while left <= right and top <= bottom:
            # top
            for i in range(left, right + 1):
                res.append(matrix[top][i])
            top += 1

            # right
            for i in range(top, bottom + 1):
                res.append(matrix[i][right])
            right -= 1

            # bottom
            if top <= bottom:
                for i in range(right, left-1, -1):
                    res.append(matrix[bottom][i])
                bottom -= 1
            # left
            if left <= right:
                for i in range(bottom, top-1, -1):
                    res.append(matrix[i][left])
                left += 1
        return res


s = Solution()
matrix = [[1,2,3],[4,5,6],[7,8,9]]
print(s.spiralOrder(matrix))
matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
print(s.spiralOrder(matrix))
