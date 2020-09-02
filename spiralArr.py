# // Time Complexity : O(n*m)
# // Space Complexity : O(n*m)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english:
# Keep track of four pointer: top bottom, left and right
# increment/decrement the pointers as necessary i.e., when done traversing outer rectangle, update boundaries

# // Your code here along with comments explaining your approach

class Solution:
    
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or len(matrix)==0 or len(matrix[0])==0:
            return []
        
        result = []
        
        n = len(matrix)
        m = len(matrix[0])
        
        top = 0 
        left = 0
        bottom = n-1
        right = m-1
        
        #for all the moves, while array inside the bounds
        while top <= bottom and left <= right:
            
            #top row: left to right
            for x in range(left,right+1):
                result.append(matrix[top][x])
            top += 1
            
            #right column: top to bottom
            for x in range(top, bottom+1):
                result.append(matrix[x][right])
            right -=1
            
            #bottom row: right to left
            if top<= bottom:    
                for x in range(right,left-1, -1):
                    result.append(matrix[bottom][x])
                bottom -=1

            #left column: bottom to top
            if left<=right:
                for x in range(bottom, top-1, -1):
                    result.append(matrix[x][left])
                left +=1
                
        return result