# time complexity : o(mn)
#space compleity : o(!)
class Solution(object):
    def findDiagonalOrder(self, mat):
        res = []
        
        m = len(mat)
        if m ==0 :
            return res
        
        n = len(mat[0])
        
        result = [0] *(m*n)
        
        r = 0
        c = 0
        
        for i in range(len(result)):
            result[i] = mat[r][c]
            
            if (r+c)%2 == 0:
                if c == n - 1:
                    r= r+ 1
                elif r ==0:
                    c = c+1 
                else:
                    r = r -1
                    c = c+1
                    
            else:
                  
                if r == m - 1:
                        c= c+ 1
                elif c ==0:
                    r = r+1 
                else:
                    c = c -1
                    r = r+1
                    
        return result