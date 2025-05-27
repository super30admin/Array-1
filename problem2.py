"""
Approach: Simulate as the problem asks. when we go out of bounds -> change direction (Alternate between going up and down)
when we go up (positive = 1 in the solution used below) and and go out of bounds -> either go right else go down (positive = -1). when we're going down
we go either down or right.
t.c. => O(m * n)
s.c. => O(1)
Did this code successfully run on Leetcode : yes 
"""
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m, n = len(mat), len(mat[0])
        res = []

        def checkIfInBounds(i, j):
            if( not (0 <= i < m)) or (not (0 <= j < n)):
                return False
            return True

        def getNextIndexIfOutOfBounds(positive, i, j):
            if positive > 0:
                if not checkIfInBounds(i, j + 1):
                    return [i + 1, j]
                return [i, j + 1]
            else:
                if not checkIfInBounds(i + 1, j):
                    return [i, j + 1]
                return [i + 1, j]
        
        def getNxtIndex(positive, i, j):
            if positive > 0:
                return (i - 1, j + 1)
            else:
                return (i + 1, j - 1)
            
        numElements = m * n
        row, col = 0, 0
        positive = 1
        while numElements:
            
            res.append(mat[row][col])
            tmpRow, tmpCol = row, col
            row, col = getNxtIndex(positive, row, col)
            if not checkIfInBounds(row, col):
                row, col = getNextIndexIfOutOfBounds(positive, tmpRow, tmpCol)
                positive *= -1
            numElements -= 1
        return res