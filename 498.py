# Time O(mxn)
# Space O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        UP = 1
        DOWN = -1
        direction = UP

        i,j = 0,0
        output = []
        r=len(mat)
        c=len(mat[0])

        while i<r and j<c:
            output.append(mat[i][j])
            if direction == UP:
                newrow = i-1
                newcol = j+1
            else: # DOWN
                newrow = i+1
                newcol = j-1
            if newrow >=r or newrow<0 or newcol>=c or newcol<0:
                if direction == UP:
                    if j==c-1:
                        newrow = i+1
                        newcol = j
                    else:# i==0
                        newrow = 0
                        newcol = j+1
                    direction = DOWN
                else: #DOWN
                    if i==r-1:
                        newrow = i
                        newcol = j+1
                    else: # j==0
                        newrow = i+1
                        newcol = 0
                    direction = UP
            i = newrow
            j = newcol

        return output

