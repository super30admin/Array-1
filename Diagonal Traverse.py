# Time Complexity: O(n)
# Space Complexity: O(n)
# This code was passsed on LC:  no
# Problems: Not able to solve

class Solution:
    def findDiagonalOrder(self, matrix):
        
        r = 0
        c = 0
        direct = 1
        ans = []
        
        while r<len(matrix) and c<len(matrix[0]):
            ans.append(matrix[r][c])
            if direct==1:
                if r==0:
                    c += 1
                if c==len(matrix[0])-1:
                    r += 1