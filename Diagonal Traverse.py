class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        
        #Time Complexity: O(len(maxtrix) * len(matrix[0]))
        #Space Complexity: O(1)
        
        ls = []
        if not matrix or not matrix[0]:
            return ls
        
        i, j = 0, 0
        direction = 'up'
        
        while i + j <= (len(matrix) + len(matrix[0])) - 2:
            ls.append(matrix[i][j])
            
            if direction == 'up':
                if j == len(matrix[0]) - 1:
                    i += 1
                    direction = 'down'
                elif i == 0:
                    j += 1
                    direction = 'down'
                else:
                    i -= 1
                    j += 1
                 
            else:
                if i == len(matrix) - 1:
                    j += 1
                    direction = 'up'
                elif j == 0:
                    i += 1
                    direction = 'up'
                else:
                    i += 1
                    j -= 1
        
        return ls