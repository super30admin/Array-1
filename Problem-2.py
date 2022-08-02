# Time complexity : O(m*n)
# Space complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        r = 0
        c = 0
        dir = 1
        idx = 0
        n = len(mat[-1])
        m = len(mat)
        result = [0] * n * m
        
        while (idx <= len(result)-1):
            
            if dir == 1:
                result[idx] = mat[r][c]
                # traverse to next element in matrix
                if (c == n-1):
                    r += 1
                    dir = -1
                elif (r==0):
                    c+=1
                    dir = -1
                else:
                    r-=1
                    c+=1
                    dir = 1
                idx += 1
            else:
                result[idx] = mat[r][c]
                if (r==m-1):
                    c+=1
                    dir = 1
                elif (c==0):
                    r+=1
                    dir = 1
                else:
                    c-= 1
                    r+=1
                    dir = -1
                idx += 1
        return result
                    
