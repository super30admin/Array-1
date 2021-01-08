#Time Complexity :O(m*n)
#Space Complexity :O(m*n)
#Did this code successfully run on Leetcode :yes
#Any problem you faced while coding this : tried running sum.
class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if(matrix==None or len(matrix)==0):
            return []
        result=[]
        direct =1
        n=len(matrix)
        m=len(matrix[0])
        j=0
        i=0
        while(len(result)<m*n):
            
            result.append(matrix[i][j])
            if(direct==1):
                if(j==m-1):
                    i+=1
                    direct=-1
                elif(i==0):
                    j+=1
                    direct=-1
                else:
                    i-=1
                    j+=1
                    
            else:
                if(i==n-1):
                    j+=1
                    direct=1
                elif(j==0):
                    i+=1
                    direct=1
                else:
                    i+=1
                    j-=1
        return (result)
                
                