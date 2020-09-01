"""
54. Spiral Matrix

Time = O(mn); m = number of rows, n = number of cols
space = O(mn); m = number of rows, n = number of cols
Successfully excecuted on leetcode

Approach - Layer by layer
1.Copy the uppermost row from left to right.
2. Copy the rightmost column from top to bottom.
3. Copy the lowermost row from right to left.
4. Copy the leftmost column from bottom to top.
"""

class Sppiral:
   
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return matrix
        
        numRows = len(matrix)
        numCols = len(matrix[0])

        topRow = 0
        btmRow = numRows - 1
        leftCol = 0
        rightCol = numCols - 1
        result = []

        while (topRow <= btmRow and leftCol <= rightCol):
            # copy the next top row
            for i in range(leftCol,rightCol+1):
                result.append(matrix[topRow][i])
            topRow += 1

            # copy the next right hand side column
            for i in range(topRow,btmRow+1):
                result.append(matrix[i][rightCol])
            rightCol -= 1

            # copy the next bottom row
            if (topRow <= btmRow):
                for i in range(rightCol,leftCol-1,-1):
                    result.append(matrix[btmRow][i])
                btmRow -= 1

            # copy the next left hand side column
            if (leftCol <= rightCol):
                for i in range(btmRow,topRow-1,-1):
                    result.append(matrix[i][leftCol])
                leftCol += 1

        return result