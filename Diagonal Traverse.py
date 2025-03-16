class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat == None or len(mat) == 0:
            return []

        m = len(mat)
        n = len(mat[0])
        idx = 0
        r =0
        c =0
        dir =1
        result = [0 for i in range(m*n)]

        while idx < (m*n):
            result[idx] = mat[r][c]
            idx = idx + 1

            if dir == 1:
                if c == n-1:
                    r = r+1
                    dir = -1
                elif r == 0:
                    c = c+1
                    dir = -1
                else:
                    c = c+1
                    r = r -1
            elif dir == -1:
                if r == m-1:
                    c = c+1
                    dir = 1
                elif c == 0:
                    r = r+1
                    dir = 1
                else:
                    c = c-1
                    r = r +1


        return result
        