class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix==None or len(matrix)==0:
            return []
        #counting number of rows in matrix
        m=len(matrix)
        #counting number of columns in matrix
        n=len(matrix[0])
        #initializing result array 
        result =[0 for i in range(m*n)]
        #d=1 for Up and d=0 for Down
        d=1
        #initializing count
        count=0
        r=0
        c=0
        #Dioganl Traversal
        while(count<m*n):
            result[count]=matrix[r][c]
            #Up Direction
            if d==1:
                #condition to check column boundary
                if c==n-1:
                    r+=1
                    d=0
                #condition to check row boundary
                elif r==0:
                    c+=1
                    d=0
                else:
                    r-=1
                    c+=1
            #Down Direction
            else:
                #condition to check row boundary
                if r==m-1:
                    c+=1
                    d=1
                #condition to check column boundary
                elif c==0:
                    r+=1
                    d=1
                else:
                    r+=1
                    c-=1
            count+=1
        return result