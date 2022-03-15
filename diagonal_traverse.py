# Time Complexity : O(m*n)
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

#Simulate the matrix by checking direction and boundary conditions

# Your code here along with comments explaining your approach


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        if mat is None:
            return []
        
        m = len(mat)
        n = len(mat[0])
        
        result = [0]*(m*n)
        i,j = 0,0
        up = True
        
        for idx in range(m*n):
            result[idx] = mat[i][j]
            
            if up:
                if j == n-1:
                    up = False
                    i +=1
                elif i == 0:
                    up = False
                    j +=1
                else:
                    i -=1
                    j +=1
            else:
                if i == m-1:
                    up = True
                    j +=1
                elif j == 0:
                    up = True
                    i +=1
                else:
                    i +=1
                    j -=1
                    
        return result
            
            
            
            