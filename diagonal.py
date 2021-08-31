# // Time Complexity :O(m*n) where m is the rown ,n is the column
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


# // Your code here along with comments explaining your approach




class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        direction=1
        li=[]
        
       
        i=0
        j=0
        for k in range((len(mat))*(len(mat[0]))):
           
            li.append(mat[i][j])
            if direction==1:
                if j==len(mat[0])-1:
                    i+=1
                    direction=-1
                elif i==0:
                   
                    j+=1
                    direction=-1
                else:
                    i-=1
                    j+=1
                
            else:
                if i==len(mat)-1:
                    j+=1
                    direction=1
                elif j==0:
                    i+=1
                    direction=1
                else:
                    i+=1
                    j-=1
                
                    
                
        return li
            
                
        
                    
            
            
        