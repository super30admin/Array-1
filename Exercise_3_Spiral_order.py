class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:

        """
        By defining the boundaries of the matrix and updating it after every turn.
        # Time Complexity : O(m * n)
        # Space Complexity: O(1) 
        """
        # edge cases
        if len(matrix) == 0: return 0
        if len(matrix) == 1: return matrix[0]
        m, n = len(matrix), len(matrix[0])
        up, down = 0, m -1
        left, right = 0, n -1
        res = []
        
        while(up <= down and left <= right):
            # Move Right
            for t in range(left, right +1):
                res.append(matrix[up][t])
            up += 1
            
            
            # move down
            if (up <= down and left <= right):
                for r in range(up, down+1):
                    res.append(matrix[r][right])    
            right -=1
            
            
            # move left
            if (up <= down and left <= right):
                for b in range(right, left-1, -1):
                    res.append(matrix[down][b])
            down -= 1
            
            # move up
            if (up <= down and left <= right):
                for l in range(down, up-1, -1):
                    res.append(matrix[l][left])
            left += 1
            
        return res
        