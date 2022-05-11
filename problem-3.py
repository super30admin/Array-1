'''
Approach: Have 4 variable left, right, top, bottom to track the boundaries. Traverse matrix first left to right, then down, right to left, and top. Update boundaries and repeat process. When top crosses bottom and left crosses right, stop looping

Time: O(m*n)
Space:O(1)

Passes all cases in leetcode


'''

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        res = []
        r = len(matrix)
        c= len(matrix[0])
        
        left = 0
        right = c - 1
        top = 0
        bottom = r - 1

        while top <=bottom and left <=right:
            #left to right
            for c in range(left, right + 1):
                res.append(matrix[top][c])
            top += 1

            #down
            for r in range(top, bottom + 1):
                res.append(matrix[r][right])
            right -= 1
                
            if top <= bottom:
                #right to left.
                for c in range(right, left-1, -1):
                    res.append(matrix[bottom][c])
            bottom -= 1

            
            if left <= right:
                #up
                for r in range(bottom, top-1, -1):
                    res.append(matrix[r][left])
            left += 1
            
        return res
        
