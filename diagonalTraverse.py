class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        
        if not mat:
            return 0
        
        m = len(mat)
        n = len(mat[0])
        i,r,c,dir = 0,0,0,1
        solution = []
        while i<m*n:
            solution.append(mat[r][c])
            
            if dir==1:
                if c==n-1:
                    r+=1
                    dir=-1
                elif r==0:
                    c+=1
                    dir=-1
                else:
                    r-=1
                    c+=1
            
            else:
                if r == m-1:
                    c+=1
                    dir=1
                elif c==0:
                    r+=1
                    dir=1
                else:
                    r+=1
                    c-=1
            i+=1
        
        return solution
    
#  Lone wolf problem, no set pattern, following the flow.
#  time complexity is O(mn) and space complexity is constant
        
        
        
