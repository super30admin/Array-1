#time complexity: 0(n)

#here we either move up or move down.
#while moving up, we decrease the row and increase the coloumn and
#while moving down, we increase the row and decrease the coloumn'
#while moving up and down, we check for boundary conditions

class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if not matrix:
            return []
        direction = 1  #indication to move up
        result = []
        nrows = len(matrix) - 1
        ncols = len(matrix[0]) - 1
        row = 0
        cols = 0
        while (len(result) < (nrows + 1) * (ncols + 1)):  #until we have all the elements of the matrix in the result array
            result.append(matrix[row][cols])
            if direction == 1:    #while moving up
                if cols == ncols:    #if the cols reach maximum, we have to increase row and move down

                                    #and always this condition should be first because, when we put the below condition down,
                                    #and when the cols reach last col, the row will be still zero and if we add coloumn , we get out of index
                    row = row + 1
                    direction = 0
                elif row == 0:          #before the rows become -1, that is when row is 0, move down by increasing the coloumn
                    cols = cols + 1
                    direction = 0
                else:
                    row = row - 1       #we simply move up
                    cols = cols + 1

            else:
                if row == nrows:
                    cols = cols + 1             #while moving down, if the rowa=s reach last row, we have to increase the oloumn and start going up.
                                            #we have to write this condition first beacuse, wheh we are in the first col and last eleemtn and we increase
                                                #row like the below condition , we will encounter out of index
                    direction = 1

                elif cols == 0:
                    row = row + 1
                    direction = 1

                else:
                    row = row + 1               #we simply move down
                    cols = cols - 1
                    # row=row+1
        return result