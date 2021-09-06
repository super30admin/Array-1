# Digonal_traversal
# time complexity: O(N* M)
# space complexity: O(1)
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NA

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        k = 0
        row = len(mat)
        col = len(mat[0])
        res = [0] * (row*col)
        i = 0
        j = 0
        direction = 1
        while k < (row * col): 
            res[k] = mat[i][j]
            if direction == 1:
                if j == col - 1:
                    i+=1
                    direction = -1
                elif i == 0:
                    direction = -1
                    j += 1
                else:
                    i -= 1
                    j += 1
            elif direction == -1:
                if i == row - 1:
                    j += 1
                    direction = 1
                elif j == 0:
                    i += 1
                    direction = 1
                else:
                    j -= 1
                    i += 1
            
            k+= 1
                    
        return res