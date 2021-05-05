#Running Time Complexity: O(mxn)
#Space Complexity: Constant or O(1)
#Successfully Run and Compiled on leetcode
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat == None and len(mat)==0:
            return []
        m = len(mat)
        n = len(mat[0])
        result = [0 for i in range(m*n)]
        dir = 1
        c,r,i = 0,0,0
        while i<m*n:
            result[i] = mat[r][c]
            if dir == 1:
                if c==n-1:
                    r +=1
                    dir = -1
                elif r==0:
                    c +=1 
                    dir = -1
                else:
                    r -=1
                    c +=1
            else:
                if r==m-1:
                    c +=1
                    dir = 1
                elif c==0:
                    r +=1 
                    dir = 1
                else:
                    r +=1
                    c -=1
            
            
            i +=1
        return result
                    
            