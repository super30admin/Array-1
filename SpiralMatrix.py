# Approach 1: Using pointers left right top down
# In this approach we are maintaining the above 4 pointers and after at every 90 degree turn we updated them by 1 depending on the direction at that time.

# Time complexity: O(m*n)
# Space complexity: O(1)

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix == None or len(matrix) == 0:
            return []
        
        m = len(matrix)
        n = len(matrix[0])
        left = 0
        right = n - 1
        top = 0
        bottom = m - 1
        result = []
        while(top <= bottom and left <= right):
            
            # Moving left to right
            for i in range(left, right+1):
                result.append(matrix[top][i])
            
            # Move top pointer one row down for next iteration
            top += 1
            
            # Note: We are checking for conditions again after incrementing because there is a possibility that it might violated
            
            # Moving top to bottom
            if(top <= bottom and left <= right):
                for i in range(top, bottom+1):
                    result.append(matrix[i][right])

            # Move right pointer back
            right -= 1
            
             # Moving right to left
            if(top <= bottom and left <= right):
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])
                
            # Move bottom pointer up
            bottom -= 1
            
             # Moving bottom to bottom
            if(top <= bottom and left <= right):
                for i in range(bottom, top - 1, -1):
                    result.append(matrix[i][left])
                
            # Move left to right
            left += 1
            
        return result
            
            
            
            
            
            