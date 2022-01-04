# // Time Complexity : O(M*N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat == None:
            return [0]
        m = len(mat)
        n = len(mat[0])
        result = [0 for i in range(m*n)]
        i,row,col = 0, 0, 0
        direction = 1
        while i< m*n: 
            result[i] = mat[row][col]
            i += 1
            #moving upwards
            if direction == 1:
                if col == n-1:
                    row += 1
                    direction = -1
                elif row == 0:
                    col += 1
                    direction = -1    
                else:
                    row -= 1
                    col += 1
            #moving downwards
            else:
                if row == m-1:
                    col +=  1
                    direction = 1
                elif col == 0:
                    row += 1
                    direction = 1    
                else:
                    col -= 1
                    row += 1
                    
        return result
                
                    
            
                    
                    
            
        