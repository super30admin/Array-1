#Problem 3: Spiral Matrix https://leetcode.com/problems/spiral-matrix/

# Time Complexity: O(m*n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Explanation:
    # - We can traverse the matrix in a spiral order by maintaining boundaries for the top, bottom, left, and right sides of the matrix.    

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix == None or len(matrix) ==0:
            return []
        
        m = len(matrix)
        n = len(matrix[0])
        result = []
        t = 0 # top boundary
        r = n-1 # right boundary
        l = 0  # left boundary
        b = m-1 # bottom boundary

        while t <= b and  l <= r:
    
            #top
            for i in range(l, r+1, 1):
                result.append(matrix[t][i])
            t = t+1

            #right
            for i in range(t, b+1, 1):
                result.append(matrix[i][r])
            r = r-1

            #bottom
            if t <= b and l <=r:
                for i in range(r, l-1, -1):
                    result.append(matrix[b][i])
                b = b-1

            #left
            if t <= b and l <=r:
                for i in range(b, t-1, -1):
                    result.append(matrix[i][l])
                l = l+1
            
        return result