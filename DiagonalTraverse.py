# Author: Naveen US
# Title: Diagonal Traversal of a matrix. 

# Time Complexity : O(m*n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

# Traverse in up and down direction alternatively in the matrix by changing the index of the matrix appropriately. 

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m=len(mat)
        n=len(mat[0])
        r,c=0,0
        dir=1
        result=[]
        for i in range(n*m):
            result.append(mat[r][c]
            if dir==1:       # Up dir
                if(c==n-1): # Right edge
                    r+=1
                    dir=-1
                elif(r==0):   # Top row
                    c+=1
                    dir=-1
                else:
                    r-=1
                    c+=1
                
            else:           # Down dir
                if(r==m-1): # bottom row
                    c+=1
                    dir=1
                elif(c==0): # left edge
                    r+=1
                    dir=1
                else:
                    r+=1
                    c-=1    
        return result
