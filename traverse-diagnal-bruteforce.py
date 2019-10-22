#Accepted on Leetcode
#Time complexity - O(m*n)
#Space complexity - O(m*n)

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if len(matrix) == 0:
            return []
        m = len(matrix)
        n = len(matrix[0])
        output = [0 for i in range(m*n)]
        up = True
        row=col=0
        for i in range(m*n):
            output[i] = matrix[row][col] 
            if up:
                if col == n-1:
                    row = row+1
                    up = not up
                elif row==0:
                    col = col+1
                    up = not up
                else:
                    row = row-1
                    col = col+1
            else:
                if row == m-1:
                    col = col + 1
                    up = not up
                elif col == 0:
                    row = row+1
                    up = not up
                else:
                    row = row + 1
                    col = col-1
        return output
        