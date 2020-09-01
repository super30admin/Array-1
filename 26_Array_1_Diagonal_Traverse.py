#Time Complexity : O(n*m) where n is number of rows and the m is the number of cols  
#Space Complexity : O(n*m) n*m numbers we are storing in output array
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No 

#Your code here along with comments explaining your approach

class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if len(matrix)==0: 
            return []
        
        row=len(matrix)
        col=len(matrix[0])
        
        i,j,idx=0,0,0
        output=[]
        direc=True
        
        while len(output)<row*col: 
            output.append(matrix[i][j])
            
            if direc==True: 
                if j==col-1: 
                    direc=False
                    i+=1
                elif i==0: 
                    direc=False
                    j+=1
                else: 
                    i-=1
                    j+=1
            else: 
                if i==row-1: 
                    direc=True
                    j+=1
                elif j==0: 
                    direc=True
                    i+=1
                else: 
                    i+=1
                    j-=1
        return output            