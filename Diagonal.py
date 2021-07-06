class Solution:
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if len(matrix)==0 or len(matrix[0])==0:
            return []
        m,n=len(matrix),len(matrix[0])
        
        r,c=0,0
        res=list()
        for i in range(m*n):
            res.append(matrix[r][c])
            if (r+c)%2==0:
                #going up
                if c==n-1:
                    r+=1
                elif r==0:
                    c+=1
                else:
                    r-=1
                    c+=1
            else:
                #going down
                if r==m-1:
                    c+=1
                
                elif c==0:
                    r+=1    
                else:
                    r+=1
                    c-=1
        return res
#Space Complexity O(1)
#Time Complexity O(m*n)