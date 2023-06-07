#Time Complexity : O(n) ... n is number of elements 
#Space Complexity : O(n)
#Any problem you faced while coding this : no

#used direction to manipulate the path for the diagonal order

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        result = [0 for _ in range(len(mat)*len(mat[0]))]
        idx = 0
        row, col = 0, 0
        path = True
        
        while(idx < len(result)):
            result[idx] = mat[row][col]
            idx += 1
            if path:
                if row == 0 and col != len(mat[0]) - 1:
                    col += 1
                    path = False
                elif col == len(mat[0]) - 1:
                    row += 1
                    path = False
                else:
                    row -= 1
                    col += 1
            else:
                if col == 0 and row != len(mat) - 1:
                    row += 1
                    path = True
                elif row == len(mat) - 1:
                    col += 1
                    path = True
                else:
                    row += 1
                    col -= 1
        
        return result
