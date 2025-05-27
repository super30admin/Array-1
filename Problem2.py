class Solution:
    def findDiagonalOrder(self,mat):
        if not mat or not mat[0]:
            return[0]
        
        m,n=len(mat),len(mat[0])
        diagonals={}

        for i in range(m):
            for j in range(n):
                if i+j not in diagonals:
                    diagonals[i+j]=[]
                diagonals[i+j].append(mat[i][j])

        result=[]
        for k in range(m+n-1):
            if k%2==0:
                result.extend(diagonals[k][::-1])
            else:
                result.extend(diagonals[k])

        return result
    
sol=Solution()
print(sol.findDiagonalOrder([[1,2,3],[4,5,6],[7,8,9]]))
print(sol.findDiagonalOrder([[1,2],[3,4]]))