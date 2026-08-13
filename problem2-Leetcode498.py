#Time Complexity: O(m*n)
#Space Complexity: O(1)

class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        m, n = len(mat), len(mat[0])
        r, c, x, flag = 0, 0, m * n, True
        arr = []
        for _ in range(x):
            arr.append(mat[r][c])
            if flag:
                if r == 0 and c != n - 1:
                    c += 1
                    flag = False
                elif c == n - 1:
                    r += 1
                    flag = False
                else:
                    r -= 1
                    c += 1
            else:
                if c == 0 and r != m - 1:
                    r += 1
                    flag = True
                elif r == m - 1:
                    c += 1
                    flag = True
                else:
                    r += 1
                    c -= 1
        
        return arr
        