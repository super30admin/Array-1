class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat==None or len(mat)==0:return 
        m=len(mat)
        n=len(mat[0])
        result=[0 for i in range(n*m)]
        index=0
        r=0
        c=0
        dir1=1
        while(index<m*n):
            result[index]=mat[r][c]
            index+=1
            if(dir1==1):
                if(c==n-1):
                    dir1=-1
                    r+=1
                elif(r==0):
                    dir1=-1
                    c+=1
                else:
                    r-=1
                    c+=1
            else:
                if r==m-1:
                    dir1=1
                    c+=1
                elif(c==0):
                    dir1=1
                    r+=1
                else:
                    r+=1
                    c-=1
        return result
            