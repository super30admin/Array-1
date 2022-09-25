# Time Complexity: O(m * n) where m and n are the number of rows adn columns respectively.
# Space Complexity: O(1)

# The code sucessfully ran on Leetcode

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if len(matrix) == 0 or matrix == None:
            return []
        
        m = len(matrix)
        n = len(matrix[0])
        result = []
        top, left, bottom, right = 0, 0, m - 1, n - 1
        
        while(top <= bottom and left <= right):
            
            for i in range(left, right + 1):
                result.append(matrix[top][i])
                    
            top += 1
            
            for i in range(top, bottom + 1):
                result.append(matrix[i][right])
                    
            right -= 1
            
            if top <= bottom:
                for i in range(right, left - 1, -1):
                    result.append(matrix[bottom][i])

                bottom -= 1
            
            if left <= right:
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])

                left += 1
            
        return result                    
            