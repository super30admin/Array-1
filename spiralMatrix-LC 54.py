# Time Complexity = O(m * n), since the matrix size is m * n
# Space Complexity = O(1)

class Solution:
    def spiralOrder(self, matrix: list[list[int]]) -> list[int]:
        if matrix == None or len(matrix) == 0:
            return []
        
        m = len(matrix) 
        n = len(matrix[0])
        result = [] * (m * n)
        # Initialising the 4 directions (top, bottom, left, right)
        top = 0
        bottom = m - 1
        left = 0
        right = n - 1
        
        # The condition deciding when to stop the spiral/iterations
        while(top <= bottom and left <= right):
            # Top row
            for i in range(left, right+1):
                result.append(matrix[top][i])
                print(result)
            top += 1
            
            # Right column
            # Did not check conditions here coz only the top value was changed above and in the below loop we are iterating from top to bottom, so that condition is getting checked by the for loop itself
            # if (top <= bottom and left <= right):
            for i in range(top, bottom+1):
                result.append(matrix[i][right])    
            right -= 1
        
            # Bottom row
            # Checking the conditions again since while loop checks the conditions after 4 iterations. So if the conditions are not valid in the mid, we will get a wrong answer if we keep iterating keeping the original while loop in mind
            if (top <= bottom and left <= right):
                for i in range(right, left-1, -1):
                    result.append(matrix[bottom][i])
                bottom -= 1
            
            # Left column
            if (top <= bottom and left <= right):
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left += 1
            
        return result