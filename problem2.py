'''https://leetcode.com/problems/diagonal-traverse/
Given an m x n matrix mat, 
return an array of all the elements of the array in a diagonal order
Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,4,7,5,3,6,8,9]
'''


# Time Complexity : O(m*n) 
# Space Complexity : O(1) (no extra space as result array is expected output)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def findDiagonalOrder(self, mat: 'list[list[int]]') -> 'list[int]':
        if mat is None or len(mat) == 0: return []
        
        rows = len(mat)
        cols = len(mat[0])
        
        arr = [None]*(rows*cols)
        
        i = 0
        dxn = 1 # 1=Up, -1=down
        r, c = 0, 0
        
        while i < rows*cols:
            arr[i] = mat[r][c]
            i += 1
            if dxn == 1: # Up
                # order of if conditions matter!
                # check if dxn = 1 is complete
                if c == cols-1: # if last column then goto next row and rev dxn 
                    dxn = -1
                    r += 1
                elif r == 0: # if not last column (first half triangle)
                    dxn = -1
                    c += 1
                else: # move to next element
                    r -= 1
                    c += 1
            else: # down
                # check if dxn = -1 is complete
                if r == rows-1: # if last row then goto next column
                    dxn = 1
                    c += 1
                elif c == 0: # if first column then goto next row
                    dxn = 1
                    r += 1
                else: # move to next element
                    r += 1
                    c -= 1
        
        return arr
                    
                    
