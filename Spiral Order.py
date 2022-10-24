class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        colStart, colEnd = 0, n-1
        rowStart, rowEnd = 0, m-1
        res = []
        while (rowStart<=rowEnd and colStart <= colEnd):
            # Going right
            for j in range(colStart, colEnd+1):
                res.append(matrix[rowStart][j])
            rowStart += 1
            
            # Going down
            for i in range(rowStart, rowEnd+1):
                res.append(matrix[i][colEnd])
            colEnd -= 1
            
            # Going Left
            if rowStart<= rowEnd:
                for j in range(colEnd, colStart-1, -1):
                    res.append(matrix[rowEnd][j])
            rowEnd -= 1
            
            # Going up
            if colStart <= colEnd:
                for i in range(rowEnd, rowStart-1, -1):
                    res.append(matrix[i][colStart])
            colStart += 1
        return res