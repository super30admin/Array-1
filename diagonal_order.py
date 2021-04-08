class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix is None or len(matrix)==0:
            return [] 
        m=len(matrix)
        n=len(matrix[0])
        res=[0]*(m*n)
        index=0
        i=0
        j=0
        direction = 1
        while(index<m*n):
            res[index]=matrix[i][j]
            if(direction==1):
                if(j==n-1):
                    i=i+1
                    direction=-1
                elif(i==0):
                    j=j+1
                    direction=-1
                else:
                    i=i-1
                    j=j+1
            else:
                if(i==m-1):
                    j=j+1
                    direction=1
                elif(j==0):
                    i=i+1
                    direction=1
                else:
                    i=i+1
                    j=j-1
            index=index+1
        return res
        
        