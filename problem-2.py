#Time Complexity: O(m*n), m-> rows, n-> columns
#Space Complexity: O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        rows = len(mat)
        cols = len(mat[0])
        row, col = 0, 0
        dir = 1 #1-> Up, -1-> down
        result = [] #store values here
        
        while row < rows and col < cols:
            result.append(mat[row][col])
            
            if dir == 1:
                if col == cols-1:
                    row+= 1
                    dir = -1
                elif row == 0:
                    col+=1
                    dir = -1
                else:
                    row-=1
                    col+=1
            else:
                if row == rows-1:
                    col+=1
                    dir = 1
                elif col == 0:
                    row+=1
                    dir = 1
                else:
                    row+=1
                    col-=1
        return result