#Time Complexity:O(m*n)
#Space Complexity: O(1)
def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m=len(mat)
        n=len(mat[0])
        result=[1]*(m*n)
        i=0 
        j=0 
        index=0
        direction=1
        while index<m*n:
            result[index]=mat[i][j]
            index+=1
            if direction==1:
                if i==0 and j!=n-1:
                    j+=1
                    direction=-1
                elif j==n-1:
                    i+=1
                    direction=-1
                else:
                    i-=1
                    j+=1
            else:
                if j==0 and i!=m-1:
                    i+=1
                    direction=1
                elif i==m-1:
                    j+=1
                    direction=1
                else:
                    j-=1
                    i+=1
        return result
