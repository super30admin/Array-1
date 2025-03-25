'''
The algorithm simulates diagonal traversal of the matrix by alternating between moving up-right and down-left.
It appends elements along each diagonal to the result list while carefully managing boundary conditions (when it hits the top, bottom, left, or right edges).
The direction toggles each time a boundary is hit, ensuring complete traversal of all diagonals.

Time Complexity: O(n)
Space Complexity: O(1)
'''

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        rows, cols = len(mat), len(mat[0])

        cur_row = cur_col = 0

        result = []
        going_up = True

        while len(result)!= rows * cols:
            if going_up:
                while cur_row>=0 and cur_col < cols:
                    result.append(mat[cur_row][cur_col])
                    cur_row -=1
                    cur_col +=1
                
                if cur_col == cols:
                    cur_col -=1
                    cur_row +=2
                else:
                    cur_row +=1
                
                going_up = False
            else:
                while cur_col>=0 and cur_row < rows:
                    result.append(mat[cur_row][cur_col])
                    cur_col -=1
                    cur_row +=1
                
                if cur_row == rows:
                    cur_row -=1
                    cur_col +=2
                else:
                    cur_col +=1
                
                going_up = True
        
        return result