# TC : O(mn) - Iterating over each element to insert into list
# SC : O(1) - As the expected result is result and no extra space being used it's O(1) 
# Approach - As we should go spiral, first we go from left to right and then top to bottom
# We put some conditions to see if we should traverse right to left and bottom to top based on
# curr_row and curr_col with max_rows and max_cols. After each spiral, the next inner spiral starts
# in the diagonal element. Hence we add +1 to curr_row and curr_col and -1 to max_rows and max_cols

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []
        
        rows, cols = len(matrix), len(matrix[0])
        result = []
        
        curr_row, max_rows, curr_col, max_cols = 0, rows-1, 0, cols-1
        
        while curr_row <= max_rows and curr_col <= max_cols:
            # Traverse from left to right.
            for c in range(curr_col, max_cols + 1):
                result.append(matrix[curr_row][c])
            print(result)
            # Traverse from top to bottom.
            for r in range(curr_row + 1, max_rows + 1):
                result.append(matrix[r][max_cols])

            # Traverse from right to left.
            if curr_row < max_rows:
                for c in range(max_cols - 1, curr_col - 1, -1):
                    result.append(matrix[max_rows][c])
            # Traverse from bottom to top.
            if curr_col < max_cols:
                for r in range(max_rows - 1, curr_row, -1):
                    result.append(matrix[r][curr_col])
            
            curr_row, max_rows, curr_col, max_cols = curr_row + 1, max_rows - 1, curr_col + 1, max_cols - 1
        
        return result
