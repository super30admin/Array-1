# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        result = [0]*(m*n)
        i,j = 0,0
        #Traversing upwards
        direction=1
        for idx in range(0,m*n):
            result[idx] = mat[i][j]
            if direction:
                if j==n-1: #Check if last column 
                    i+=1
                    direction=0
                elif i==0: #Check if it's first row
                    j+=1
                    direction=0
                else:
                    i-=1
                    j+=1
        #Traversing downwards
            else:
                if i==m-1:
                    j+=1
                    direction=1
                elif j==0:
                    i+=1
                    direction=1
                else:
                    i+=1
                    j-=1
        return result
        
