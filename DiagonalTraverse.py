
"""
traverse a 2D matrix mat in a diagonal zig-zag order (up-right and down-left alternately) 
and stores the elements in a 1D list result. 
It uses direction flags and boundary checks to switch directions whenever it hits the borders 
of the matrix.

"""
#Time Complexity: O(M*N)
#Space Complexity: O(M*N)

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:

        m,n = len(mat), len(mat[0])
        r,c = 0,0
        result = [0]*m*n
        dir = True
        for i in range(m*n):
            result[i] = mat[r][c]
            if dir: #up
                if(r== 0 and c!=n-1):
                    c+=1
                    dir=False
                elif(c==n-1):
                    r+=1
                    dir=False
                else:
                    r-=1
                    c+=1
            else:#down
                if(c== 0 and r!=m-1):
                    r+=1
                    dir=True
                elif(r==m-1):
                    c+=1
                    dir=True
                else:
                    r+=1
                    c-=1

        return result


        