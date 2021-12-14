#time complexity: O(mxn)
#space complexity: O(1)

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if mat==None or len(mat)==0: return 0
        
        m=len(mat)
        n=len(mat[0])
        dir=1
        #dir=1 for upwards, dir=-1 for downwards
        ans=[None]*(m*n)
        i=0
        j=0
        index=0
        
        while(index<(m*n)):
            ans[index]=mat[i][j]
            index+=1
            
            if dir==1:
                if(j==n-1):
                    dir=-1
                    i+=1
                elif(i==0):
                    dir=-1
                    j+=1
                else:
                    i-=1
                    j+=1
                
            else:
                if(i==m-1):
                    dir=1
                    j+=1
                elif(j==0):
                    dir=1
                    i+=1
                else:
                    i+=1
                    j-=1
                    
        return ans
                