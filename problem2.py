#Time Complexity : O(m*n) 
#Space Complexity :O(1)
#Did this code successfully run on Leetcode :Yes
#Any problem you faced while coding this :No

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        output =[]
        if (len(mat) == 0):
            return output
        m = len(mat) # number of cols
        n = len(mat[0])# number of rows
        idx,i,j,direction =0,0,0,1
        
        while(idx < n*m):
            output.append(mat[i][j])
            idx+=1
            
            if (direction==1):
                if(j == n-1):
                    direction=-1
                    i+=1
                    
                elif (i==0):
                    direction=-1
                    j+=1
                    
                else:
                    j+=1
                    i-=1
                    
            else:
                if(i == m-1):
                    direction= 1
                    j+=1
                    
                elif (j==0):
                    direction=1
                    i+=1
                    
                else:
                    j-=1
                    i+=1
            
        return output
                
