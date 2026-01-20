# Diagonal Traverse
# Time Complexity :O(m*n)
# Space Complexity O(1)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no


# Your code here along with comments explaining your approach
#start with up direction and if boundaries of the matrix is exceeded then change direction, iterate until the result array is equal to number of rows*columns
# time- O(m*n)
#space - O(1)
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m, n = len(mat), len(mat[0])
        r,c=0,0
        res=[]
        dir="up"
        while(len(res)<(m*n)):
            res.append(mat[r][c])
            if(dir=="up"):
                if c==n-1:
                    r=r+1
                    dir="down"
                elif r==0:
                    c=c+1
                    dir="down"
                else:
                    r=r-1
                    c=c+1
            else:
                if r==m-1:
                    c=c+1
                    dir="up"
                elif c==0:
                    r=r+1
                    dir="up"
                else:
                    r=r+1
                    c=c-1
        return res
        