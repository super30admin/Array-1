class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        # As seen from the question there are four directions
        # Left -> right, Top -> Bottom, Right -> Left, Bottom -> Top ... adn it goes on
        
        row = 0
        col = 0
        
        if len(matrix) == 0:
            return 0
        
        top = 0
        left = 0
        right = len(matrix[0]) - 1
        bottom = len(matrix) - 1
        result = []
        
        while (top <= bottom and left <= right):
            
            
            # Left to right for top row
            for i in range(left, right + 1):
                result.append(matrix[top][i])
            top += 1
            
            # Top to bottom for right row
            for i in range(top,bottom + 1):
                result.append(matrix[i][right])
            right -= 1
            
            # Right to left for bottom row 
            if (top <= bottom):
                for i in range(right,left - 1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1

            # Bottom to top for left row
            if (left <=right):
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                left += 1
            
        return result
    
    # Time Complexity: O(m x n) where m and n are the number of rows and columns
    # Space Complexity: O(1) result array is not considered because it is returned as result
            
        