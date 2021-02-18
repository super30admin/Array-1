# Time complexity - O(mn) (where m,n: rows and column length)
# Space Complexity: O(1) 
# Did this code successfully run on LeetCode?: Yes
# Problems faced while coding this:None

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        if len(matrix) == 0 or len(matrix[0]) == 0:
            return result

        rows = len(matrix)
        cols = len(matrix[0])
        i = j = 0
        direction = 1                               

        while len(result) != rows*cols:
            result.append(matrix[i][j])

            if direction == 1:                      
                if j != cols - 1 and i != 0:       
                    i -= 1
                    j += 1
                else:                               
                    if j == cols - 1:            
                        i += 1
                    elif i == 0:                    
                        j += 1
                    direction = -1
            else:                                   
                if i != rows - 1 and j != 0:        
                    i += 1
                    j -= 1
                else:                               
                    if i == rows - 1:               
                        j += 1
                    elif j == 0:
                        i += 1
                    direction = 1

        return result