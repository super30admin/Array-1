#Time Complexity: O(N)
#Space Complexity:O(N)
#In this problem, first the length of the rows and columns are assigned. Then it is iterated as long as the length of the output matrix is smaller than the product of the length of rows and columns. The corresponding element is appended to the output array. Then if the direction is equal to 1(up), the boundary conditions are checked. If the col pointer is equal to the length of the columns, then the row pointer is incremented by 1 and the direction is changed to 0(down). If it is the first row, then the col pointer is incremented and the direction is changed to 0. Else, row is decremented and col is incremented. If direction is 0, then row is checked if it is equal to the max length of the rows. In that case, col is incremented and direction is changed to 1. Else, if the col is equal to 0, row is incremented and directio is changed to 1. Else, col is decremented and row is incremented.
# This program was successfully executed and got accepted in leetcode.

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        direction =1 #1 for up and 0 for down
        out=[]
        if  matrix==[]:
            return []
        rows=len(matrix)-1
        cols=len(matrix[0])-1
        row=0
        col=0
        
        while(len(out)<(rows+1)*(cols+1)):
            out.append(matrix[row][col])
            if direction ==1:
                if col==cols:
                    row+=1
                    direction=0
                elif row==0:
                    col += 1
                    direction=0
                else:
                    row -=1
                    col +=1
            else:
                if row==rows:
                    col+=1
                    direction =1
                elif col==0:
                    row+=1
                    direction=1
                else:
                    col-=1
                    row+=1
        return out
                    
                