"""
time Complexity O(N*M)
Space Complexity O(1)

Based on the direction and row index and column index either decrement or increament row or column acc to Diagonal Traverse given.

"""
class Solution_diagonaltraverse:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or not matrix[0]:
            return []
        
        N=len(matrix)
        M=len(matrix[0])
        
        res=[0]*(N*M)
        
        dire=1
        row,column=0,0
        leng=M*N
        for idx in range(leng):
            res[idx]=matrix[row][column]
            if(dire==1):
                if(column==M-1):
                    row=row+1
                    dire=-1
                else:
                    if(row==0):
                        column=column+1
                        dire=-1
                    else:
                        row=row-1
                        column=column+1
            else:#dir=-1
                if(row==N-1):
                    column=column+1
                    dire=1
                else:
                    if(column==0):
                        row=row+1
                        dire=1
                    else:
                        column=column-1
                        row=row+1
        return res   