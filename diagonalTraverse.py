class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        # Time Complexity: O(m*n) m = number of rows; n = number of columns
        # Space Complexity: O(1)
        res = []
        i, j = 0, 0
        m = len(mat)
        n = len(mat[0])
        direction = True
        while len(res) < m * n:
            res.append(mat[i][j])
            if direction:
                if i == 0 and j != n - 1:
                    j += 1
                    direction = False
                elif j == n - 1:
                    i += 1
                    direction = False
                else:
                    i -= 1
                    j += 1
            else:
                if j == 0 and i != m - 1:
                    i += 1
                    direction = True
                elif i == m - 1:
                    j += 1
                    direction = True
                else:
                    i += 1
                    j -= 1
        return res


