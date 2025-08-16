# Diagonal Traverse https://leetcode.com/problems/diagonal-traverse/
# Time complexity: O(m*n)
# Space complexity: O(1)
# We are using row and column pointers and a direction flag to traverse the matrix diagonally.
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m,n = len(mat),len(mat[0])
        r,c =0,0
        dir = True
        res= []
        for i in range(m*n):
            res.append(mat[r][c])
            if dir:
                if r==0 and c!=n-1:
                    c+=1
                    dir = False
                elif c==n-1:
                    r+=1
                    dir = False
                else:
                    r-=1
                    c+=1
            else:   
                if c==0 and r!=m-1:
                    r+=1
                    dir = True
                elif r==m-1:
                    c+=1
                    dir = True
                else:
                    r+=1
                    c-=1
            
        return res

        