#Time Complexity: O(MN) M->rows N->coulmns
#Space Complexity: O(1)
#did your code run on leetcode : yes

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        m = len(matrix)
        n = len(matrix[0])
        
        top = 0 
        bottom = m - 1
        
        left = 0
        right = n - 1
        
        result = []
        
        while(top <= bottom and left <= right):
            #top row
            for j in range(left,right + 1):
                result.append(matrix[top][j])
            top += 1
            
            #right column
            for i in range(top,bottom + 1):
                result.append(matrix[i][right])
            right -= 1
            
            #bottom row
            if top <= bottom:
                for j in reversed(range(left,right+1)):
                    result.append(matrix[bottom][j])
                bottom -= 1
            
            #right column
            if left <= right:
                for i in reversed(range(top,bottom + 1)):
                    result.append(matrix[i][left])
                left += 1
            
        return result
        
