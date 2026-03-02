#Diagonal Traverse

# TimeComplexity -> Omxn
# Space complexity -> O1
# Logic - > maintain the direction of the movement, when moving up, increase column by 1 and decrease row by 1, when moving down decrease column byy 1
# and increase row by 1. While handling the edge cases at corners and borders

# from typing import List


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        row = 0
        column = 0
        rows = len(mat)
        columns = len(mat[0])
        result = []
        resultLength = rows*columns
        direction = 1 # 1 is for up and -1 is for down

        #need to loop untill the result is of direct length
        while len(result) < resultLength:
            if direction == 1:
                while (row >= 0 and column < columns ):
                    result.append(mat[row][column])
                    row-=1
                    column+=1
                direction = -1
                if row == -1 and column == columns:
                    row += 2
                    column-=1
                elif row == -1:
                    row += 1
                elif column == columns:
                    row += 2
                    column -= 1
            
            if direction == -1:
                while (column >=0 and row < rows):
                    result.append(mat[row][column])
                    row+=1
                    column-=1
                direction = 1
                if column == -1 and row == rows:
                    column+=2
                    row-=1
                elif column == -1:
                    column+=1
                elif row == rows:
                    column+=2
                    row-=1
        return result
            
sol = Solution()
print(sol.findDiagonalOrder([[1,2,3],[4,5,6]]))