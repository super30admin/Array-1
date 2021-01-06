class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        x = []
        if(len(matrix)==0):
            return x
        i=0
        j=0
        k=0
        up = True
        while(len(x)<len(matrix)*len(matrix[0])):
            if(up==True):
                while(i>=0 and j<len(matrix[0]) and j<=k):
                    x.append(matrix[i][j])
                    i-=1
                    j+=1
                if(j>=len(matrix[0])):
                    j-=1
                    i+=1
                i+=1
                k+=1
                up=False
                
            else:
                while(i<=k and i<len(matrix) and j>=0):
                    x.append(matrix[i][j])
                    i+=1
                    j-=1
                if(i>=len(matrix)):
                    i-=1
                    j+=1
                j+=1
                k+=1
                up=True
        
        return x
