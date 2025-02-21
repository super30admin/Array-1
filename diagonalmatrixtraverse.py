class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        dir =1
        i,j = 0,0
        res=[]
        cnt=0
        while cnt<(len(mat)*len(mat[0])):
            res.append(mat[i][j])
            cnt+=1
            if dir==1:
                if j==len(mat[0])-1:
                    i+=1
                    dir=-1
                elif i==0:
                    j+=1
                    dir-=1                    
                else:
                    j+=1
                    i-=1
            else:
                if i==len(mat)-1:
                    j+=1
                    dir=1
                elif j==0:
                    i+=1
                    dir =1
                else:
                    i+=1
                    j-=1
            

        return res