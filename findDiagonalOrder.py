#time complexity : O(m*n) i.e as the loop travels to all m*n elements
#space complexity : O(1)
#Did this code successfully run on Leetcode : Yes
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        #null condition
        if mat == None:
            return []
        #defining row, column and direction initially upwards as 1
        row = 0
        column = 0
        direction = 1
        #defining result matrix
        result = []
        #definng index for the result matrix
        index = 0
        while (row in range(0,m)) and (column in range(0,n)):
            result.append(mat[row][column])
            #if the direction is upward
            if direction == 1:
                #if the direction is upward and pointer has reach to the topmost row and if it is not the last column then increment the column and change the direction to downwards
                if row==0 and column!=n-1:
                    column +=1
                    direction = -1
                #if the pointer has reach at the last column then change the direction and increase the row
                elif column ==n-1:
                    row +=1
                    direction = -1
                #increment the pointer in the upward direction by decreasing the row and increasing the column
                else:
                    row -=1
                    column +=1
            #if the direction is downward and pointer has reach to the first column and if it is not the last row then increment the row and change the direction to upwards
            else:
                if column == 0 and row != m-1:
                    row +=1
                    direction = 1
                #if the pointer has reach at the last row then change the direction and increase the column
                elif row == m-1:
                    column +=1
                    direction = 1
                #increment the pointer in the downward direction by decreasing the column and increasing the row
                else:
                    column -=1
                    row +=1
        return result
                    
                    
