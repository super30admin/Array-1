class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        dire = 1
        rows = len(mat) - 1
        columns = len(mat[0]) - 1
        i = 0
        arr = []
        r = 0
        c = 0
        while (i< ((rows+1)*(columns+1))):
            if dire == 1:
                if c == columns:
                    arr.append(mat[r][c])
                    r = r + 1
                    dire = 0
                elif r == 0:
                    arr.append(mat[r][c])
                    c = c + 1
                    dire = 0
                else:
                    arr.append(mat[r][c])
                    r = r - 1
                    c = c + 1
            else:
                if r == rows:
                    arr.append(mat[r][c])
                    c = c + 1
                    dire = 1
                elif c == 0:
                    arr.append(mat[r][c])
                    r = r + 1
                    dire = 1
                else:
                    arr.append(mat[r][c])
                    r = r + 1
                    c = c - 1
            i = i + 1
        return arr

        
