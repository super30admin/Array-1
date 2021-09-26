class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        # TC O(mn)
        # SC O(1)
        
        if mat is None or len(mat) == 0:
            return []
        m = len(mat)
        n = len(mat[0])
        res = [None] *m*n
        i = 0
        r =0 
        c = 0
        
        # Bottom to top
        dirs = 1
        while ( i < (m*n)):
            res[i] = mat[r][c]
            if dirs ==1:
                if c == n -1:
                    
                    # Change direction if you are in last column
                    dirs =  -1
                    r += 1
                elif r == 0:
                    dirs = -1
                    c += 1
                else:
                    r -=1
                    c += 1
            # Moving top to bottom   
            else:
                if r == m-1:
                    dirs = 1
                    c += 1
                elif c == 0:
                    dirs = 1
                    r += 1
                else:
                    r +=1
                    c -=1
            i +=1
        
        
 
        return res
