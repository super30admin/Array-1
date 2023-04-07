#Time complexity: O(m*n)
#Space Complexity: O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat==None or len(mat)==0:
            return []
        m=len(mat)
        n=len(mat[0])
        arr=[0 for i in range(m*n)]
        d=1
        row=0
        col=0
        for i in range(m*n):
            arr[i]=mat[row][col]
            if(d==1):
                if(col==n-1):
                    d=-1
                    row=row+1
                elif(row==0):
                    d=-1
                    col=col+1
                else:
                    row=row-1
                    col=col+1
            elif(d==-1):
                if(row==m-1):
                    d=1
                    col=col+1
                elif(col==0):
                    d=1
                    row=row+1
                else:
                    row=row+1
                    col=col-1
        return arr

