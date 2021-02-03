// Time Complexity : O(n*m)
// Space Complexity : O(n*matrix)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach: Make use of direction variable to change upward and downward direction

class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if(matrix==[]):
            return
        
        res=[]
        
        n= len(matrix)
        m=len(matrix[0])
        
        i=0
        j=0
        
        dir=1
        index=0
        
        while(index<n*m):
            
            res.append(matrix[i][j])
            index+=1
            
            if(dir==1):
                
                if(j==m-1):
                    i+=1
                    dir=-1
                elif(i==0):
                    j+=1
                    dir=-1
                else:
                    i-=1
                    j+=1
            
            else:
                
                if(i==n-1):
                    j+=1
                    dir=1
                elif(j==0):
                    i+=1
                    dir=1
                else:
                    i+=1
                    j-=1
        return(res)