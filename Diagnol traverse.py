class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        ans = []
        up = True
        i = 0
        j = 0
        while True:
            ans.append(mat[i][j])
            if i == m - 1 and j == n - 1:
                break
            if up:
                i -= 1
                j += 1
                if j >= n:
                    j = n - 1
                    i += 2
                    up = False
                elif i < 0:
                    i = 0
                    up = False
            else:
                i += 1
                j -= 1
                if i >= m:
                    i = m - 1
                    j += 2
                    up = True
                elif j < 0:
                    j = 0
                    up = True
        return ans

Time complexity: O(m*n)
Space complexity: O(1)
