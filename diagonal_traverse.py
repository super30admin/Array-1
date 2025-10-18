class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        rowLen = len(mat)
        if rowLen == 0:
            return []
        colLen = len(mat[0])
        
        res = []              # Result list to store elements in diagonal order
        row = 0               # Start at the top-left corner
        col = 0
        directionUp = True    # Tracks the current direction of traversal (up-right or down-left)
        
        # Continue until we’ve processed all elements
        while row < rowLen and col < colLen:
            
            if directionUp:
                # --- Moving UP-RIGHT direction ---
                # Keep going up (row--) and right (col++) while staying within matrix bounds
                while row > 0 and col < (colLen - 1):
                    res.append(mat[row][col])
                    row -= 1
                    col += 1
                
                # Append the last element before switching direction
                res.append(mat[row][col])
                
                # If we reached the last column, we can only move down to next row
                if col == (colLen - 1):
                    row += 1
                else:
                    # Otherwise, move right to the next column
                    col += 1
            
            else:
                # --- Moving DOWN-LEFT direction ---
                # Keep going down (row++) and left (col--) while staying within matrix bounds
                while col > 0 and row < (rowLen - 1):
                    res.append(mat[row][col])
                    row += 1
                    col -= 1
                
                # Append the last element before switching direction
                res.append(mat[row][col])
                
                # If we reached the last row, we can only move right to next column
                if row == (rowLen - 1):
                    col += 1
                else:
                    # Otherwise, move down to the next row
                    row += 1
            
            # Flip direction for the next diagonal
            directionUp = not directionUp
        
        return res
