# Time Complexity :
# O(m*n)

# Space Complexity :
# O(1)

# Did this code successfully run on Leetcode :
# Yes

# Three line explanation of solution in plain english
# I took 4 variables left(pointing first col), right(pointing last col), top(pointing first row), bottom(pointing last row).
# I have incremented and decremented the variables accordingly until top is smaller than or equal to bottom and left is
# smaller than or equal to right.

# Your code here along with comments explaining your approach

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        result = []
            
        if (matrix == None or len(matrix) == 0):
            return result
        
        left = 0
        right = len(matrix[0])-1
        top = 0
        bottom = len(matrix)-1
        
        while(left<=right and top<=bottom):
            
                if(left<=right and top<=bottom):
                    for i in range(left, right+1):
                        result.append(matrix[top][i])
                    top += 1
                    
                if(left<=right and top<=bottom):
                    for i in range(top, bottom+1):
                        result.append(matrix[i][right])
                    right -= 1
                
                if(left<=right and top<=bottom):
                    for i in range(right, left-1, -1):
                        result.append(matrix[bottom][i])
                    bottom -= 1
                    
                if(left<=right and top<=bottom):
                    for i in range(bottom, top-1, -1):
                        result.append(matrix[i][left])
                    left += 1
                
        return result
    
 # ======================== Recrsive Solution =======================

# Time Complexity :
# O(m*n)

# Space Complexity :
# O(1)

# Did this code successfully run on Leetcode :
# Yes

# Your code here along with comments explaining your approach
class Solution:
    
    result = []
    
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        if (matrix == None or len(matrix) == 0):
            return result
        
        left = 0
        right = len(matrix[0])-1
        top = 0
        bottom = len(matrix)-1
        
        self.helperFunction(matrix, left, right, top, bottom)
        
        return self.result
        
    def helperFunction(self, matrix, left, right, top, bottom):
      
        # Base Case
        
        if (left>right or top>bottom):
            return
        
        # Choice Diagram
 
        for i in range(left, right+1):
            self.result.append(matrix[top][i])
        top += 1
        
        for i in range(top, bottom+1):
            self.result.append(matrix[i][right])
        right -= 1
        
        if (top<=bottom):
            for i in range(right, left-1, -1):
                self.result.append(matrix[bottom][i])
            bottom -= 1
                 
        if (left<=right):
            for i in range(bottom, top-1, -1):
                self.result.append(matrix[i][left])
            left += 1
        
        # recursive call
        self.helperFunction(matrix, left, right, top, bottom)
        