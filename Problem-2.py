class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        m = len(mat)
        n = len(mat[0])
        i = 0
        j = 0
        idx = 0
        res = []
        flag = True
        while idx < (m)*(n):
            res.append(mat[i][j])
            print(mat[i][j])
            if flag:
                if i == 0 and j != n - 1:
                    j += 1
                    flag = False
                elif j == n - 1:
                    i += 1
                    flag = False
                else:
                    i -= 1
                    j += 1
            else:
                if j == 0 and i != m - 1:
                    i += 1
                    flag = True
                elif i == m - 1:
                    j += 1
                    flag = True
                else:
                    i += 1
                    j -= 1
            idx += 1
        
        return res
                