'''https://leetcode.com/problems/spiral-matrix/
Given an m x n matrix, return all elements of the matrix in spiral order.
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
'''

# Time Complexity : O(m*n) 
# Space Complexity : O(1) (no extra space as result array is expected output)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def spiralOrder(self, mat: 'list[list[int]]') -> 'list[int]':
        if mat is None or len(mat) == 0: return []
        
        rows = len(mat)
        cols = len(mat[0])
        arr = []
        
        top = 0 # topmost row
        bottom = rows-1 # bottommost row
        left = 0 # leftmost coln
        right = cols-1 # rightmost coln
        
        while top <= bottom and left <= right: # cehck stopping condition
            # 1. move left to right (top row)
            for j in range(left, right+1):
                arr.append(mat[top][j])
            top += 1 # top row complete
            
            # 2. move top to bottom (right coln)
            for i in range(top, bottom+1):
                arr.append(mat[i][right])
            right -= 1 # right coln complete
            
            # 3. move right to left  (bottom row)
            if top <= bottom: # check again as we updated top previously (prevent a duplicate value edge case)
                for j in range(right, left-1, -1):
                    arr.append(mat[bottom][j])
                bottom -= 1 # bottom row complete
            
            # 4. move bottom to up  (left coln)
            if left <= right: # check again as we updated right previously
                for i in range(bottom, top-1, -1):
                    arr.append(mat[i][left])
                left += 1

        return arr
            
                
            
        
        
        