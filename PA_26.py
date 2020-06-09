#LC 498 - Diagonal Traverse
#Time Complexity - O(row*col)
#Space Complexity - O(row*col)
class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if not matrix:
            return []

        def isOutOfBounds(col, row, width, height):
            return col < 0 or row < 0 or col > width or row > height
        
        col, row = 0, 0
        height = len(matrix) - 1
        width = len(matrix[0]) - 1
        down = False
        result = []
        
        while not isOutOfBounds(col, row, width, height):
            result.append(matrix[row][col])
            if down:
                if col == 0 or row == height:
                    down = False
                    if row == height:
                        col += 1
                    else:
                        row += 1
                else:
                    row += 1
                    col -= 1
            else:
                if row == 0 or col == width:
                    down = True
                    if col == width:
                        row += 1
                    else:
                        col += 1
                else:
                    row -= 1
                    col += 1
        return result