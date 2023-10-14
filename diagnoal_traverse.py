# TC : O(rows * cols)
# SC : O(rows * cols)

# Approach - If we handle Direction control and boundary conditions, then the problem is solved
# To handle direction control - use a boolean flag - going_up
# To handle boundary conditions - compare with cols-1 and rows -1 and check if 0 for both cols and rows

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        rows, cols = len(mat), len(mat[0])
        result = []
        going_up = True
        curr_row, curr_col = 0,0 

        while len(result) < rows * cols:
            result.append(mat[curr_row][curr_col])
            if going_up:
                if curr_col == cols-1:
                    curr_row +=1
                    going_up = False
                elif curr_row == 0:
                    curr_col+=1
                    going_up = False
                else:
                    curr_row-=1
                    curr_col+=1
            else:
                if curr_row == rows -1:
                    curr_col+=1
                    going_up = True
                elif curr_col == 0:
                    curr_row+=1
                    going_up = True
                else:
                    curr_row +=1
                    curr_col -=1

        return result
                