class Solution:
    def findDiagonalOrder(self, mat: 'List[List[int]]') -> 'List[int]':
        
        if mat is None or len(mat) ==0: return 
        
        m = len(mat)
        n = len(mat[0])
        r,c = 0,0
         
        res = [0]*m*n 
        idx = 0
        dir1 = 1 #going upward dir -1 in downward dir
        
        while(idx < m*n):
            res[idx] = mat[r][c]
            idx += 1
            if (dir1 == 1):
                if c == n-1:
                    dir1 = -1
                    r +=1
                elif r==0:
                    dir1 = -1
                    c +=1
                else:
                    r -=1
                    c +=1
            #dir1 -1 case        
            else:
                if r == m-1:
                    dir1 = 1
                    c += 1
                elif c == 0:
                    dir1 = 1
                    r += 1
                else:
                    c -= 1
                    r += 1
            
        return res

s1 = Solution()
ar = [[1,2,3],[4,5,6],[7,8,9]]
print(s1.findDiagonalOrder(ar))
        
