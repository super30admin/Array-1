from typing import List
# Time Complexity : O(m*n), Where m,n are number of rows,columns in input matrix 
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english
class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        if(mat==None):
            return None
        m=len(mat)#Number of rows
        n=len(mat[0])#Number of cols
        #print(m,n)
        output=[]
        i,j=0,0
        direction=1
        for ind in range(m*n):
            output.append(mat[i][j])
            if(direction==1):
                #Upward direction
                if(j==n-1):
                    direction=-1
                    i+=1
                elif(i==0):
                    direction=-1
                    j+=1
                else:
                    i-=1
                    j+=1
            else:
                #Downward direction
                if(i==m-1):
                    direction=1
                    j+=1
                elif(j==0):
                    direction=1
                    i+=1
                else:
                    i+=1
                    j-=1
                    
        #print(output)       
        return output