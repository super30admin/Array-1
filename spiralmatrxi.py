# Time Complexity : O(mxn)
# Space Complexity :O(mxn) / O(1) auxialiry space
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english : 

# Your code here along with comments explaining your approach

class Solution:
    def spiralOrder(self, matrix: list[list[int]]) -> list[int]:
        if not matrix:
            return []
        
        result = []
        # boundaries 
        top = 0
        bottom = len(matrix) - 1
        left = 0
        right = len(matrix[0]) - 1

        while top <= bottom and left <= right:
            #directions 
            #left -> right 
            for col in range(left, right +1 ):
                result.append(matrix[top][col])
            
            top += 1
            #top -> bottom 
            for row in range(top, bottom +1 ):
                result.append(matrix[row][right])
            
            right -= 1
            # 3. Right → Left
            if top <= bottom:
                for col in range(right, left - 1, -1):
                    result.append(matrix[bottom][col])

            bottom -= 1

        # 4. Bottom → Top
            if left <= right:
                for row in range(bottom, top - 1, -1):
                    result.append(matrix[row][left])

            left += 1

        return result
