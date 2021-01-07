class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        #Time Complexity: O(len(maxtrix) * len(matrix[0]))
        #Space Complexity: O(1)
        
        top, bottom = 0, len(matrix) - 1
        left, right = 0, len(matrix[0]) - 1
        
        i, j = 0, 0
        ls = []
        
        while bottom >= top and right >= left:
            for j in range(left, right + 1):
                ls.append(matrix[i][j])
            top += 1
            
            for i in range(top, bottom + 1):
                ls.append(matrix[i][j])
            right -= 1
            
            if top <= bottom:    
                for j in range(right, left - 1, -1):
                    ls.append(matrix[i][j])
                bottom -= 1
                
            if left <= right:
                for i in range(bottom, top - 1, -1):
                    ls.append(matrix[i][j])
                left += 1
            
        return ls