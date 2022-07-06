# Time Complexity = O(m * n), size of given matrix = m * n
# Space Complexity = O(1), since no extra storage used

class Solution:
    def findDiagonalOrder(self, mat: list[list[int]]) -> list[int]:
        if len(mat) == 0 or mat == None:
            return []
        
        # Counting number of rows and columns 
        m = len(mat)
        n = len(mat[0])
        
        # Result array initialisation
        result = [0] * (m * n)
        r = 0               # Starts with mat[0][0]
        c = 0
        index = 0           # For result array
        direction = 1
        
        while (index < m * n):
            result[index] = mat[r][c]
            index += 1
            # If its an upward traversal
            if (direction == 1):
                # Checking boundary conditions
                # When we reach the last column
                if (c == n - 1):
                    direction = -1
                    r += 1
                # When we reach the 0th row
                elif (r == 0):
                    direction = -1
                    c += 1
                # Normal conditions for upward traversal
                else:
                    r -= 1
                    c += 1
            # If its a downward traversal
            else:
                # Checking boundary conditions
                # When we reach the last row
                if (r == m - 1):
                    direction = 1
                    c += 1
                # When we reach the 0th column
                elif (c == 0):
                    direction = 1
                    r += 1
                # Normal conditions for downward traversal
                else:
                    r += 1
                    c -= 1
                    
        return result