# // Time Complexity : O(mn)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
 # Create direction pointers 4 pointer top,left,right,bottom
 # Iterate in all the 4 directions in the spiral order
 # For every iteration the pointers srink by 1
 # do it until the pointers cross each other(the center most element)

# // Your code here along with comments explaining your approach


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []
        
        top = 0
        right = len(matrix[0])-1
        left = 0
        bottom = len(matrix)-1
        result = []
        while(top <= bottom and left <= right):
            
            ## TOP
            for i in range(left,right+1):
                result.append(matrix[top][i])
            top += 1
            
            ## Right
            for i in range(top,bottom+1):
                result.append(matrix[i][right])
            right -= 1
            
            if (top > bottom or left > right):
                break
                
            ## Bottom
            for i in range(right,left-1,-1):
                result.append(matrix[bottom][i])
            bottom -= 1
            
            ## Left
            for i in range(bottom,top-1,-1):
                result.append(matrix[i][left])
            left += 1
        return result
            
            
            
            
        