'''Time Complexity: O(mn)
Space Complexity: O(1)'''
class Solution(object):
    def findDiagonalOrder(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: List[int]
        """
        
        if len(mat)==0:
            return []
        
    
        #Say direction 1 as up and -1 as down
        direction=1
        
        m=len(mat)
        n=len(mat[0])
        
        idx=0
        result=[None for i in range(m*n)]
        
        i=0
        j=0
        
        while idx < (m*n):
            result[idx]=mat[i][j]
            idx+=1
            #For up direction
            if direction==1:
                #if row is 0 and col is not the last col
                if i==0 and j != n-1:
                    j+=1
                    direction=-1
                #if the col is last col
                elif j == n-1:
                    i+=1
                    direction=-1
                else:
                    i-=1
                    j+=1
            else:
                #if the col is 0 and row is not the last row
                if j == 0 and i != m-1:
                    i+=1
                    direction=1
                #if the row is last row
                elif i == m - 1:
                    j+=1
                    direction=1
                else:
                    i+=1
                    j-=1
        return result
                    
                    
                
        
        
