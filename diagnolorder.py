class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return matrix
        nrows = len(matrix)-1
        ncolumns = len(matrix[0])-1
        res = []
        dirs = 1
        r, c = 0,0 
        while len(res) < ((nrows+1)*(ncolumns+1)):
            res.append(matrix[r][c])
            if dirs == 1:
                if c == ncolumns:
                    r += 1
                    dirs = -1
                elif r == 0:
                    c += 1
                    dirs = -1
                
                else:
                    r -= 1
                    c += 1
            else:
                if r == nrows:
                    c += 1
                    dirs = 1
                elif c == 0:
                    r += 1
                    dirs = 1
                else:
                    r += 1
                    c -= 1
        return res