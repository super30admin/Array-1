class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        """
        Time Complexity: O(m*n) - 1 passes of matrix 
        Space Complexity: O(1) - 1 output array (so nothing new) 
        Did this code successfully run on Leetcode: Yes
    
        Any problem you faced while coding this: No
    
        """

        row_len = len(matrix)
        col_len = len(matrix[0])

        elements = row_len * col_len

        row, col = 0, 0
        direction = 1  # 1 for moving up, -1 for moving down
        result = []
        while elements > 0:
            #print(matrix[row][col])
            result.append(matrix[row][col])

            # Moving UP - decrement row, increment column
            if direction == 1:
                if col == col_len - 1:  # when we hit the right-most column, increment the row
                    row += 1
                    direction = -1
                elif row == 0:
                    col += 1
                    direction = -1
                else:
                    row -= 1  # decrement row
                    col += 1  # increment column

            # Moving DOWN - increment row, decrement column
            else:
                if row == row_len - 1: # when we hit the bottom-most row, increment the column
                    col += 1
                    direction = 1
                elif col == 0:
                    row += 1
                    direction = 1
                else:
                    row += 1 # increment row
                    col -= 1 # decrement column
                    
            elements -= 1

        print(f"result={result}")
        return result
