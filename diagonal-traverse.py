''' Time Complexity : O(m*n) 
    Space Complexity : O(1) 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this :  No

   Approach : If we reach top or right boundary: flip the direction to downward
              if at left and bottom boundary flip the direction to upward
              handle the edge case at corners
'''
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        rows=len(mat)
        cols=len(mat[0])
        result=[]
        flag=True
        r,c = 0, 0
        for i in range(rows*cols):
            result.append(mat[r][c])
            if flag:
                if c == cols-1:
                    r += 1
                    flag=False
                elif r == 0:
                    c += 1
                    flag =False
                else:
                    r -= 1
                    c += 1
            else:
                if r == rows-1:
                    c += 1
                    flag=True
                elif c == 0:
                    r += 1
                    flag =True
                else:
                    r += 1
                    c -= 1
                
        return result