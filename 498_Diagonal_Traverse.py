# Time Complexity : O(m X n) [m = number of rows, n = number of columns]

# Space Complexity : O(1)

# Did this code successfully run on Leetcode : Yes

# Any problem you faced while coding this : No
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:return []
        
        m = len(matrix)
        n = len(matrix[0])
        
        count = m * n
        UP, DOWN = 1, -1
        direction = UP
        r, c = 0, 0
        res = []
        while count != 0:
            res.append(matrix[r][c])
            if direction == UP:
                # The order of if condition id very inportant
                # When both the conditions (c == n-1) and (r == 0) are True at a cell
                # Then we have to move down(increase the r) and not increase the c, since the latter will lead to index out of bounds
                if c == n-1:
                    direction = DOWN
                    r+=1
                elif r == 0:
                    direction = DOWN
                    c+=1
                else:
                    r-=1
                    c+=1
            else:
                # Similarly the if conditions have been ordered to handle the above mentioned case approproately
                if r == m-1:
                    direction = UP
                    c+=1
                elif c == 0:
                    direction = UP
                    r+=1
                else:
                    r+=1
                    c-=1
            count-=1
        return res