# Time Complexity : O(m*n) where m is the number of rows and n is the number of columns
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

'''
My approach:
If the diagonal is going up, move the pointers up and to the right.
If the diagonal is going down, move the pointers down and to the left.
Check for edge cases where the pointers reach the boundaries of the matrix.
'''
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])

        result = []

        i, j = 0, 0

        up = True
        for _ in range(m*n):
            result.append(mat[i][j])
            
            if up:
                if j == n-1: 
                    i+=1
                    up=False
                elif i == 0:
                    j+=1
                    up=False
                else:
                    i-=1
                    j+=1

            # Down
            else:
                if i == m-1:
                    j+=1
                    up=True
                elif j == 0:
                    i+=1
                    up=True
                else:
                    i+=1
                    j-=1

        return result
    