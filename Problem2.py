# Time Complexity : O(m*n) m rows and n columns
# Space Complexity : O(n+m)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# iterating through the array while maintaining the direction and checking the conditions such the index out of bound doesn't occur
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        
        m = len(mat)
        n = len(mat[0])
        
        i,j,d = 0,0,1
        out = []
        
        while i < m and j < n:
            out.append(mat[i][j])
            
            if d == 1:
                if j == n-1:
                    i += 1
                    d *= -1
                elif i == 0:
                    j += 1
                    d *= -1
                else:
                    j += 1
                    i -= 1
            else:
                if i == m-1:
                    j += 1
                    d *= -1
                elif j == 0:
                    i += 1
                    d *= -1
                else:
                    i += 1
                    j -= 1
        return out
            
            
        
        