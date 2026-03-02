#Spiral Matrix

# Time complexity -> Omxn
# Space complexity -> O1
# Logic - > maintain the direction of the movement, when moving right, increase column by 1,moving down increse row by 1, moving left decrease column byy 1, 
# moving up decrese row by 1. While handling the edge cases at borders and visited rows and columns

from typing import List
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        rows  = len(matrix)
        columns = len(matrix[0])
        # maintain endpoints in each direction indicating time to change directs
        columnRight = columns - 1
        columnleft = 0
        rowTop = 0
        rowBottom = rows - 1
        
        resultLength = rows*columns
        result = []

        if resultLength == 1:
            return [matrix[0][0]]
        
        #need to loop untill the result is of direct length
        while len(result) < resultLength:
            print(result)
            # move right
            for col in range(columnleft,columnRight+1):
                result.append(matrix[rowTop][col])
            #rowTop needs to be incremented by 1
            rowTop+=1
            
            if len(result) == resultLength:
                return result
            #Now move down
            for row in range(rowTop,rowBottom+1):
                result.append(matrix[row][columnRight])
            #columnRight needs to be decreemnted by 1
            columnRight-=1            

            if len(result) == resultLength:
                return result
            #Now move left
            for col in range(columnRight,columnleft-1, -1):
                result.append(matrix[rowBottom][col])
            #rowBottom needs to be decremented by 1
            rowBottom-=1

            if len(result) == resultLength:
                return result
            #Now move up
            for row in range(rowBottom,rowTop-1,-1):
                result.append(matrix[row][columnleft])
            
            #columnleft needs to be incremented by 1
            columnleft+=1
        return result
sol = Solution()
print(sol.spiralOrder([[1,2,3],[4,5,6],[7,8,9]]))