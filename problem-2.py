'''
Approach: Iterate over the matrix in 2 directions up and down. Start with up and check for boundary cases if row becomes 0 and/or col == n-1, change direction to down and change row and col until down corners are reached. Change direction to upward when row is n and/or c is 0. Continue till n*m

Time complexity:O(N*M)
Space Complexity: O(1) 

Passes all testcases in leetcode

'''
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        r = 0
        c = 0
        direction = 1
        m = len(mat)
        n = len(mat[0])
        res = []
        
        for i in range(m*n):
            
            res.append(mat[r][c])
            
            if (direction == 1):
                if(r == 0 and c != n-1):
                    direction = -1
                    c += 1
                elif c == n-1:
                    direction = -1
                    r += 1
                else:
                    r -= 1
                    c += 1

            else:
                if(c == 0 and r != m-1):
                    direction = 1
                    r += 1
                elif r == m-1:
                    direction = 1
                    c += 1
                else:
                    c -= 1
                    r += 1
        return res
        
            
                
        
