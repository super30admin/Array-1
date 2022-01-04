# // Time Complexity : O(M*N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        if matrix == None or len(matrix) == 0:
            return 0
        result = []
        m = len(matrix) 
        n = len(matrix[0])
        
        top, bottom, left, right = 0, m -1, 0, n-1
        
        while(left<= right and top<= bottom):
            # top
            if(left<= right and top<= bottom):
                for j in range(left,right+1,1):
                    result.append(matrix[top][j])
                top += 1
            
            #right
            if(left<= right and top<= bottom):
                for i in range(top, bottom+1, 1):
                    result.append(matrix[i][right])
                right -= 1
            
            #bottom
            if(left<= right and top<= bottom):
                for j in range(right, left-1, -1):
                    result.append(matrix[bottom][j])
                bottom -= 1
                
            #left
            if(left<= right and top<= bottom):
                for i in range(bottom, top-1, -1):
                    result.append(matrix[i][left])
                left += 1
            
        return result
                
            
            
        