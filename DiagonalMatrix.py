# Time Complexity : O(MN)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
'''
The task is to understand how to reset i and j when they are about to go out of bounds. 
I use a boolean up to toggle between moving diagonlly up and diagonally down.
'''

# Your code here along with comments explaining your approach
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        i = 0
        j = 0
        m = len(mat)
        n = len(mat[0])
        
        idx = 0
        result = [0] * (m * n)
        
        up = True
        while idx < m * n:
            while up:
                result[idx] = mat[i][j]
                idx += 1
                if j + 1 >= n:
                    i = i + 1
                    up = False
                elif i - 1 < 0:
                    j = j + 1
                    up = False
                else:
                    i = i - 1
                    j = j + 1
            
            if idx == m * n:
                break
                
            while not up:
                result[idx] = mat[i][j]
                idx += 1
                if i + 1 >= m:
                    j = j + 1
                    up = True
                elif j - 1 < 0:
                    i = i + 1
                    up = True
                else:
                    i = i + 1
                    j = j - 1
        
        return result
                

