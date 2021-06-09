# Time Complexity : O(M*N)
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if len(mat)==0:
            return []
        dir = 1
        row = 0
        col = 0
        m = len(mat)
        n = len(mat[0])
        res = [0]*m*n
        
        i = 0
        while i<len(res):
            res[i] = mat[row][col]
            if dir == 1:
                if col==n-1:
                    dir = -1
                    row = row+1
                elif row == 0:
                    dir = -1
                    col = col+1
                else:
                    col = col+1
                    row = row-1
            else:
                if row == m-1:
                    dir = 1
                    col = col+1
                elif col == 0:
                    dir = 1
                    row = row+1
                else:
                    row = row+1
                    col = col-1
                
            i+=1
        return res
            
