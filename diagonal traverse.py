from typing import List


class Solution:
    def findDiagonalOrder(self, mat: List[List[int]], result=None) -> List[int]:
        if len(mat)==0:
            return result
        r=0
        c=0
        direction=1 #main matrix pointers 
        m=len(mat)
        n=len(mat[0]) #main matrix direction
        result= [0]*(m*n)
        print(result)
        i=0
        while i<(m*n):#i=pointer for new matrix result
            result[i]=mat[r][c]
            
            #case1 :traverse up
            if direction==1:
                if c==(n-1):
                    r+=1
                    direction=-1
                elif r==0:
                    c+=1
                    direction=-1
                else:
                    r-=1
                    c+=1
            else:#traverse down
                if r==(m-1):
                    direction=1
                    c+=1
                elif c==0:
                    r+=1
                    direction=1
                else:
                    r+=1
                    c-=1
            i+=1
            
        return result
            
            
            
            
        
        
        