class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        d = 1
        res = []
        n = len(mat) * len(mat[0])
        col_size = len(mat[0])
        row_size = len(mat)
        i, j = 0, 0
        
        while len(res) != n:
            if d == 1:
                res.append(mat[i][j])
                
                if j == col_size - 1:
                    d = -1
                    i += 1
                elif i == 0:
                    d = -1
                    j += 1
                else:
                    i -= 1
                    j += 1
                    
            elif d == -1:
                res.append(mat[i][j])
                
                if i == row_size - 1:
                    d = 1
                    j += 1
                elif j == 0:
                    d = 1
                    i += 1
                else:
                    i += 1
                    j -= 1
                    
        return res
