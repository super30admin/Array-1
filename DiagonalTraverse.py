# Apporach: We will use a dir variable which will hold the direction in which we are supposed to go. So value 1 will indiacate up and -1 will indicate down. Also we need to keep in check the base cases or the boundary condition so that we dont catch an array out of bounds exception.

# Base Conditions for up:
# 1) i == 0
# 2) j == n - 1
# 3) normal up direction logic: (i--, j++)

# Base Conditions for down:
# 1) j == 0
# 2) i == n - 1
# 3) normal up direction logic: (i++, j--)

# Time complexity: O(m*n), where m and n are number of rows and columns respectively
# Space complexity: O(1)

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        
        if matrix == None or len(matrix) == 0:
            return []
        
        m = len(matrix)
        n = len(matrix[0])
        i = 0
        j = 0
        index = 0
        direct = 1
        result = []
        
        while index < (m*n):
            
            result.append(matrix[i][j])
            
            # Upwards direction
            if direct == 1:
                if j == n-1:
                    direct = -1
                    i += 1
                    
                elif i == 0:
                    direct = -1
                    j += 1
                    
                else:
                    i -= 1
                    j += 1
            
            # Downwards direction
            else:
                if i == m-1:
                    direct = 1
                    j += 1
                    
                elif j == 0:
                    direct = 1
                    i += 1
                    
                else:
                    i += 1
                    j -= 1
                
            index += 1
        return result
                