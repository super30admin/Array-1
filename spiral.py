# Time Complexity : O(m * n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english
    #Traveresed in clock-wise direction, and if index is going out of bounds then 
    # updated row, column, top, bottom accordingly and appended every element traversed to result.

#Your code here along with comments explaining your approach

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or len(matrix) == 0:
            return []
        
        top, left = 0, 0
        right = len(matrix[0])-1
        bottom = len(matrix)-1
        result = []
        
        
        while(top <= bottom and left <= right):
            #top row
            for i in range(left,right+1):
                result.append(matrix[top][i])   
            top +=1
            
            #right column
            for i in range(top, bottom+1):
                result.append(matrix[i][right])   
            right -= 1
                
            #bottom row
            if top <= bottom:
                for i in (range(right, left-1, -1)):
                    result.append(matrix[bottom][i])    
                bottom -= 1
            
            #left column
            if left <= right:
                for i in (range(bottom, top-1, -1)):
                    result.append(matrix[i][left])
                left += 1
                
        return result
                
                
                
        