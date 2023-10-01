#Time complexity: O(N.M) N=rows, M=columns
#Space complexity: O(1)

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat==None or len(mat)==0:
            return []

        #Length of rows and columns
        rows=len(mat)
        columns=len(mat[0])
    
        #initialise variables for rows,columns
        r=0
        c=0
        #setting direction=1 which means upwards
        direction=1
        result=[]

        while r<rows and c<columns:
            result.append(mat[r][c])

            #if the diagonal going upward direction then row-- and column++ , viceversa for downward direction
            new_row = r +(- 1 if direction == 1 else 1)
            new_column = c +( 1 if direction == 1 else - 1)

             #checking the next element in the diagonal is within the bounds of the matrix or not.
            if new_row < 0 or new_row == rows or new_column < 0 or new_column == columns:
                if direction:
                    if c == columns - 1:
                        r += 1
                    else:
                        c += 1
                else:
                    if r == rows - 1:
                        c += 1
                    else:
                        r += 1
                #Flip the direction
                direction=1-direction

            else:
                r=new_row
                c=new_column
        return result    




        