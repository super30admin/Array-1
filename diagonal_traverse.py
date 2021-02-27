# Time Complexity: O(mxn)
# Space Complexity: O(1)
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        result = []
        if len(matrix) == 0:
            return result
        
        direction = 1
        m = len(matrix)
        n = len(matrix[0])
        
        i = 0
        j = 0
        
        while(len(result) < m*n):
            result.append(matrix[i][j])
            
            # going up
            if(direction == 1):
                # check if reached last column
                if(j == n-1):
                    i += 1
                    direction = -1
                # check if reached first row
                elif(i == 0):
                    j += 1
                    direction = -1
                else:
                    i -= 1 
                    j += 1

            elif(direction == -1):
                # check if row reached last row
                if(i == m-1):
                    # increase j and move upwards
                    j += 1
                    direction = 1
                # check if reached first column
                elif(j == 0):
                    i += 1
                    direction = 1
                else:
                    i += 1
                    j -= 1
                    
        return result