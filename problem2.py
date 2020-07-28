# Time Complexity : O(n*m)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :


# Your code here along with comments explaining your approach

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        tdir = 0
        i, j = 0, 0
        result = []
        while i < len(matrix) and j < len(matrix[0]):
            result.append(matrix[i][j])
            
            if tdir == 0:
                if j+1 == len(matrix[0]):
                    tdir = 1
                    i += 1
                if i == 0:
                    tdir = 1
                    j += 1
                            
                if tdir == 0:
                    i -= 1
                    j += 1
                    
            else:
                if  i+1 == len(matrix):
                    tdir = 0
                    j += 1
                    
                if j == 0:
                    tdir = 0
                    i += 1
                    
                if tdir == 1:
                    j -= 1
                    i += 1
                    
                    
        return result