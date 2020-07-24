# APPROACH 1 : OPTIMAL SOLUTION
# Time Complexity : O(n*m), n: number of rows of the matrix, m: number of columns of the matrix
# Space Complexity : O(1), not considering the space of the matrix (else, O(n*m) - result holds all the elements of the matrix)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Traversal is split into - up and down directions
# 2. Up direction -> Normally, go to upper right neighbor
#                 -> if first row, then got to right neighbor and change the direction
#                 -> if last column, then go to down neighbor and change the direction
# 3. Down direction -> Normally go to downleft neighbor
#                   -> if last row, then go to right neighbor and change the direction
#                   -> if first column, then go to down negihbor and change the direction
# 4. Keep track of count of elements traversed to exit the loop

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        
        if not matrix:
            return []
        
        result = []
        isUp, isDown, count, total_elements, row, column = True, False, 0, len(matrix) * len(matrix[0]), 0, 0
        
        while count < total_elements:
            
            result.append(matrix[row][column])
            count += 1
            
            if isUp:
                if column == len(matrix[0]) - 1:
                    row, isUp, isDown = row + 1, False, True
                elif row == 0:
                    column, isUp, isDown = column + 1, False, True
                else:
                    row, column = row - 1, column + 1
                    
            elif isDown:
                if row == len(matrix) - 1:
                    column, isUp, isDown = column + 1, True, False
                elif column == 0:
                    row, isUp, isDown = row + 1, True, False
                else:
                    row, column = row + 1, column - 1
                    
        return result
                        
