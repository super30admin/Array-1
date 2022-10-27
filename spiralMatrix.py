# Space Complexity: O(1)
# Time Complexity: O(mn) : m -> Rows, n -> columns

# Approach is to translate the traversal into different for loops and check the edge condition.

# Added a checking condition before each loop, because I am using While loop, it will not take into consideration if edge condition is breached.

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        result = []
        
        if matrix is None or m == 0:
            return result
        
        
        top = 0
        bottom = m - 1
        left = 0
        right = n - 1
        
        while((left <= right) and (top <= bottom)):
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top += 1
            
            if (left <= right):
                for i in range(top, bottom + 1):
                    result.append(matrix[i][right])
                right -= 1
                
            if (top <= bottom):
                for i in reversed(range(left, right + 1)):
                    result.append(matrix[bottom][i])
                bottom -= 1
            
            if (left <= right):
            
                for i in reversed(range(top, bottom + 1)):
                    result.append(matrix[i][left])
                left += 1
        
        return result
