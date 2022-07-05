class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        m=len(mat)
        n=len(mat[0])
        
        if m==1:
            return mat[0]
        
        index=0
        d=1
        r=0
        c=0
        result=[0 for _ in range(m*n)]
        
        while(index<m*n):
            
            result[index]=mat[r][c]
            index+=1
            
            if d==1:
                if c==n-1:
                    d=-1
                    r+=1
                    
                elif r==0:
                    d=-1
                    c+=1
                    
                else:
                    r-=1
                    c+=1
                    
            elif d==-1:
                if r==m-1:
                    d=1
                    c+=1
                    
                elif c==0:
                    d=1
                    r+=1
                
                else:
                    r+=1
                    c-=1
        
        return result