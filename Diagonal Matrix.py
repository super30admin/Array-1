class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return matrix
        direction = 1 # 1: Up ,-1: Down
        row = 0
        col = 0
        nrows = len(matrix)-1
        ncols = len(matrix[0])-1
        output = []
        while (len(output) < (nrows+1)*(ncols+1)):
            #print(row,col)
            output.append(matrix[row][col])
            if direction == 1:
                if col == ncols:
                    row +=1
                    direction = -1
                elif row == 0:
                    col += 1
                    direction = -1
                else:
                    row -= 1
                    col += 1
            else:
                if row == nrows:
                    col += 1
                    direction = 1
                elif col == 0:
                    row += 1
                    direction = 1
                else:
                    row +=1
                    col -= 1
        return output
