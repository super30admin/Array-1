# TC: O(mxn)
# SC: O(1) -> no extra space, output array not accounted in SC

class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        dir = True
        i = 0
        j = 0
        m = len(mat)
        n = len(mat[0])
        out = [0] * m*n  # output array
        idx = 0  # result array idx

        while i < m and j < n:
            print(i, j)
            out[idx] = mat[i][j]
            print(out)
            idx += 1
            if dir == True:
                if i == 0 and j != n-1:
                    j += 1
                    dir = False
                elif j == n-1:
                    i += 1
                    dir = False
                else:
                    i -= 1
                    j += 1
            else:
                if i == m-1:
                    j += 1
                    dir = True
                elif j == 0:
                    i += 1
                    dir = True
                else:
                    i += 1
                    j -= 1
        return out


obj = Solution()
print(obj.findDiagonalOrder([[1, 2, 3], [4, 5, 6], [7, 8, 9]]))
