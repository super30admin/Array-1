class Solution:
    # Time Complexity: O(m * n)
    # Space Complexity: O(1)
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        r, c = 0, 0
        result = []
        flag = True
        for i in range(m * n):
            result.append(mat[r][c])
            if flag:
                if c == n - 1:
                    flag = False
                    r += 1
                elif r == 0:
                    flag = False
                    c += 1
                else:
                    r -= 1
                    c += 1
            else:
                if r == m - 1:
                    flag = True
                    c += 1
                elif c == 0:
                    flag = True
                    r += 1
                else:
                    c -= 1
                    r += 1
        return result
