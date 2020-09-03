
# 54. Spiral Matrix

# Code:

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []
        
        r = len(matrix)
        c = len(matrix[0])
        
        res = []
        
        # 4 pointers, check whiteboard diagram for reference.
        top = 0
        left = 0
        right = c-1
        bottom = r-1
        
        # Iterate over the matrix
        while top<=bottom and left<=right:
            # Step-1 : top row: left -> right            
            for x in range(left, right+1):
                res.append(matrix[top][x])
            
            top+=1
            
            # Step-2 : [right column] Move from top to bottom:
            for x in range(top, bottom+1):
                res.append(matrix[x][right])
            
            right-=1
            
            if top<=bottom:
                # Step-3 : [Bottom row] Move from right to left:
                for x in reversed(range(left, right+1)):
                    res.append(matrix[bottom][x])

                bottom-=1
            if left<=right:
                # Step-4: [Left col] Move bottom to top:
                for x in reversed(range(top,bottom+1)):
                    res.append(matrix[x][left])
                left+=1
        
        return res
                
            
# Time Complexity: O(n*m)
# Space Complexity: O(n*m)
# Accepted on Leetcode: YES
# Any problems faced: No.      
                
        