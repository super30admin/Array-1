# // Time Complexity : O(m*n) where m*n: number of elements in the matrix
# // Space Complexity : O(m*n) where m*n: number of elements
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : none

# // Your code here along with comments explaining your approach

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        row = len(mat)
        col = len(mat[0])
        direction = 1
        i = 0
        j = 0
        result = []
        
        while 0 <= i < row and 0 <= j < col:
            result.append(mat[i][j])
            if direction == 1:
                if j == col-1:
                    i += 1
                    direction = -1
                elif i == 0:
                    j += 1
                    direction = -1
                else:
                    i -= 1
                    j += 1
            else:
                if  i == row-1:
                    j += 1
                    direction = 1
                elif j == 0:
                    i += 1
                    direction = 1
                else:
                    i += 1
                    j -= 1
        return result