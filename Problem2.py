class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        rows = len(mat)
        columns = len(mat[0])
        i = 0
        j = 0
        direction = 1
        output = []

        while i < rows and j < columns:
            print(i,j)

            output.append(mat[i][j])
            if(direction == 1):
              if(j == columns-1):
                i +=1
                direction *= -1
              elif (i == 0 ):
                direction *= -1
                j += 1
              else:
                i -= 1
                j += 1
            else:
              if(i == rows -1):
                direction *= -1
                j += 1
              elif(j == 0 ):
                direction *= -1
                i += 1
              else:
                i += 1
                j -= 1

        return output