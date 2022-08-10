# https://leetcode.com/problems/diagonal-traverse/
# Time O(mxn) and Space O(1), no extra space used and we visit mxn elements once in the given matrix

class Solution:
    def findDiagonalOrder(self, mat):
        #base
        if not mat: return []
        #direction up: 1/down: -1
        dirs = 1
        m,n = len(mat)-1, len(mat[0])-1
        result = []
        
        i,j = 0,0
        while(i != m+1 and j != n+1):
            result.append(mat[i][j])
            
            if dirs == 1: # up
             
                if i == 0 and j != n:
                    j += 1
                    dirs = -1
                elif j == n:
                    i += 1
                    dirs = -1
                else:
                    i -= 1
                    j += 1
                
            elif dirs == -1:  # down
                
                if j == 0 and i != m:
                    i += 1
                    dirs = 1
                elif i == m:
                    j += 1
                    dirs = 1
                else:
                    i += 1
                    j -= 1    
            
        return result

mat = [[1,2,3],[4,5,6],[7,8,9]]
s = Solution()
output = s.findDiagonalOrder(mat)
print(output)

        