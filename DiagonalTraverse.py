# Time Complexity :
# O(m*n)

# Space Complexity :
# o(1)

# Did this code successfully run on Leetcode :
# Yes

# Three line explanation of solution in plain english
# I have maintained a flag which is 1 for upwards direction and -1 for downwards direction.
# The flag changes depending upon the cordinate of the last element added to result array.
# I have taken care edge cases using is else.

# Your code here along with comments explaining your approach

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        result = []
        
        if (mat == None or len(mat) == 0):
            return result
        
        flag = 1
        m = len(mat[0])
        n = len(mat)
        r = 0
        c = 0
        
        while (len(result) < m*n):
            
            # Moving in upwards direction
            if (flag==1):
                result.append(mat[r][c])
                
                # Check for last col
                if (c==m-1):
                    r+=1
                    flag=-1
                # check for first row
                elif (r==0):
                    c+=1
                    flag=-1
                # else move in upwards direction
                else:
                    r=r-1
                    c=c+1
                    
            # Moving in downwards direction
            else:
                result.append(mat[r][c])
                
                # Check for last row
                if (r==n-1):
                    c+=1
                    flag=1
                # Check for firs col
                elif (c==0):
                    r=r+1
                    flag=1
                # else move in downwards direction
                else:
                    r=r+1
                    c=c-1
                    
        return result