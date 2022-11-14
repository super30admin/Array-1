#TC: O(m*n)
#SC: O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        d='up'
        i,j,m,n=0,0,len(mat),len(mat[0])
        diagonal_traversal=[]
        while i<m and j<n:
            diagonal_traversal.append(mat[i][j])
            if d=='up':
                if j==n-1:
                    i+=1; d='down'
                elif i==0:
                    j+=1; d='down'
                else:
                    i-=1; j+=1
            else:
                if i==m-1:
                    j+=1; d='up'
                elif j==0:
                    i+=1; d='up'
                else:
                    i+=1; j-=1
        return diagonal_traversal