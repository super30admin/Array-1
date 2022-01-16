# Time Complexity : O(N*M) 
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Three line explanation of solution in plain english
# Maintain border limits as they change
# when index cannot move in any direction return result

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        if not mat or not mat[0]:
            return []
        
        n = len(mat); m = len(mat[0])
        
        direction_up = True
        row, column = 0, 0
        
        output = list()
        
        while row < n and column < m:
            output.append(mat[row][column]) # 2,1
            
            if direction_up:
                new_row = row - 1
                new_column = column + 1
            else:
                new_row = row + 1 
                new_column = column - 1 #3,0
            
            if new_row < 0 or new_row == n or new_column < 0 or new_column == m:
                if direction_up: #dir_down
                    if column == m - 1:
                        row += 1
                    else:
                        column += 1 
                else:
                    if row == n - 1:
                        column += 1
                    else:
                        row += 1
                direction_up = (direction_up != True)
            else:
                row = new_row
                column = new_column
        return output
                    
            