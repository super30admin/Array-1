# Time Complexity : O(m X n) [m = number rows in matrix, n = number of columns in matrix]
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
# 1. Start with row 1 and move right. Mark the cell as null after appending to the output list
# 2. Change the direction once we reach the end of a row or column or null value
# 3. Direction change logic
#   3.1 if curr -> right then next->bottom
#   3.2 if curr -> bottom then next->left
#   3.3 if curr -> left then next->top
#   3.4 if curr -> top then next->right
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []
        m = len(matrix)
        n = len(matrix[0])
        count = m * n # Total number of elements
        # [-1,0] - Top
        # [0,1]  - Right
        # [1,0] - Bottom
        # [0,-1] - Left
        direction = [[-1,0], [0,1],[1,0],[0,-1]]
        current_direction = 1
        r = 0
        c = 0
        res = []
        while count!=0:
            if 0 == current_direction: # Move Top
                while r >= 0 and matrix[r][c] is not None:
                    res.append(matrix[r][c])
                    count -= 1 
                    matrix[r][c] = None
                    r += direction[current_direction][0]
                    c += direction[current_direction][1]
                r+=1
            elif 1 == current_direction: # Move Right -> Initial direction
                while c < n and matrix[r][c] is not None:
                    res.append(matrix[r][c])
                    count -= 1
                    matrix[r][c] = None
                    r += direction[current_direction][0]
                    c += direction[current_direction][1]
                c-=1
            elif 2 == current_direction: # Move Bottom
                while r < m and matrix[r][c] is not None:
                    res.append(matrix[r][c])
                    count -= 1
                    matrix[r][c] = None
                    r += direction[current_direction][0]
                    c += direction[current_direction][1]
                r-=1
            else: # Move Left
                while c >= 0 and matrix[r][c] is not None:
                    res.append(matrix[r][c])
                    count -= 1
                    matrix[r][c] = None
                    r += direction[current_direction][0]
                    c += direction[current_direction][1]
                c+=1
            current_direction = (current_direction + 1) % 4
            r += direction[current_direction][0]
            c += direction[current_direction][1]
        return res