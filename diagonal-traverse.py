class Solution:
    def findDiagonalOrder(self, mat):
        '''
        TC: O(n)
        SC: O(1)
        Leetcode: Solved without any issue.
        issue: we can use a while loop instead of a for loop.
        '''
        m = len(mat)
        n = len(mat[0])
        r, c = 0, 0
        flag = True
        res = []
        for i in range(m * n):
            res.append(mat[r][c])
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
                    c -= 1
                    r += 1
        return res


s = Solution()
mat = [[1,2,3],[4,5,6],[7,8,9]]
print(s.findDiagonalOrder(mat))
mat = [[1,2],[3,4]]
print(s.findDiagonalOrder(mat))
