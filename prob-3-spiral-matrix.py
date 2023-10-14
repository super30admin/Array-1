class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        """

        Time Complexity: O(m*n) - 1 pass of matrix 
        Space Complexity: O(1) - 1 output array which is expected - so nothing new 
        Did this code successfully run on Leetcode: Yes
    
        Any problem you faced while coding this: No
    
        NOTES:
        Print all elements in the row within the given range. 

        """
        result = []
        row_len = len(matrix)
        col_len = len(matrix[0])
        top, left = 0, 0
        bottom = row_len - 1
        right = col_len - 1  # start with extreme right column

        while len(result) < row_len * col_len:
            # Traverse LEFT->RIGHT
            # We are at the TOP row, column values will change
            # NOTE: column value will change
            for col in range(left, right + 1):  #In range, the second element is excluded, so make sure to add 1
                result.append(matrix[top][col])

            # Traverse TOP->BOTTOM  
            # We are at the RIGHT column, row values will change
            # We start with top + 1 since we have already printed the top element in previous for loop
            for row in range(top +1, bottom +1):
                result.append(matrix[row][right])
            
            # Traverse RIGHT->LEFT
            # Change ROW where row = bottom (since we have also come all the way down to the BOTTOM limit)
            if top != bottom: # as long as they don't cross each other
                # Traverse RIGHT->LEFT - opposite direction 
                for col in range(right - 1, left - 1, -1):
                    result.append(matrix[bottom][col])
            
            # Traverse BOTTOM -> TOP
            # Change COLUMN where colum=left (since we have come to the LEFT colum)
            # row values will change since we are going up
            if left != right:
                # Traverse up to the TOP
                for row in range(bottom - 1, top, -1):
                    result.append(matrix[row][left])

            # Recalculate 
            left = left + 1  # we started at 0
            right = right - 1
            top = top + 1   # we started at 0
            bottom = bottom - 1

        return result    
