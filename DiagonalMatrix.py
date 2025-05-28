# Time Complexity - o(m*n)
# Space Complexity - o(1)

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:

        m = len(mat)
        n = len(mat[0])

        result = []
        top = True
        row,col = 0,0

        for i in range(m*n):
            result.append(mat[row][col])
            if top:
                if col == n-1:
                    top = False
                    row+=1
                elif row == 0:
                    top = False
                    col+=1 
                else:
                    row-=1
                    col+=1
            else:
                if row == m-1:
                    top = True
                    col+=1
                elif col == 0:
                    top = True
                    row+=1 
                else:
                    col-=1
                    row+=1

        return result


            
        