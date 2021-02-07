# // Time Complexity :O(m*n)
# // Space Complexity :)(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
# use direction variable 
# different function for up and down.
# In while looop of idx < m*n : Check 3 conditions:
# 1. if its going out of matrix vertically
# 2. if its going out horizontally
# 3. Else 

# // Your code here along with comments explaining your approach

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if len(matrix) == 0 or matrix == None: return [] 
        m = len(matrix)
        n = len(matrix[0])
        
        dir = 1
        l = [0]*(m*n)
        i=0
        j=0
        idx = 0
        
        while idx<m*n:
            l[idx] = matrix[i][j]
            # Going up
            if dir == 1:
                if j == n-1:
                    i += 1
                    dir = -1
                elif i == 0:
                    j += 1
                    dir = -1
                else:
                    i -= 1
                    j += 1

            # goind down
            else:
                if i == m-1:
                    j += 1
                    dir = 1
                elif j == 0:
                    i += 1
                    dir = 1
                else:
                    i += 1
                    j -= 1
            idx +=1
        return l

                                        
                