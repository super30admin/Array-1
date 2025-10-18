class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        rows = len(matrix)
        if rows == 0:
            return []
        cols = len(matrix[0])
        return self.helper(matrix, 0, rows - 1, 0, cols - 1)
    
    def helper(self, matrix: List[List[int]], t, b, l, r) -> List[int]:
        if t > b or l > r:
            return []
        # Single cell left
        if t == b and l == r:
            return [matrix[t][l]]
        
        res = []
        # top row
        for i in range(l, r + 1):
            res.append(matrix[t][i])
        # right column
        for i in range(t + 1, b + 1):
            res.append(matrix[i][r])
        # bottom row (if more than one row)
        if t < b:
            for i in range(r - 1, l - 1, -1):
                res.append(matrix[b][i])
        # left column (if more than one column)
        if l < r:
            for i in range(b - 1, t, -1):
                res.append(matrix[i][l])
        
        return res + self.helper(matrix, t + 1, b - 1, l + 1, r - 1)
