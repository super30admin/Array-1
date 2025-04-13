#  Time Complexity : O(m * n)
#  Space Complexity : O(m * n)
#  Did this code successfully run on Leetcode : Yes
#  Three line explanation of solution in plain english : Divide the traversal into two directions up and down. For the up diection we have two edge cases when we reach the roof and when we hit the right border. For the in between traversal reduce row by 1 and increase column by 1. For the downward direction the two edge cases are when we hit the bottom and when we hit the left border. For the in between traversal increase row by 1 and reduce column by 1   

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        l = m * n
        result = [0] * l
        idx = 0
        if mat is None:
            return result
        i = 0
        j = 0
        dir = True

        while idx < m * n:
            result[idx] = mat[i][j]
            idx += 1

            if dir:
                if j == n - 1:
                    dir = False
                    i = i + 1

                elif i == 0:
                    dir = False
                    j = j + 1

                else:
                    i = i - 1
                    j = j + 1

            else:
                if i == m - 1: # Bottom
                    dir = True
                    j = j + 1
                
                elif j == 0:  #Left
                    dir = True
                    i = i + 1

                else:
                    i = i + 1
                    j = j - 1
            
        
        return result

